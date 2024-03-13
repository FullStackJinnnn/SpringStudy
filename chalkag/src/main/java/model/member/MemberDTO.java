package model.member;

import lombok.Data;

@Data
public class MemberDTO {

  private String memberId;
  private String memberPw;
  private String memberName;
  private String memberNickname;
  private String memberPh;
  private String memberBirth;
  private String memberGender;
  private String memberIntroduction;
  private String memberGrade;
  private String currentScore;
  private String currentLevel;
  private String curentExp;
  private String currentNextExp;
  private String AgeGroup;
  private String maleGroup;
  private String femaleGroup;

  private String searchCondition;

}
