package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.domain.Cart;
import summer.domain.Good;
import summer.domain.Order;
import summer.domain.User;
import summer.mapper.OrderMapper;
import summer.service.OrderService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")

public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}

	@Override
	public Good selectGood(Integer good_id) {
		// TODO Auto-generated method stub
		return orderMapper.selectGood(good_id);
	}

	

	@Override
	public Order findGoodById(Integer user_id, Integer good_id) {
		// TODO Auto-generated method stub
		return orderMapper.findGoodById(user_id, good_id);
	}

	@Override
	public Order updatenumber(Integer user_id, Integer good_id, Integer good_number) {
		// TODO Auto-generated method stub
		return orderMapper.updatenumber(user_id, good_id, good_number);
	}

	@Override
	public List<Order> readorder(Integer user_id) {
		// TODO Auto-generated method stub
		return orderMapper.readorder(user_id);
	}

	@Override
	public Order updatestatus(String order_status, Integer order_id) {
		// TODO Auto-generated method stub
		return orderMapper.updatestatus(order_status, order_id);
	}

	@Override
	public List<Order> selectById(int order_id) {
		// TODO Auto-generated method stub
		return orderMapper.selectById(order_id);
	}

	@Override
	public Good updatestandse(int good_store, int good_sell, Integer good_id) {
		// TODO Auto-generated method stub
		return orderMapper.updatestandse(good_store, good_sell, good_id);
	}

	@Override
	public Order selectRecord(int order_id) {
		// TODO Auto-generated method stub
		return orderMapper.selectRecord(order_id);
	}

	@Override
	public User selectuser(Integer user_id) {
		// TODO Auto-generated method stub
		return orderMapper.selectuser(user_id);
	}

	@Override
	public User sentemail(Integer user_id, String user_email) {
		// TODO Auto-generated method stub
		return orderMapper.sentemail(user_id, user_email);
	}

	@Override
	public void insertorder(Integer user_id, Integer good_id, String order_name, int order_price, int good_number,
			String order_image, String order_address, String order_status) {
		// TODO Auto-generated method stub
		orderMapper.insertorder(user_id, good_id, order_name, order_price, good_number, order_image, order_address, order_status);
	}

	

	

	
	
	

}
