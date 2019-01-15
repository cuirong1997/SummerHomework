package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.domain.News;
import summer.mapper.NewsMapper;
import summer.service.NewsService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("newsService")
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public List<News> getAll() {
		// TODO Auto-generated method stub
		return newsMapper.findAll();
	}

	@Override
	public News insertnews(String news_name, String news_href, String news_time) {
		// TODO Auto-generated method stub
		return newsMapper.insertnews(news_name, news_href, news_time);
	}

	@Override
	public void deletenews(int id) {
		// TODO Auto-generated method stub
		newsMapper.deletenews(id);
	}

}
