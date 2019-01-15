package summer.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import summer.domain.Comment;
import summer.domain.Good;
import summer.service.CommentService;

@Controller
public class CommentController {
	
	@Autowired
	@Qualifier("commentService")
	private CommentService commentService;
	
	@RequestMapping(value="/addcom")
	public String addcomment(Model model,HttpSession session,
			Integer good_id,String com_con){
		int user_id=(int) session.getAttribute("numb");//获取用户id
		commentService.addcomment(user_id, good_id, com_con);
		List<Comment> comment_list = commentService.findComByGId(good_id);
		// 将物品集合添加到model当中
		model.addAttribute("comment_list", comment_list);
		return "comment";
	}
	
	@RequestMapping(value="/comment")
	 public String main(Model model,Integer good_id){
		// 获得所有物品
		List<Comment> comment_list = commentService.findComByGId(good_id);
		// 将物品集合添加到model当中
		model.addAttribute("comment_list", comment_list);
		return "comment";
	}
	
	@RequestMapping(value="/mcomment")
	 public String mcomment(Model model){
		// 获得所有物品
		List<Comment> comment= commentService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("comment", comment);
		return "mcomment";
	}
	
	@RequestMapping(value="/deletecom")
	 public String deletecom(Model model,int id){
		commentService.deletecom(id);
		// 获得所有物品
		List<Comment> comment= commentService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("comment", comment);
		return "mcomment";
	}

}
