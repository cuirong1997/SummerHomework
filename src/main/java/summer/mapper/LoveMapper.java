package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.Love;
import summer.domain.Order;
import summer.domain.User;
import summer.domain.Cart;
import summer.domain.Good;

public interface LoveMapper {
	
	@Select("select * from tb_good where good_id=#{good_id}")
	Good selectGood(@Param("good_id")int good_id);
	
	@Select("select * from tb_love where love_uid=#{user_id} and love_gid=#{good_id}")
	Love findGoodById(@Param("user_id")int user_id,@Param("good_id")int good_id);
	
	@Select("update tb_love set love_number=#{good_number} where love_uid=#{user_id} and love_gid=#{good_id}")
	Love updatecart(@Param("user_id")int user_id,@Param("good_id")Integer good_id,@Param("good_number")Integer good_number);

	@Insert("insert into tb_love(love_uid,love_gid,love_name,love_number,love_price,love_mdd,love_status,love_image) values(#{user_id},#{good_id},#{love_name},#{good_number},#{love_price},#{love_mdd},#{love_status},#{love_image})")
	void insertlove(@Param("user_id")int user_id,@Param("good_id")int good_id,@Param("good_number")int good_number,
			@Param("love_name")String love_name,@Param("love_price")int love_price,@Param("love_mdd")String love_mdd,@Param("love_status")String love_status,@Param("love_image")String love_image);

	@Select("select * from tb_love where love_uid=#{user_id}")
	List<Love> readlove(@Param("user_id")int user_id);
	
	@Select("select * from tb_love")
	List<Love> findAll();
	
	@Select("update tb_love set love_status=#{love_status} where love_id=#{love_id}")
	Love updatelovestatus(@Param("love_status")String love_status,@Param("love_id")Integer love_id);

	@Select("select * from tb_love where love_id=#{love_id}")
	Love selectRecord(@Param("love_id")int love_id);
	
	@Select("select * from tb_user where user_id=#{user_id}")
	User selectuser(@Param("user_id")Integer user_id);
	
	@Select("select * from tb_user where user_id= #{user_id} and user_email = #{user_email}")
	User sentemail(@Param("user_id")Integer user_id,
			@Param("user_email") String user_email);
}
