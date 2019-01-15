package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.domain.Comment;
import summer.mapper.CommentMapper;
import summer.service.CommentService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("commentService")
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentMapper commentMapper;

	@Override
	public List<Comment> getAll() {
		// TODO Auto-generated method stub
		return commentMapper.findAll();
	}

	@Override
	public void addcomment(int user_id, Integer good_id, String com_con) {
		// TODO Auto-generated method stub
		commentMapper.addcomment(user_id, good_id, com_con);
		
	}

	@Override
	public List<Comment> findComByGId(Integer good_id) {
		// TODO Auto-generated method stub
		return commentMapper.findComByGId(good_id);
	}

	@Override
	public void deletecom(int id) {
		// TODO Auto-generated method stub
		commentMapper.deletecom(id);
	}

}
