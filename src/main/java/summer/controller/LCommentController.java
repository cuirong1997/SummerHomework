package summer.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import summer.domain.Comment;
import summer.domain.LComment;
import summer.service.LCommentService;


@Controller
public class LCommentController {
	
	@Autowired
	@Qualifier("lcommentService")
	private LCommentService lcommentService;
	
	@RequestMapping(value="/addlcom")
	public String addcomment(Model model,HttpSession session,
			Integer land_id,String com_con){
		System.out.println("11111");
		int user_id=(int) session.getAttribute("numb");//获取用户id
		System.out.println("2222");
		lcommentService.addlcomment(user_id, land_id, com_con);
		System.out.println("3333");
		List<LComment> lcomment_list = lcommentService.findComByLId(land_id);
		System.out.println("4444");
		// 将物品集合添加到model当中
		model.addAttribute("lcomment_list", lcomment_list);
		System.out.println("5555");
		return "lcomment";
	}
	
	@RequestMapping(value="/lcomment")
	 public String main(Model model,Integer land_id){
		// 获得所有物品
		List<LComment> lcomment_list = lcommentService.findComByLId(land_id);
		// 将物品集合添加到model当中
		model.addAttribute("lcomment_list", lcomment_list);
		return "lcomment";
	}

}
