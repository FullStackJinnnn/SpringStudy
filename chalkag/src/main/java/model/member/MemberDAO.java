package model.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository("memberDAO")
public class MemberDAO {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  // 아이디 중복검사.안승준
  private static final String SELECTALL_CHECKID = "SELECT MEMBER_id" +
      "FROM MEMBER" +
      "WHERE MEMBER_id = ?";

  // 전화번호 중복검사 .안승준
  private static final String SELECTALL_CHECKPH = "SELECT MEMBER_ph" +
      "FROM MEMBER" +
      "WHERE MEMBER_PH = ?";

  // 닉네임 중복검사.안승준
  private static final String SELECTALL_CHECKNICKNAME = "SELECT MEMBER_nickname" +
      "FROM MEMBER" +
      "WHERE MEMBER_nickname = ?";

  // 메인페이지 레벨순위 맴버 출력.안승준
  private static final String SELECTALL_LEVELRANK = "SELECT MEMBER_nickname," +
      "(SELECT MAX(LEVEL_id)" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp <= MEMBER_exp) AS CURRENT_LEVEL" +
      "FROM MEMBER" +
      "ORDER BY MEMBER_exp DESC" +
      "LIMIT 10";

  // (관리자)연령별 가입자 수.안승준
  private static final String SELECTALL_SIGNUPCOUNTBYAGEGROUP = "SELECT FLOOR(TIMESTAMPDIFF(YEAR, STR_TO_DATE(MEMBER_birth, '%Y%m%d'), NOW()) / 10) * 10 AS AGEGROUP," +
      "COUNT(*)" +
      "FROM MEMBER" +
      "GROUP BY AGEGROUP" +
      "ORDER BY AGEGROUP";

  // 로그인.안승준
  private static final String SELECTONE_SIGNIN = "SELECT MEMBER_id , MEMBER_grade" +
      "FROM MEMBER" +
      "WHERE MEMBER_id = ?" +
      "AND MEMBER_pw = ?";

  // 아이디 찾기.안승준
  private static final String SELECTONE_FINDID = "SELECT MEMBER_id" +
      "FROM MEMBER" +
      "WHERE MEMBER_name = ?" +
      "AND MEMBER_ph = ?";

  // 비밀번호 찾기.안승준
  private static final String SELECTONE_FINDPW = "SELECT MEMBER_pw" +
      "FROM MEMBER" +
      "WHERE MEMBER_id = ?" +
      "AND MEMBER_ph = ?";

  // 메인페이지 내 정보 출력.안승준
  private static final String SELECTONE_MYPAGESIMPLE = "SELECT MEMBER_id," +
      "MEMBER_name," +
      "MEMBER_nickname," +
      "MEMBER_introduction," +
      "MEMBER_ph," +
      "MEMBER_grade," +
      "(SELECT AVG(REVIEW_score)" +
      "FROM REVIEW" +
      "WHERE MEMBER_id = ?) AS CURRENT_score," +
      "(SELECT MAX(LEVEL_id)" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp <= MEMBER_exp) AS CURRENT_level," +
      "(SELECT (MEMBER_exp - MAX(LEVEL_requiredexp))" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp <= MEMBER_exp) AS CURRENT_exp," +
      "((SELECT MIN(LEVEL_requiredexp)" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp > MEMBER_exp) -" +
      "(SELECT MAX(LEVEL_requiredexp)" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp <= MEMBER_exp)) AS CURRENT_nextexp" +
      "FROM MEMBER" +
      "WHERE MEMBER_id = ?";

  // 마이페이지(유저페이지) 출력.안승준
  private static final String SELECTONE_MYPAGE = "SELECT MEMBER_id," +
      "MEMBER_pw," +
      "MEMBER_name," +
      "MEMBER_nickname," +
      "MEMBER_ph," +
      "MEMBER_birth," +
      "MEMBER_gender," +
      "MEMBER_introduction," +
      "MEMBER_grade," +
      "(SELECT AVG(REVIEW_score)" +
      "FROM REVIEW" +
      "WHERE MEMBER_id = ?) AS CURRENT_score," +
      "(SELECT MAX(LEVEL_id)" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp <= MEMBER_exp) AS CURRENT_level," +
      "(SELECT (MEMBER_exp - MAX(LEVEL_requiredexp))" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp <= MEMBER_exp) AS CURRENT_exp," +
      "((SELECT MIN(LEVEL_requiredexp)" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp > MEMBER_exp) -" +
      "(SELECT MAX(LEVEL_requiredexp)" +
      "FROM LEVEL" +
      "WHERE LEVEL_requiredexp <= MEMBER_exp)) AS CURRENT_nextexp" +
      "FROM MEMBER" +
      "WHERE MEMBER_id = ?";

  // (관리자)성별별 가입자 수.안승준
  private static final String SELECTONE_SIGNUPCOUNTBYGENDERGROUP = "SELECT SUM(CASE WHEN MEMBER_gender = 'male' THEN 1 ELSE 0 END) AS MALEGROUP," +
      "SUM(CASE WHEN MEMBER_gender = 'female' THEN 1 ELSE 0 END) AS FEMALEGROUP" +
      "FROM MEMBER";

  // 회원 비밀번호 확인.안승준
  private static final String SELECTONE_CHECKPW = "SELECT MEMBER_pw" +
      "FROM MEMBER" +
      "WHERE MEMBER_id = ?";

  // 회원가입.안승준
  private static final String INSERT_SINGUP = "INSERT INTO MEMBER ( MEMBER_id," +
      "MEMBER_pw," +
      "MEMBER_name," +
      "MEMBER_nickname," +
      "MEMBER_ph," +
      "MEMBER_birth," +
      "MEMBER_gender," +
      "MEMBER_introduction)" +
      "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";

  // 비밀번호 변경.안승준
  private static final String UPDATE_PASSWORD = "UPDATE MEMBER" +
      "SET MEMBER_pw = ?" +
      "WHERE MEMBER_id = ?";

  // 닉네임 변경.안승준
  private static final String UPDATE_NICKNAME = "UPDATE MEMBER" +
      "SET MEMBER_nickname = ?" +
      "WHERE MEMBER_id = ?";

  // 자기소개 변경.안승준
  private static final String UPDATE_INTRODUCTION = "UPDATE MEMBER" +
      "SET MEMBER_introduction = ?" +
      "WHERE MEMBER_id = ?";

  // 회원 탈퇴.안승준
  private static final String UPDATE_DELETEACCOUNT = "UPDATE MEMBER" +
      "SET MEMBER_grade = 'delete'" +
      "WHERE MEMBER_id = ?";

  // 사용 안 할 예정.안승준
  private static final String DELETE = "";

  public List<MemberDTO> selectAll(MemberDTO memberDTO) {
    try {
      if (memberDTO.getSearchCondition().equals("checkId")) {
        return (List<MemberDTO>) jdbcTemplate.queryForObject(SELECTALL_CHECKID, new CheckIdRowMapper());
      } else if (memberDTO.getSearchCondition().equals("checkPh")) {
        return (List<MemberDTO>) jdbcTemplate.queryForObject(SELECTALL_CHECKPH, new CheckPhRowMapper());
      } else if (memberDTO.getSearchCondition().equals("checkNickname")) {
        return (List<MemberDTO>) jdbcTemplate.queryForObject(SELECTALL_CHECKNICKNAME, new CheckNicknameRowMapper());
      }
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return null;
  }

  public MemberDTO selectOne(MemberDTO memberDTO) {
    try {
      if (memberDTO.getSearchCondition().equals("signIn")) {
        Object[] args = {memberDTO.getMemberId(), memberDTO.getMemberPh(), memberDTO.getMemberPw()};
        return jdbcTemplate.queryForObject(SELECTONE_SIGNIN, args, new SignInRowMapper());
      } else if (memberDTO.getSearchCondition().equals("findId")) {
        Object[] args = {memberDTO.getMemberName(), memberDTO.getMemberPh()};
        return jdbcTemplate.queryForObject(SELECTONE_FINDID, args, new FindIdRowMapper());
      } else if (memberDTO.getSearchCondition().equals("findPw")) {
        Object[] args = {memberDTO.getMemberId(), memberDTO.getMemberPh()};
        return jdbcTemplate.queryForObject(SELECTONE_FINDPW, args, new FindPwRowMapper());
      } else if (memberDTO.getSearchCondition().equals("myPageSimple")) {
        Object[] args = {memberDTO.getMemberId(), memberDTO.getMemberId()};
        return jdbcTemplate.queryForObject(SELECTONE_MYPAGESIMPLE, args, new MyPageSimpleRowMapper());
      }
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return null;
  }

  public boolean insert(MemberDTO memberDTO) {
    // 회원 가입 searchCondition.안승준
    if (memberDTO.getSearchCondition().equals("signUp")) {

      if (jdbcTemplate.update(INSERT_SINGUP) <= 0) {
        return false;
      }
      return true;
    }
    return false;
  }

  public boolean update(MemberDTO memberDTO) {
    return false;
  }

  public boolean delete(MemberDTO memberDTO) {
    return false;
  }

}

// 아이디 중복검사 RowMapper.안승준
class CheckIdRowMapper implements RowMapper<MemberDTO> {
  @Override
  public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    MemberDTO memberDTO = new MemberDTO();
    memberDTO.setMemberId(rs.getString("MEMBER_id"));
    return memberDTO;
  }
}

