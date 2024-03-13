package model.marketPost;

public class MarketPostDTO {
	private int    marketPostId;
	private String memberId;
	private String marketPostDate;
	private int    marketPostPrice;
	private String marketPostCategory;
	private String marketPostCompany;
	private String marketPostStatus;
	private String marketPostTitle;
	private String marketPostContent;
	private int marketPostViewCnt;
	
	private String searchCondition;

	public int getMarketPostId() {
		return marketPostId;
	}

	public void setMarketPostId(int marketPostId) {
		this.marketPostId = marketPostId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMarketPostDate() {
		return marketPostDate;
	}

	public void setMarketPostDate(String marketPostDate) {
		this.marketPostDate = marketPostDate;
	}

	public int getMarketPostPrice() {
		return marketPostPrice;
	}

	public void setMarketPostPrice(int marketPostPrice) {
		this.marketPostPrice = marketPostPrice;
	}

	public String getMarketPostCategory() {
		return marketPostCategory;
	}

	public void setMarketPostCategory(String marketPostCategory) {
		this.marketPostCategory = marketPostCategory;
	}

	public String getMarketPostCompany() {
		return marketPostCompany;
	}

	public void setMarketPostCompany(String marketPostCompany) {
		this.marketPostCompany = marketPostCompany;
	}

	public String getMarketPostStatus() {
		return marketPostStatus;
	}

	public void setMarketPostStatus(String marketPostStatus) {
		this.marketPostStatus = marketPostStatus;
	}

	public String getMarketPostTitle() {
		return marketPostTitle;
	}

	public void setMarketPostTitle(String marketPostTitle) {
		this.marketPostTitle = marketPostTitle;
	}

	public String getMarketPostContent() {
		return marketPostContent;
	}

	public void setMarketPostContent(String marketPostContent) {
		this.marketPostContent = marketPostContent;
	}

	public int getMarketPostViewCnt() {
		return marketPostViewCnt;
	}

	public void setMarketPostViewCnt(int marketPostViewCnt) {
		this.marketPostViewCnt = marketPostViewCnt;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	
	
	@Override
	public String toString() {
		return "MarketPostDTO [marketPostId=" + marketPostId + ", memberId=" + memberId + ", marketPostDate="
				+ marketPostDate + ", marketPostPrice=" + marketPostPrice + ", marketPostCategory=" + marketPostCategory
				+ ", marketPostCompany=" + marketPostCompany + ", marketPostStatus=" + marketPostStatus
				+ ", marketPostTitle=" + marketPostTitle + ", marketPostContent=" + marketPostContent
				+ ", marketPostViewCnt=" + marketPostViewCnt + ", searchCondition=" + searchCondition + "]";
	}
	
	
}
