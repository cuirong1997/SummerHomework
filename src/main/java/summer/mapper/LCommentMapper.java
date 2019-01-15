package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.LComment;

public interface LCommentMapper {
	@Select("select * from tb_lcomment")
	List<LComment> findAll();
	
	@Select("insert into tb_lcomment(lcom_uid,lcom_lid,lcom_con) values(#{user_id},#{land_id},#{com_con})")
	void addlcomment(@Param("user_id")int user_id,@Param("land_id") Integer land_id,@Param("com_con")String com_con);
		
	@Select("select * from tb_lcomment where lcom_lid=#{land_id}")
	List<LComment> findComByLId(@Param("land_id") Integer land_id);
	
	@Delete("delete from tb_lcomment where lcom_id=#{id}")
	void deletelcom(@Param("id")int id);


}
