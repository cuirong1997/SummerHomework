package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.service.CartService;
import summer.domain.Cart;
import summer.domain.Good;
import summer.mapper.CartMapper;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartMapper cartMapper;

	@Override
	public Good selectGood(int good_id) {
		// TODO Auto-generated method stub
		return cartMapper.selectGood(good_id);
	}

	@Override
	public void insertcart(int user_id, int good_id, int good_number, String cart_gname, int cart_price,
			String cart_image) {
		cartMapper.insertcart(user_id, good_id, good_number, cart_gname, cart_price, cart_image);// TODO Auto-generated method stub
		
	}

	@Override
	public Cart updatecart(int user_id, Integer good_id, Integer good_number) {
		// TODO Auto-generated method stub
		return cartMapper.updatecart(user_id, good_id, good_number);
	}

	@Override
	public List<Cart> readcart(int user_id) {
		// TODO Auto-generated method stub
		return cartMapper.readcart(user_id);
	}

	@Override
	public Cart getAll(int user_id, String good_name) {
		// TODO Auto-generated method stub
		return cartMapper.getAll(user_id, good_name);
	}

	@Override
	public void deletecart(int user_id) {
		// TODO Auto-generated method stub
		cartMapper.deletecart(user_id);
		
	}

	@Override
	public Cart findGoodById(int user_id, int good_id) {
		// TODO Auto-generated method stub
		return cartMapper.findGoodById(user_id, good_id);
	}

	@Override
	public void rowdelete(int user_id, int good_id) {
		// TODO Auto-generated method stub
		cartMapper.rowdelete(user_id, good_id);
		
	}


}
