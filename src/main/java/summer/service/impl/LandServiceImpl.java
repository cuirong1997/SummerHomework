package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.domain.Land;
import summer.mapper.LandMapper;
import summer.service.LandService;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("landService")
public class LandServiceImpl implements LandService{
	
	@Autowired
	private LandMapper landMapper;

	@Override
	public List<Land> getAll() {
		// TODO Auto-generated method stub
		return landMapper.findAll();
	}

	@Override
	public Land selectById(int land_id) {
		// TODO Auto-generated method stub
		return landMapper.selectById(land_id);
	}

	@Override
	public void deleteland(int id) {
		// TODO Auto-generated method stub
		landMapper.deleteland(id);
	}

	@Override
	public void addland(String name, String output, String place, String kind, String area, String remark, int price,
			String image, String image1, String image2, String rimage) {
		// TODO Auto-generated method stub
		landMapper.addland(name, output, place, kind, area, remark, price, image, image1, image2, rimage);
	}

	@Override
	public void updategood(Integer id, String name, String output, String place, String kind,String area, String remark, int price) {
		// TODO Auto-generated method stub
		landMapper.updategood(id, name, output, place, kind,area, remark, price);
	}

}
