package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import summer.domain.Cart;
import summer.domain.Good;

public interface CartService {
	Good selectGood(int good_id);
	
	void insertcart(int user_id,int good_id,int good_number,String cart_gname,
			int cart_price,String cart_image);
	
	Cart updatecart(int user_id,Integer good_id,Integer good_number);
	
	List<Cart> readcart(int user_id);

	Cart getAll(int user_id,String good_name);
	
	void deletecart(int user_id);
	
	Cart findGoodById(int user_id,int good_id);
	
	void rowdelete(int user_id,int good_id);

}
