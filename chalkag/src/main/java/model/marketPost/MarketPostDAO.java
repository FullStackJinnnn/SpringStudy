package model.marketPost;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository("marketPostDAO")
public class MarketPostDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SELECTALL="";
	private static final String SELECTONE="";
	private static final String INSERT="";
	private static final String UPDATE="";
	private static final String DELETE="";
	
	public List<MarketPostDTO> selectAll(MarketPostDTO marketPostDTO){
		
		return (List<MarketPostDTO>)jdbcTemplate.query(SELECTALL,new MarketPostRowMapper()); 
	}
	
	public MarketPostDTO selectOne(MarketPostDTO marketPostDTO) {
		Object[] args = { marketPostDTO.getMarketPostId() };
		try {
			return jdbcTemplate.queryForObject(SELECTONE, args, new MarketPostRowMapper());
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean insert(MarketPostDTO marketPostDTO) {
		int result=jdbcTemplate.update(INSERT);
		if(result<=0) {
			return false;
		}
		return true;
	}
	
	public boolean update(MarketPostDTO marketPostDTO) {
		int result=jdbcTemplate.update(UPDATE);
		if(result<=0) {
			return false;
		}
		return true;
	}
	
	public boolean delete(MarketPostDTO marketPostDTO) {
		int result=jdbcTemplate.update(DELETE);
		if(result<=0) {
			return false;
		}
		return true;
	}
}

class MarketPostRowMapper implements RowMapper<MarketPostDTO>{

	@Override
	public MarketPostDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		MarketPostDTO data = new MarketPostDTO();
		
		data.setMarketPostId(rs.getInt("MARKETPOSTID"));
		data.setMemberId(rs.getString("MEMBERID"));
		data.setMarketPostDate(rs.getString("MARKETPOSTDATE"));
		data.setMarketPostPrice(rs.getInt("MARKETPOSTPRICE"));
		data.setMarketPostCategory(rs.getString("MARKETPOSTCATEGORY"));
		data.setMarketPostCompany(rs.getString("MARKETPOSTCOMPANY"));
		data.setMarketPostStatus(rs.getString("MARKETPOSTSTATUS"));
		data.setMarketPostTitle(rs.getString("MARKETPOSTTITLE"));
		data.setMarketPostContent(rs.getString("MARKETPOSTCONTENT"));
		data.setMarketPostViewCnt(rs.getInt("MARKETPOSTVIEWCNT"));
		
		
		return data;
	}

	
	
}
