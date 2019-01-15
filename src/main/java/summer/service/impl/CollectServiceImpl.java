package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.domain.Collect;
import summer.domain.Land;
import summer.mapper.CollectMapper;
import summer.service.CollectService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService{
	
	@Autowired
	private CollectMapper collectMapper;

	@Override
	public Land selectLand(int land_id) {
		// TODO Auto-generated method stub
		return collectMapper.selectLand(land_id);
	}

	@Override
	public void insertcollect(int user_id, int land_id, String land_name, int land_price, String land_image) {
		// TODO Auto-generated method stub
		collectMapper.insertcollect(user_id, land_id, land_name, land_price, land_image);
	}

	@Override
	public List<Collect> readcollect(int user_id) {
		// TODO Auto-generated method stub
		return collectMapper.readcollect(user_id);
	}

	@Override
	public Collect getAll(int user_id, String land_name) {
		// TODO Auto-generated method stub
		return collectMapper.getAll(user_id, land_name);
	}

	@Override
	public void deletecart(int user_id) {
		// TODO Auto-generated method stub
		collectMapper.deletecart(user_id);
	}

	@Override
	public Collect findGoodById(int user_id, int land_id) {
		// TODO Auto-generated method stub
		return collectMapper.findGoodById(user_id, land_id);
	}

	@Override
	public void rowdelete(int user_id, int land_id) {
		// TODO Auto-generated method stub
		collectMapper.rowdelete(user_id, land_id);
	}

}
