package com.koreait.day0681;


// DataDTO, DataVO      dto. vo. 엔터티, 객체 라고 부른다 (회사마다다름)
// Member, MemberDTO, MemberVO, Member엔티티, Member 객체
public class Data {
	private String apple;
	private String banana;
	
	
	public String getApple() {
		return apple;
	}
	public void setApple(String apple) {
		this.apple = apple;
	}
	public String getBanana() {
		return banana;
	}
	public void setBanana(String banana) {
		this.banana = banana;
	}
	
	@Override
	public String toString() {
		return "Data [apple=" + apple + ", banana=" + banana + "]";
	}
}
