package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import summer.domain.Land;


public interface LandService {
	
	List<Land> getAll();
	
	Land selectById(int land_id);
	
	void deleteland(int id);
	
	void addland(String name,String output,String place,String kind,String area,String remark,
			int price,String image,String image1,String image2,String rimage);

	void updategood(Integer id,String name,String output,String place,String kind,String area,String remark,int price);
	
}
