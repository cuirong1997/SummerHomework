package summer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import summer.domain.Manager;
import summer.service.ManagerService;

@Controller
public class ManagerController {
	
	@Autowired
	@Qualifier("managerService")
	private ManagerService managerService;
	
	@RequestMapping(value="/mlogin")
	 public ModelAndView mlogin(
			 String managername,String managerpwd,
			 ModelAndView mv,
			 HttpSession session,HttpServletRequest request,
			 HttpServletResponse response){
		request.getSession().setAttribute("numb",0);
		// 根据登录名和密码查找用户，判断用户登录
		Manager manager = managerService.mlogin(managername, managerpwd);
		if(manager != null){
			request.getSession().setAttribute("numb",manager.getManager_id());
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("manager", manager);
			// 转发ss到main请求
			mv.setView(new RedirectView("mindex"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("mlogin");
		}
		return mv;
	}
	
	@RequestMapping(value="/mindex")
	public String mindex(){
		return "mindex";
		
	}
	
	@RequestMapping(value="/aboutus")
	public String aboutus(){
		return "aboutus";
		
	}

}