// 전화번호 중복검사 RowMapper.안승준
class CheckPhRowMapper implements RowMapper<MemberDTO> {
  @Override
  public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    MemberDTO memberDTO = new MemberDTO();
    memberDTO.setMemberPh(rs.getString("MEMBER_ph"));
    return memberDTO;
  }
}

// 닉네임 중복검사 RowMapper.안승준
class CheckNicknameRowMapper implements RowMapper<MemberDTO> {
  @Override
  public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    MemberDTO memberDTO = new MemberDTO();
    memberDTO.setMemberNickname(rs.getString("MEMBER_nickname"));
    return memberDTO;
  }
}

// 아이디 찾기 RowMapper.안승준
class FindIdRowMapper implements RowMapper<MemberDTO> {
  @Override
  public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    MemberDTO memberDTO = new MemberDTO();
    memberDTO.setMemberName(rs.getString("MEMBER_name"));
    memberDTO.setMemberPh(rs.getString("MEMBER_ph"));
    return memberDTO;
  }
}

// 비밀번호 찾기 RowMapper.안승준
class FindPwRowMapper implements RowMapper<MemberDTO> {
  @Override
  public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    MemberDTO memberDTO = new MemberDTO();
    memberDTO.setMemberId(rs.getString("MEMBER_id"));
    memberDTO.setMemberPh(rs.getString("MEMBER_ph"));
    return memberDTO;
  }
}

