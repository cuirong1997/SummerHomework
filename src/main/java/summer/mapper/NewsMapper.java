package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.News;

public interface NewsMapper {
	
	@Select("select * from tb_news")
	List<News> findAll();
	
	@Select("insert into tb_news(news_name,news_href,news_time) values(#{news_name},#{news_href},#{news_time})")
	News insertnews(@Param("news_name")String news_name,@Param("news_href")String news_href,@Param("news_time") String news_time);

	@Delete("delete from tb_news where news_id=#{id}")
	void deletenews(@Param("id")int id);
}
