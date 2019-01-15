package summer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import summer.domain.Cart;
import summer.domain.Collect;
import summer.domain.Land;
import summer.service.CollectService;


@Controller
public class CollectController {
	
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;
	
	@RequestMapping(value = "/intocollect")
	public String save(int land_id,HttpSession session,HttpServletRequest request,Model model) {
		int user_id=(int) session.getAttribute("numb");//获取用户id
		Land land_1=collectService.selectLand(land_id);
		String land_name=land_1.getLand_name();
		int land_price=land_1.getLand_price();
		String land_image=land_1.getLand_image();
		Collect collect=collectService.findGoodById(user_id, land_id);
		//int b=0;
		if (collect != null) {
			//b=cart.getCart_number();
			//good_number=good_number+b;
			//Cart cart3=cartService.updatecart(user_id, good_id, good_number);//如果存在则更新数量
		}else {			
			collectService.insertcollect(user_id, land_id, land_name, land_price, land_image);
		}
		List<Collect> collect_list=collectService.readcollect(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("collect_list", collect_list);
		// 跳转到cart页面
		return "collect";
	}
	
	@RequestMapping(value="/interest")
	public String interest(){
		return "interest";
		
	}
	
	@RequestMapping(value="/rowdeletecol")
	public String rowdelete(Model model,HttpSession session,HttpServletRequest request,
			 HttpServletResponse response,Integer land_id){
		int user_id=(int) session.getAttribute("numb");
		collectService.rowdelete(user_id, land_id);
		List<Collect> collect_list=collectService.readcollect(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("collect_list", collect_list);
		// 跳转到cart页面
		return "collect";
	}
	
	@RequestMapping(value="/collect")
	public String collect(Model model,HttpSession session,HttpServletRequest request,
			 HttpServletResponse response){
		int user_id=(int) session.getAttribute("numb");
		List<Collect> collect_list=collectService.readcollect(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("collect_list", collect_list);
		// 跳转到cart页面
		return "collect";                                                                                
	}

}
