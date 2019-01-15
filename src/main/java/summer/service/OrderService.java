package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.Cart;
import summer.domain.Good;
import summer.domain.Order;
import summer.domain.User;

public interface OrderService {
	List<Order> getAll();
	
	Good selectGood(Integer good_id);
	
	void insertorder(Integer user_id,Integer good_id,String order_name,int order_price,
			int good_number,String order_image,String order_address,String order_status);
	
	Order findGoodById(Integer user_id,Integer good_id);
	
	Order updatenumber(Integer user_id,Integer good_id,Integer good_number);
	
	List<Order> readorder(Integer user_id);
	
	Order updatestatus(String order_status,Integer order_id);
	
	List<Order> selectById(int order_id);
	
	Good updatestandse(int good_store,int good_sell,Integer good_id);
	
	Order selectRecord(int order_id);
	
	User selectuser(Integer user_id);
	
	User sentemail(Integer user_id,String user_email);
	
	

}
