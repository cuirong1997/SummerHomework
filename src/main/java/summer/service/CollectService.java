package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.Collect;
import summer.domain.Land;

public interface CollectService {
	
	Land selectLand(int land_id);
	
	void insertcollect(int user_id,int land_id,String land_name,int land_price,String land_image);
	
	List<Collect> readcollect(int user_id);

	//@Select("update tb_collect set collect_number=#{collect_number} where collect_uid=#{user_id} and collect_lid=#{land_id}")
	//Collect updatecollect(@Param("user_id")int user_id,@Param("good_id")Integer good_id,@Param("good_number")Integer good_number);
	
	Collect getAll(int user_id,String land_name);
	
	void deletecart(int user_id);
	
	Collect findGoodById(int user_id,int land_id);
	
	void rowdelete(int user_id,int land_id);

}
