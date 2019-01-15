package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import summer.domain.Good;
import summer.domain.Land;

public interface GoodMapper {
	
	@Select("select * from tb_good")
	List<Good> findAll();
	
	@Select("select * from tb_good where good_id=#{good_id}")
	Good selectById(@Param("good_id") int good_id);
	
	@Select("select * from tb_land")
	List<Land> findAll1();
	
	@Select("insert into tb_good(good_name,good_dx,good_time,good_distance,good_area,good_remark,good_price,good_store,good_sell,good_detail,good_contain,good_image,good_image1,good_image2,good_love) "
			+ "values(#{name},#{dx},#{time},#{distance},#{area},#{remark},#{price},#{store},#{sell},#{detail},#{contain},#{image},#{image1},#{image2},#{love})")
	Good addgood(@Param("name")String name,@Param("dx")String dx,
			@Param("time") String time,@Param("distance") String distance,@Param("area") String area,@Param("remark") String remark,
			@Param("price") int price,@Param("store") int store,@Param("sell") int sell,@Param("detail") String detail,
			@Param("contain") String contain,@Param("image") String image,@Param("image1") String image1,@Param("image2") String image2,@Param("love") int love);
	
	@Update("update tb_good set good_name=#{name},good_dx=#{dx},good_area=#{area},good_store=#{store},good_price=#{price} where good_id=#{id}")
	void updategood(@Param("id")int id,@Param("name")String name,@Param("dx")String dx,@Param("area")String area,@Param("store")int store,@Param("price")int price);
	
	@Delete("delete from tb_good where good_id=#{id}")
	void deletegood(@Param("id")int id);
	
	@Select("select * from tb_good where good_love=#{love}")
	List<Good> findAll2(@Param("love")int love);

}
