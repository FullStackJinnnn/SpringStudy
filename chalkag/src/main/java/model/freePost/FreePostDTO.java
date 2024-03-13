package model.freePost;

public class FreePostDTO {
	private int    freePostId;
	private String memberId;
	private String freePostDate;
	private String freePostTitle;
	private String freePostContent;
	private int    freePostViewCnt;
	
	private String searchCondition;
	
	

	public int getFreePostId() {
		return freePostId;
	}

	public void setFreePostId(int freePostId) {
		this.freePostId = freePostId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getFreePostDate() {
		return freePostDate;
	}

	public void setFreePostDate(String freePostDate) {
		this.freePostDate = freePostDate;
	}

	public String getFreePostTitle() {
		return freePostTitle;
	}

	public void setFreePostTitle(String freePostTitle) {
		this.freePostTitle = freePostTitle;
	}

	public String getFreePostContent() {
		return freePostContent;
	}

	public void setFreePostContent(String freePostContent) {
		this.freePostContent = freePostContent;
	}

	public int getFreePostViewCnt() {
		return freePostViewCnt;
	}

	public void setFreePostViewCnt(int i) {
		this.freePostViewCnt = i;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
}
