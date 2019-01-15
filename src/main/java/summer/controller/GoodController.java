package summer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import summer.domain.Good;
import summer.domain.Land;
import summer.service.GoodService;

@Controller
public class GoodController {
	
	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;
	
	@RequestMapping(value="/index")
	 public String main(Model model){
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		List<Land> land_list = goodService.getAll1();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		model.addAttribute("land_list", land_list);
		// 跳转到shop页面
		return "index";
	}
	
	@RequestMapping(value="/item")
	public String item(HttpServletRequest request,Model model,int good_id){
			//String id=request.getParameter("id");
		Good item1=goodService.selectById(good_id);
		model.addAttribute("item1",item1 );
		return "item";
		}
	
	@RequestMapping(value="/addgood")
	public String addgood(){
		return "addgood";
		
	}
	
	@RequestMapping(value="/add")
	 public String addgood(Model model,String name, String dx, String time, String distance, String area, String remark,
			 int price, int store,String detail, String contain, String image, String image1,
				String image2,int love){
		int sell=0;
		Good addgood=goodService.addgood(name, dx, time, distance, area, remark, price, store, sell, detail, contain, image, image1, image2,love);
		// 获得所有物品
		List<Good> good_list =goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "updategood";
	}
	
	@RequestMapping(value="/updategood")
	 public String updategood(Model model){
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "updategood";
	}
	
	@RequestMapping(value="/update")
	 public String update(Model model,int id, String name, String dx, String area, int store, int price){
		goodService.updategood(id, name, dx, area, store, price);
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "updategood";
	}
	
	@RequestMapping(value="/delete")
	 public String delete(Model model,int id){
		goodService.deletegood(id);
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "updategood";
	}
	
	@RequestMapping(value="/allgood")
	 public String allgood(Model model){
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "allgood";
	}
	
	@RequestMapping(value="/alllove")
	 public String alllove(Model model){
		// 获得所有物品
		int love=1;
		List<Good> good_list = goodService.getAll2(love);
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "alllove";
	}
	
	@RequestMapping(value="/itemlove")
	public String itemlove(HttpServletRequest request,Model model,int good_id){
			//String id=request.getParameter("id");
		Good item1=goodService.selectById(good_id);
		model.addAttribute("item1",item1 );
		return "itemlove";
		}

}
