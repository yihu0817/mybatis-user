package com.wisezone.food.usermanager.entity;

import java.sql.Timestamp;

public class User {
	private int id;
	private String userName;
	private String passWorld;
	private String headerImg;
	private Timestamp loginTime;

	public User() {
		super();
	}
	
	public User(String userName, String passWorld) {
		this.userName = userName;
		this.passWorld = passWorld;
	}

	public User(int id, String userName, String passWorld) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWorld = passWorld;
	}
	public User(int id, String userName, String passWorld,String headerImg) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWorld = passWorld;
		this.headerImg = headerImg;
	}
	public User(int id, String userName, String passWorld,String headerImg,Timestamp loginTime) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWorld = passWorld;
		this.headerImg = headerImg;
		this.loginTime = loginTime;
	}
	public User(String userName, String passWorld,String headerImg,Timestamp loginTime) {
		this.userName = userName;
		this.passWorld = passWorld;
		this.headerImg = headerImg;
		this.loginTime = loginTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWorld() {
		return passWorld;
	}

	public void setPassWorld(String passWorld) {
		this.passWorld = passWorld;
	}

	public String getHeaderImg() {
		return headerImg;
	}

	public void setHeaderImg(String headerImg) {
		this.headerImg = headerImg;
	}

	public Timestamp getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWorld=" + passWorld + ", headerImg=" + headerImg
				+ ", loginTime=" + loginTime + "]";
	}


}
