package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.domain.Good;
import summer.domain.Love;
import summer.domain.User;
import summer.mapper.LoveMapper;
import summer.service.LoveService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("loveService")
public class LoveServiceImpl implements LoveService{
	
	@Autowired
	private LoveMapper loveMapper;

	@Override
	public Good selectGood(int good_id) {
		// TODO Auto-generated method stub
		return loveMapper.selectGood(good_id);
	}

	@Override
	public Love findGoodById(int user_id, int good_id) {
		// TODO Auto-generated method stub
		return loveMapper.findGoodById(user_id, good_id);
	}

	@Override
	public Love updatecart(int user_id, Integer good_id, Integer good_number) {
		// TODO Auto-generated method stub
		return loveMapper.updatecart(user_id, good_id, good_number);
	}

	

	@Override
	public List<Love> readlove(int user_id) {
		// TODO Auto-generated method stub
		return loveMapper.readlove(user_id);
	}

	@Override
	public void insertlove(int user_id, int good_id, int good_number, String love_name, int love_price, String love_mdd,
			String love_status, String love_image) {
		// TODO Auto-generated method stub
		loveMapper.insertlove(user_id, good_id, good_number, love_name, love_price, love_mdd, love_status, love_image);
	}

	@Override
	public List<Love> getAll() {
		// TODO Auto-generated method stub
		return loveMapper.findAll();
	}

	@Override
	public Love updatelovestatus(String love_status, Integer love_id) {
		// TODO Auto-generated method stub
		return loveMapper.updatelovestatus(love_status, love_id);
	}

	@Override
	public Love selectRecord(int love_id) {
		// TODO Auto-generated method stub
		return loveMapper.selectRecord(love_id);
	}

	@Override
	public User selectuser(Integer user_id) {
		// TODO Auto-generated method stub
		return loveMapper.selectuser(user_id);
	}

	@Override
	public User sentemail(Integer user_id, String user_email) {
		// TODO Auto-generated method stub
		return loveMapper.sentemail(user_id, user_email);
	}

}