// 메인페이지 회원 정보 출력.안승준
class MyPageSimpleRowMapper implements RowMapper<MemberDTO> {
  @Override
  public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    MemberDTO memberDTO = new MemberDTO();
    memberDTO.setMemberId(rs.getString("MEMBER_id"));
    memberDTO.setMemberName(rs.getString("MEMBER_name"));
    memberDTO.setMemberNickname(rs.getString("MEMBER_nickname"));
    memberDTO.setMemberName(rs.getString("MEMBER_introduction"));
    memberDTO.setMemberName(rs.getString("MEMBER_ph"));
    memberDTO.setMemberName(rs.getString("MEMBER_grade"));
    memberDTO.setCurrentScore(rs.getString("CURRENT_score"));
    memberDTO.setCurrentLevel(rs.getString("CURRENT_level"));
    memberDTO.setCurrentScore(rs.getString("CURRENT_exp"));
    memberDTO.setCurrentScore(rs.getString("CURRENT_nextexp"));
    return memberDTO;
  }
}

// 로그인 RowMapper.안승준
class SignInRowMapper implements RowMapper<MemberDTO> {
  @Override
  public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    MemberDTO memberDTO = new MemberDTO();
    memberDTO.setMemberId(rs.getString("MEMBER_id"));
    memberDTO.setMemberGrade(rs.getString("MEMBER_grade"));
    return memberDTO;
  }
}