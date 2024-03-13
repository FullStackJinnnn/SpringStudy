package model.jobHuntPost;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("jobHuntPostDAO")
public class JobHuntPostDAO {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SELECTALL="";
	private static final String SELECTONE="";
	private static final String INSERT="INSERT INTO JOBHUNTPOST(JOBHUNTPOSTID,MEMBERID,JOBHUNTPOSTDATE,JOBHUNTPOSTROLE,JOBHUNTPOSTREGION,JOBHUNTPOSTPAY,JOBHUNTPOSTWORKDATE,JOBHUNTPOSTCONCEPT,JOBHUNTPOSTTITLE,JOBHUNTPOSTCONTENT,JOBHUNTPOSTVIEWCNT,POSTIMGNAME) "
			+ "							VALUES(2000(보드아이디),?,CURRENT_TIMESTAMP,?,?,?,?,?,?,?,0,?)";
	private static final String UPDATE="UPDATE JOBHUNTPOST SET JOBHUNTREGION=?, JOBHUNTPOSTPAY=?, JOBHUNTPOSTWORKDATE=?, JOBHUNTPOSTCONCEPT=?, JOBHUNTPOSTTITLE=?, JOBHUNTPOSTCONTENT=?, POSTIMGNAME=?";
	private static final String UPDATE_PAGE="UPDATE JOBHUNTPOST SET JOBHUNTPOSTVIEWCNT=(JOBHUNTPOSTVIEWCNT+1) WHERE JOBHUNTPOSTID=?";
	private static final String DELETE="DELETE FROM JOBHUNTPOST WHERE JOBHUNTPOSTID=? ";
	
	public List<JobHuntPostDTO> selectAll(JobHuntPostDTO jobHuntPostDTO){
		
		return (List<JobHuntPostDTO>)jdbcTemplate.query(SELECTALL, new JobHuntPostRowMapper());
	}
	
	public JobHuntPostDTO selectOne(JobHuntPostDTO jobHuntPostDTO) {
		Object[] args= { jobHuntPostDTO.getJobHuntPostId() };
		try {
			return jdbcTemplate.queryForObject(SELECTONE, args, new JobHuntPostRowMapper());
		} catch(Exception e) {
			return null;
		}
	}
	
	public boolean insert(JobHuntPostDTO jobHuntPostDTO) {
		int result=jdbcTemplate.update(INSERT);
		if(result<=0) {
			return false;
		}
		return true;
	}
	public boolean update(JobHuntPostDTO jobHuntPostDTO) {
		int result=jdbcTemplate.update(UPDATE);
		if(result<=0) {
			return false;
		}
		return true;
	}
	public boolean delete(JobHuntPostDTO jobHuntPostDTO) {
		int result=jdbcTemplate.update(DELETE);
		if(result<=0) {
			return false;
		}
		return true;
	}
}

class JobHuntPostRowMapper implements RowMapper<JobHuntPostDTO>{
	
	@Override
	public JobHuntPostDTO mapRow(ResultSet rs,int rowNum) throws SQLException{
		JobHuntPostDTO data = new JobHuntPostDTO();
		
		data.setJobHuntPostId(rs.getInt("JOBHUNTPOSTID"));
		data.setMemberId(rs.getString("MEMBERID"));
		data.setJobHuntPostRole(rs.getString("JOBHUNTPOSTROLE"));		
		data.setJobHuntPostRegion(rs.getString("JOBHUNTPOSTREGION"));
		data.setJobHuntPostPay(rs.getInt("JOBHUNTPOSTPAY"));
		data.setJobHuntPostConcept(rs.getString("JOBHUNTPOSTCONCEPT"));
		data.setJobHuntPostTitle(rs.getString("JOBHUNTPOSTTITLE"));
		data.setJobHuntPostContent(rs.getString("JOBHUNTPOSTCONTENT"));
		data.setJobHuntPostViewCnt(rs.getInt("JOBHUNTPOSTVIEWCNT"));
		
		return data;
	}
}
