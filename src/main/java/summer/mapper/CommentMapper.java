package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.Comment;

public interface CommentMapper {
	@Select("select * from tb_comment")
	List<Comment> findAll();
	
	@Select("insert into tb_comment(com_uid,com_gid,com_con) values(#{user_id},#{good_id},#{com_con})")
	void addcomment(@Param("user_id")int user_id,@Param("good_id") Integer good_id,@Param("com_con")String com_con);
		
	@Select("select * from tb_comment where com_gid=#{good_id}")
	List<Comment> findComByGId(@Param("good_id") Integer good_id);
	
	@Delete("delete from tb_comment where com_id=#{id}")
	void deletecom(@Param("id")int id);

}
