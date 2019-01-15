package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.domain.LComment;
import summer.mapper.LCommentMapper;
import summer.service.LCommentService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("lcommentService")
public class LCommentServiceImpl implements LCommentService{
	
	@Autowired
	private LCommentMapper lcommentMapper;


	@Override
	public List<LComment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addlcomment(int user_id, Integer land_id, String com_con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LComment> findComByLId(Integer land_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletelcom(int id) {
		// TODO Auto-generated method stub
		
	}

}
