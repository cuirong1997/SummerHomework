package summer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import summer.domain.Comment;
import summer.domain.Good;
import summer.domain.Land;
import summer.service.LandService;


@Controller
public class LandController {
	
	@Autowired
	@Qualifier("landService")
	private LandService landService;
	
	@RequestMapping(value="/litem")
	public String item(HttpServletRequest request,Model model,int land_id){
			//String id=request.getParameter("id");
		Land litem1=landService.selectById(land_id);
		model.addAttribute("litem1",litem1 );
		return "litem";
		}
	
	@RequestMapping(value="/addland")
	public String addland(){
		return "addland";
		
	}
	
	@RequestMapping(value="/updateland")
	 public String updategood(Model model){
		// 获得所有物品
		List<Land> land_list = landService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("land_list", land_list);
		// 跳转到shop页面
		return "updateland";
	}
	
	@RequestMapping(value="/deleteland")
	 public String deleteland(Model model,int id){
		landService.deleteland(id);
		// 获得所有物品
		List<Land> land_list = landService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("land_list", land_list);
		// 跳转到shop页面
		return "updateland";
	}
	
	@RequestMapping(value="/ladd")
	 public String addland(Model model,String name, String output, String place, String kind, String area, String remark, int price,
				String image, String image1, String image2, String rimage){
		landService.addland(name, output, place, kind, area, remark, price, image, image1, image2, rimage);
		// 获得所有物品
		List<Land> land_list = landService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("land_list", land_list);
		// 跳转到shop页面
		return "updateland";
	}
	
	@RequestMapping(value="/lupdate")
	 public String lupdate(Model model,Integer id, String name, String output, String place, String kind, String area, String remark, int price){
		landService.updategood(id, name, output, place, kind,area, remark, price);;
		// 获得所有物品
		List<Land> land_list = landService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("land_list", land_list);
		// 跳转到shop页面
		return "updateland";
	}
	
	@RequestMapping(value="/allland")
	 public String allland(Model model){
		// 获得所有物品
		List<Land> land_list = landService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("land_list", land_list);
		// 跳转到shop页面
		return "allland";
	}

}
