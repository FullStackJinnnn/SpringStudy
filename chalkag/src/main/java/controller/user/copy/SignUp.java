package controller.user.copy;

import model.member.MemberDTO;
import model.member.MemberService;
import model.profileImg.ProfileImgDTO;
import model.profileImg.ProfileImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SignUp {

  @Autowired
  MemberService memberService;

  @Autowired
  ProfileImgService profileImgService;

  // 멤버와 프로필이미지를 Command 객체로 활용
  // profileImgDTO에는 이미지 정보를 가지고 있음
  @RequestMapping(value = "/signUp", method = RequestMethod.POST)
  public String main(MemberDTO memberDTO, ProfileImgDTO profileImgDTO) {

    // 만약 닉네임을 입력하지 않았다면 닉네임을 ID로 설정
    if (memberDTO.getMemberNickname().trim() == null) {
      memberDTO.setMemberNickname(memberDTO.getMemberId());
    }

    // 만약 프로필 이미지를 등록하지 않았다면 기본 이미지를 추가
    if (profileImgDTO.getProfileImgName() == null) {
      profileImgDTO.setProfileImgName("/resources/default.png");
    }

    // 프로필이미지 객체에 있는 memberId의 값을 멤버객체에 있는 memberId 값으로 설정
    profileImgDTO.setMemberId(memberDTO.getMemberId());

    // 프로필이미지 객체를 활용하여 프로필이미지를 추가
    if (!profileImgService.insert(profileImgDTO)) {
      System.out.println("[로그] Controller : 프로필 사진 추가 실패");
    }

    if (!memberService.insert(memberDTO)) {
      System.out.println("[로그] Controller : 회원가입 실패");
      return "redirect:error";
    }
    return "redirect:main";
  }
}
