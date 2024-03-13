package model.jobHuntPost;

import lombok.Data;

@Data
public class JobHuntPostDTO {
  private int jobHuntPostId;
  private String memberId;
  private String jobHuntPostDate;
  private String jobHuntPostRole;
  private String jobHuntPostRegion;
  private int jobHuntPostPay;
  private String jobHuntPostWorkdate;
  private String jobHuntPostConcept;
  private String jobHuntPostTitle;
  private String jobHuntPostContent;
  private int jobHuntPostViewCnt;

  private String searchCondition;


}
