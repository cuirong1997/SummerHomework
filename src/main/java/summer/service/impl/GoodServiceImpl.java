package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.service.GoodService;
import summer.domain.Good;
import summer.domain.Land;
import summer.mapper.GoodMapper;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodService")
public class GoodServiceImpl implements GoodService{
	
	@Autowired
	private GoodMapper goodMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAll() {
		// TODO Auto-generated method stub
		return goodMapper.findAll();
	}

	@Override
	public Good selectById(int good_id) {
		// TODO Auto-generated method stub
		return goodMapper.selectById(good_id);
	}

	@Override
	public List<Land> getAll1() {
		// TODO Auto-generated method stub
		return goodMapper.findAll1();
	}

	@Override
	public Good addgood(String name, String dx, String time, String distance, String area, String remark,
			int price, int store, int sell, String detail, String contain, String image, String image1,
			String image2,int love) {
		// TODO Auto-generated method stub
		return goodMapper.addgood(name, dx, time, distance, area, remark, price, store, sell, detail, contain, image, image1, image2,love);
	}

	@Override
	public void updategood(int id, String name, String dx, String area, int store, int price) {
		// TODO Auto-generated method stub
		goodMapper.updategood(id, name, dx, area, store, price);
	}

	@Override
	public void deletegood(int id) {
		// TODO Auto-generated method stub
		goodMapper.deletegood(id);
	}

	@Override
	public List<Good> getAll2(int love) {
		// TODO Auto-generated method stub
		return goodMapper.findAll2(love);
	}

	
	

}
