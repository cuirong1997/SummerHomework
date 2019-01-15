package summer.service;

import java.util.List;

import summer.domain.LComment;

public interface LCommentService {
	List<LComment> findAll();
	
	void addlcomment(int user_id,Integer land_id,String com_con);
		
	List<LComment> findComByLId(Integer land_id);
	
	void deletelcom(int id);

}
