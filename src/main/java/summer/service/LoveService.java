package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import summer.domain.Good;
import summer.domain.Love;
import summer.domain.User;

public interface LoveService {
	
	Good selectGood(int good_id);
	
	Love findGoodById(int user_id,int good_id);
	
	Love updatecart(int user_id,Integer good_id,Integer good_number);

	void insertlove(int user_id,int good_id,int good_number,String love_name,int love_price,String love_mdd,String love_status,String love_image);

	List<Love> readlove(int user_id);
	
	List<Love> getAll();
	
	Love updatelovestatus(String love_status,Integer love_id);
	
	Love selectRecord(int love_id);
	
	User selectuser(Integer user_id);
	
	User sentemail(Integer user_id,String user_email);

}
