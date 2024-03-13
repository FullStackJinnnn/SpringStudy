package model.comment;

public class CommentDTO { 			// 댓글 DTO 생성.전미지
	private int commentId;			// 댓글 아이디
	private int postId;				// 게시글 아이디
	private String memberId;		// 회원 아이디
	private String commentDate;		// 댓글 작성 시간
	private String commentContent; 	// 댓글 내용
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	
	@Override
	public String toString() {
		return "CommentDTO [commentId=" + commentId + ", postId=" + postId + ", memberId=" + memberId + ", commentDate="
				+ commentDate + ", commentContent=" + commentContent + "]";
	}

}