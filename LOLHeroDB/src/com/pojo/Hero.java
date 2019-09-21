package com.pojo;

public class Hero {
	private int id;
	private String name;
	private String nickName;
	
	public Hero(int id, String name, String nickName) {
		super();
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	public Hero() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", nickName=" + nickName + "]";
	}
	
	
	

}
