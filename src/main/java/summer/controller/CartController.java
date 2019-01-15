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
import summer.domain.Good;
import summer.service.CartService;

@Controller
public class CartController {
	
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	
	@RequestMapping(value = "/intocart")
	public String save(int good_id,HttpSession session,HttpServletRequest request,Model model,Integer good_number) {
		int user_id=(int) session.getAttribute("numb");//获取用户id
		Good good_1=cartService.selectGood(good_id);
		String cart_gname=good_1.getGood_name();
		int cart_price=good_1.getGood_price();
		String cart_image=good_1.getGood_image();
		Cart cart=cartService.findGoodById(user_id, good_id);
		int b=0;
		if (cart != null) {
			b=cart.getCart_number();
			good_number=good_number+b;
			Cart cart3=cartService.updatecart(user_id, good_id, good_number);//如果存在则更新数量
		}else {			
			cartService.insertcart(user_id, good_id, good_number, cart_gname, cart_price, cart_image);
		}
		List<Cart> cart_list=cartService.readcart(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	
	@RequestMapping(value="rowupdate")
	public String rowupdate(Model model,
			Integer good_id,Integer good_number,HttpSession session){
		int user_id=(int) session.getAttribute("numb");
		Cart updatecart=cartService.updatecart(user_id, good_id, good_number);
		List<Cart> cart_list=cartService.readcart(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	
	@RequestMapping(value="/rowdelete")
	public String rowdelete(Model model,HttpSession session,HttpServletRequest request,
			 HttpServletResponse response,Integer good_id){
		int user_id=(int) session.getAttribute("numb");
		cartService.rowdelete(user_id, good_id);;
		List<Cart> cart_list=cartService.readcart(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}

	@RequestMapping(value="/cart")
	public String cart(Model model,HttpSession session,HttpServletRequest request,
			 HttpServletResponse response){
		int user_id=(int) session.getAttribute("numb");
		List<Cart> cart_list=cartService.readcart(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
}
