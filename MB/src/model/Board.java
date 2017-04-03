package model;

public class Board {
	private String boardNo;
	private String title;
	private String content;
	private String annotation;
	private String date;
	private String ageType;
	private String nick;
	private String id_index;
	private String viewNo;
	private String recommend;

	public String getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAgeType() {
		return ageType;
	}

	public void setAgeType(String ageType) {
		this.ageType = ageType;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getId_index() {
		return id_index;
	}

	public void setId_index(String id_index) {
		this.id_index = id_index;
	}

	public String getViewNo() {
		return viewNo;
	}

	public void setViewNo(String viewNo) {
		this.viewNo = viewNo;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", annotation=" + annotation
				+ ", date=" + date + ", ageType=" + ageType + ", nick=" + nick + ", id_index=" + id_index + ", viewNo="
				+ viewNo + ", recommend=" + recommend + "]";
	}
}
