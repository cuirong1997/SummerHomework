package summer.service;

import java.util.List;

import summer.domain.Comment;

public interface CommentService {
	List<Comment> getAll();
	
	void addcomment(int user_id,Integer good_id,String com_con);
	
	List<Comment> findComByGId(Integer good_id);
	
	void deletecom(int id);

}
