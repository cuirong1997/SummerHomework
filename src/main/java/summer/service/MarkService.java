package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import summer.domain.Mark;
import summer.domain.Order;

public interface MarkService {
	
	Mark findOrderById(int order_id);
	
	Mark updatemark(String mark_wl,String mark_zl,String mark_fw,int order_id);
	
	void insertmark(int user_id,int order_id,String mark_wl,String mark_zl,String mark_fw);
	
	List<Mark> readmark(int user_id);
	
	List<Mark> getAll();

	Order findByOId(int order_id);
}
