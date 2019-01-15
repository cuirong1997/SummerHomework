package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import summer.domain.Good;
import summer.domain.Land;

public interface GoodService {
	List<Good> getAll();
	
	Good selectById(int good_id);
	
	List<Land> getAll1();
	
	Good addgood(String name,String dx,String time,String distance,String area,String remark,
			int price,int store,int sell,String detail,String contain,String image,String image1,String image2,int love);
	
	void updategood(int id,String name,String dx,String area,int store,int price);
	
	void deletegood(int id);
	
	List<Good> getAll2(int love);

}
