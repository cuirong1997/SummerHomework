package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.Collect;
import summer.domain.Land;


public interface CollectMapper {
	
	@Select("select * from tb_land where land_id=#{land_id}")
	Land selectLand(@Param("land_id")int land_id);
	
	@Insert("insert into tb_collect(collect_uid,collect_lid,collect_name,collect_price,collect_image) values(#{user_id},#{land_id},#{land_name},#{land_price},#{land_image})")
	void insertcollect(@Param("user_id")int user_id,@Param("land_id")int land_id,
			@Param("land_name")String land_name,@Param("land_price")int land_price,@Param("land_image")String land_image);
	
	@Select("select * from tb_collect where collect_uid=#{user_id}")
	List<Collect> readcollect(@Param("user_id")int user_id);

	//@Select("update tb_collect set collect_number=#{collect_number} where collect_uid=#{user_id} and collect_lid=#{land_id}")
	//Collect updatecollect(@Param("user_id")int user_id,@Param("good_id")Integer good_id,@Param("good_number")Integer good_number);
	
	@Select("select * from tb_collect where collect_uid=#{user_id} and collect_name=#{land_name}")
	Collect getAll(@Param("user_id")int user_id,@Param("land_name")String land_name);
	
	@Delete("delete from tb_collect where collect_uid=#{user_id}")
	void deletecart(@Param("user_id")int user_id);
	
	@Select("select * from tb_collect where collect_uid=#{user_id} and collect_lid=#{land_id}")
	Collect findGoodById(@Param("user_id")int user_id,@Param("land_id")int land_id);
	
	@Delete("delete from tb_collect where collect_uid=#{user_id} and collect_lid=#{land_id}")
	void rowdelete(@Param("user_id")int user_id,@Param("land_id")int land_id);
	

}
