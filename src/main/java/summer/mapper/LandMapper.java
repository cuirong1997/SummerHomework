package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import summer.domain.Land;


public interface LandMapper {
	
	@Select("select * from tb_land")
	List<Land> findAll();
	
	@Select("select * from tb_land where land_id=#{land_id}")
	Land selectById(@Param("land_id") int land_id);
	
	@Delete("delete from tb_land where land_id=#{id}")
	void deleteland(@Param("id")int id);
	
	@Insert("insert into tb_land(land_name,land_output,land_place,land_kind,land_area,land_remark,land_price,land_image,land_image1,land_image2,land_rimage) values"
			+ "(land_name=#{name},land_output=#{output},land_place=#{place},land_kind=#{kind},land_area=#{area},land_remark=#{remark},"
			+ "land_price=#{price},land_image=#{image},land_image1=#{image1},land_image2=#{image2},land_rimage=#{rimage})")
	void addland(@Param("name")String name,@Param("output")String output,@Param("place")String place,@Param("kind")String kind,@Param("area")String area,@Param("remark")String remark,
			@Param("price")int price,@Param("image")String image,@Param("image1")String image1,@Param("image2")String image2,@Param("rimage")String rimage);
	
	@Update("update tb_land set land_name=#{name},land_output=#{output},land_place=#{place},land_kind=#{kind},land_area=#{area},land_remark=#{remark},land_price=#{price} where land_id=#{id}")
	void updategood(@Param("id")Integer id,@Param("name")String name,@Param("output")String output,@Param("place")String place,@Param("kind")String kind,@Param("area")String area,@Param("remark")String remark,@Param("price")int price);
}
