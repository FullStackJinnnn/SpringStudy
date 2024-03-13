package model.freePost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("freePostDAO")
public class FreePostDAO {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  private static final String SELECTALL = "";
  private static final String SELECTONE = "";
  private static final String INSERT = "";
  private static final String UPDATE = "";
  private static final String DELETE = "";

  public List<FreePostDTO> selectAll(FreePostDTO freetPostDTO) {

    return (List<FreePostDTO>) jdbcTemplate.query(SELECTALL, new FreePostRowMapper());
  }

  public FreePostDTO selectOne(FreePostDTO freePostDTO) {
    Object[] args = {freePostDTO.getFreePostId()};
    try {
      return jdbcTemplate.queryForObject(SELECTONE, args, new FreePostRowMapper());
    } catch (Exception e) {
      return null;
    }
  }

  public boolean insert(FreePostDTO freePostDTO) {
    int result = jdbcTemplate.update(INSERT);
    if (result <= 0) {
      return false;
    }
    return true;
  }

  public boolean update(FreePostDTO freePostDTO) {
    int result = jdbcTemplate.update(UPDATE);
    if (result <= 0) {
      return false;
    }
    return true;
  }

  public boolean delete(FreePostDTO freePostDTO) {
    int result = jdbcTemplate.update(DELETE);
    if (result <= 0) {
      return false;
    }
    return true;
  }
}

class FreePostRowMapper implements RowMapper<FreePostDTO> {

  @Override
  public FreePostDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

    FreePostDTO data = new FreePostDTO();


    data.setFreePostId(rs.getInt("FREEPOSTID"));
    data.setMemberId(rs.getString("MEMBERID"));
    data.setFreePostDate(rs.getString("FREEPOSTDATE"));
    data.setFreePostTitle(rs.getString("FREEPOSTTITLE"));
    data.setFreePostContent(rs.getString("FREEPOSTCONTENT"));
    data.setFreePostViewCnt(rs.getInt("FREEPOSTVIEWCNT"));
    return data;
  }

}
