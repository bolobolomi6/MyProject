package com.pojo;

import java.util.Date;

public class Message {
	private int id;
	private int userId;
	private Date lydate;
	private String title;
	private String contentl;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int id, int userId, Date lydate, String title, String contentl) {
		super();
		this.id = id;
		this.userId = userId;
		this.lydate = lydate;
		this.title = title;
		this.contentl = contentl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(User user) {
		this.userId = userId;
	}
	public Date getLydate() {
		return lydate;
	}
	public void setLydate(Date lydate) {
		this.lydate = lydate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentl() {
		return contentl;
	}
	public void setContentl(String contentl) {
		this.contentl = contentl;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", userId=" + userId + ", lydate=" + lydate + ", title=" + title + ", contentl="
				+ contentl + "]";
	}
	

}
