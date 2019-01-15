package summer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import summer.domain.Comment;
import summer.domain.User;
import summer.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session,HttpServletRequest request,
			 HttpServletResponse response){
		request.getSession().setAttribute("numb","未登录");
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			request.getSession().setAttribute("numb",user.getUser_id());
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发ss到main请求
			mv.setView(new RedirectView("index"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message","用户名或密码输入错误");
			mv.setViewName("login");
		}
		return mv;
	}
	
	
	@RequestMapping(value="/enrollbutton")
	public String enroll(){
		return "enroll";
		
	}
	
	@RequestMapping(value="/intouser")
	public ModelAndView enroll(ModelAndView mv,String user_name,
			String user_email,String user_sfid,String user_tel,String user_pwd,String user_address){
		User enroll=userService.insertuser(user_name, user_email, user_sfid, user_tel, user_pwd, user_address);
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value="/muser")
	 public String muser(Model model){
		// 获得所有物品
		List<User> user_list = userService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("user_list", user_list);
		return "muser";
	}
	
	@RequestMapping(value="/deleteuser")
	 public String deletecom(Model model,int id){
		userService.deleteuser(id);
		// 获得所有物品
		List<User> user_list = userService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("user_list", user_list);
		return "muser";
	}
	
	@RequestMapping(value="/emailback")
	public String emailback(){
		return "emailback";
		
	}
	
	@RequestMapping(value="/findpwdemail")
	 public ModelAndView findpwdemail(String loginname,String email,ModelAndView mv,HttpSession session,HttpServletResponse response) throws Exception{		
		User user=userService.findWithLoginnameAndEmail(loginname, email);
		if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("您的密码是："+user.getUser_pwd()+"");
			builder.append("");
			builder.append(""+url+"");
			
			System.out.print("builder输出");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("13270331659@163.com","123456cr");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("13270331659@163.com");
				sendemail.setSubject("包拯--找回密码");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
			
//			response.sendRedirect("loginForm");
			mv.setViewName("login");
		
		}else{
			
			response.getWriter().println("密码获取失败");
			System.out.print("密码获取失败");
		}	
		return mv;
	}
	
	@RequestMapping(value="/p-update")
	public String pupdate(){
		return "p-update";
		
	}
	
	@RequestMapping(value="/updatepwd")
	public ModelAndView updatepwd(ModelAndView mv,HttpSession session,HttpServletRequest request,String password){
		int user_id=(int) session.getAttribute("numb");//获取用户id
		userService.updatepwd(password, user_id);
		mv.setViewName("login");
		return mv;
	}
	
	
	

	
	

}
