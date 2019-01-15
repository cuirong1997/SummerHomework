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

import summer.domain.Cart;
import summer.domain.Good;
import summer.domain.Love;
import summer.domain.Order;
import summer.domain.User;
import summer.service.LoveService;

@Controller
public class LoveController {
	
	@Autowired
	@Qualifier("loveService")
	private LoveService loveService;
	
	@RequestMapping(value = "/intolove")
	public String save(int good_id,HttpSession session,HttpServletRequest request,Model model,Integer good_number,String love_mdd) {
		int user_id=(int) session.getAttribute("numb");//获取用户id
		Good good_1=loveService.selectGood(good_id);
		String love_name=good_1.getGood_name();
		int love_price=good_1.getGood_price()*good_number;
		String love_image=good_1.getGood_image();
		Love love=loveService.findGoodById(user_id, good_id);
		String love_status="待出库";
		//int b=0;
		//if (love != null) {
		//	b=love.getLove_number();
			//good_number=good_number+b;
		//	Love love3=loveService.updatecart(user_id, good_id, good_number);//如果存在则更新数量
	//	}else {			
			loveService.insertlove(user_id, good_id, good_number, love_name, love_price, love_mdd, love_status, love_image);
		//}
		List<Love> love_list=loveService.readlove(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("love_list", love_list);
		// 跳转到cart页面
		return "love";
	}
	
	@RequestMapping(value="/love")
	public String love(Model model,HttpSession session,HttpServletRequest request,
			 HttpServletResponse response){
		int user_id=(int) session.getAttribute("numb");
		List<Love> love_list=loveService.readlove(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("love_list", love_list);
		// 跳转到cart页面
		return "love";
	}
	
	@RequestMapping(value="/mlove")
	 public String main(Model model){
		// 获得所有物品
		List<Love> love_list =loveService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("love_list", love_list);
		// 跳转到shop页面
		return "mlove";
	}
	
	@RequestMapping(value="/updatelovestatus")
	public String updatestatus(Model model,
			Integer love_id,String love_status,HttpSession session,HttpServletResponse response)throws Exception{
		//String user_id=(String) session.getAttribute("numb");
		Love updatelovestatus=loveService.updatelovestatus(love_status, love_id);
		Love select=loveService.selectRecord(love_id);
		Integer user_id=select.getLove_uid();
		User user=loveService.selectuser(user_id);
		String user_email=user.getUser_email();
		User user2=loveService.sentemail(user_id, user_email);
		if(user2!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("您的爱心订单状态为："+select.getLove_status()+"");
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
				sendemail.addTo(user_email);
				sendemail.setFrom("13270331659@163.com");
				sendemail.setSubject("包拯--爱心订单状态通知");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
		}else{
			
			response.getWriter().println("密码获取失败");
			System.out.print("密码获取失败");
		}	
		List<Love> love_list =loveService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("love_list", love_list);
		// 跳转到shop页面
		return "mlove";
	}
	
	

}
