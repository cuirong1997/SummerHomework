package summer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import summer.domain.Good;
import summer.domain.Land;
import summer.domain.News;
import summer.domain.User;
import summer.service.NewsService;

@Controller
public class NewsController {
	
	@Autowired
	@Qualifier("newsService")
	private NewsService newsService;
	
	@RequestMapping(value="/news")
	 public String main(Model model){
		// 获得所有物品
		List<News> news_list = newsService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("news_list", news_list);
		// 跳转到shop页面
		return "news";
	}
	
	@RequestMapping(value="/mnews")
	 public String mnews(Model model){
		// 获得所有物品
		List<News> news_list = newsService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("news_list", news_list);
		return "mnews";
	}
	
	@RequestMapping(value="/addnews")
	public String addnews(){
		return "addnews";
		
	}
	
	@RequestMapping(value="/intonews")
	 public String intonews(Model model,String news_name,String news_href,String news_time){
	
		News news=newsService.insertnews(news_name, news_href, news_time);
		// 获得所有物品
		List<News> news_list = newsService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("news_list", news_list);
		return "mnews";
	}
	
	@RequestMapping(value="/deletenews")
	 public String deletenews(Model model,int id){
		newsService.deletenews(id);
		// 获得所有物品
		List<News> news_list = newsService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("news_list", news_list);
		return "mnews";
	}
}
