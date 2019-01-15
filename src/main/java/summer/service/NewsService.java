package summer.service;

import java.util.List;


import summer.domain.News;

public interface NewsService {
	List<News> getAll();
	
	News insertnews(String news_name,String news_href,String news_time);
	
	void deletenews(int id);

}
