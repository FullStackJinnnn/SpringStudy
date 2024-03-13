package model.comment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository("commentDAO")
public class CommentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SELECTALL="";
	private static final String SELECTONE="";
	private static final String INSERT="";
	private static final String UPDATE="";
	private static final String DELETE="";
	
	public List<CommentDTO> selectAll(CommentDTO commentDTO){
		return (List<CommentDTO>) jdbcTemplate.query(SELECTALL,new CommentRowMapper());
	}
	
	public CommentDTO selectOne(CommentDTO commentDTO) {
		Object[] args = {commentDTO.getCommentId()};
		try {
			return jdbcTemplate.queryForObject(SELECTONE,args,new CommentRowMapper());
		}catch(Exception e) {
			return null;
		}
 	}
	
	public boolean insert(CommentDTO commentDTO) {
		int result=jdbcTemplate.update(INSERT);
		if(result<=0) {
			return false;
		}
		return true;
	}
	
	public boolean update(CommentDTO commentDTO) {
		int result=jdbcTemplate.update(UPDATE);
		if(result<=0) {
			return false;
		}
		return true;
	}
	
	public boolean delete(CommentDTO commentDTO) {
		int result=jdbcTemplate.update(DELETE);
		if(result<=0) {
			return false;
		}
		return true;
	}
}

class CommentRowMapper implements RowMapper<CommentDTO>{
	
	@Override
	public CommentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CommentDTO data = new CommentDTO();
		data.setPostId(rs.getInt("POSTID"));
		data.setCommentId(rs.getInt("COMMENTID"));
		data.setMemberId(rs.getString("MEMBERID"));
		data.setCommentContent(rs.getString("COMMENTCONTENT"));
		data.setCommentDate(rs.getString("COMMENTDATE"));
		return data;
	}
}
