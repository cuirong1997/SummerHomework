package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.Cart;
import summer.domain.Good;

public interface CartMapper {
	
	@Select("select * from tb_good where good_id=#{good_id}")
	Good selectGood(@Param("good_id")int good_id);
	
	@Insert("insert into tb_cart(cart_uid,cart_gid,cart_gname,cart_number,cart_price,cart_image) values(#{user_id},#{good_id},#{cart_gname},#{good_number},#{cart_price},#{cart_image})")
	void insertcart(@Param("user_id")int user_id,@Param("good_id")int good_id,@Param("good_number")int good_number,
			@Param("cart_gname")String cart_gname,@Param("cart_price")int cart_price,@Param("cart_image")String cart_image);
	
	@Select("select * from tb_cart where cart_uid=#{user_id}")
	List<Cart> readcart(@Param("user_id")int user_id);

	@Select("update tb_cart set cart_number=#{good_number} where cart_uid=#{user_id} and cart_gid=#{good_id}")
	Cart updatecart(@Param("user_id")int user_id,@Param("good_id")Integer good_id,@Param("good_number")Integer good_number);
	
	@Select("select * from tb_cart where cart_uid=#{user_id} and cart_gname=#{good_name}")
	Cart getAll(@Param("user_id")int user_id,@Param("good_name")String good_name);
	
	@Delete("delete from tb_cart where cart_uid=#{user_id}")
	void deletecart(@Param("user_id")int user_id);
	
	@Select("select * from tb_cart where cart_uid=#{user_id} and cart_gid=#{good_id}")
	Cart findGoodById(@Param("user_id")int user_id,@Param("good_id")int good_id);
	
	@Delete("delete from tb_cart where cart_uid=#{user_id} and cart_gid=#{good_id}")
	void rowdelete(@Param("user_id")int user_id,@Param("good_id")int good_id);
	

}
