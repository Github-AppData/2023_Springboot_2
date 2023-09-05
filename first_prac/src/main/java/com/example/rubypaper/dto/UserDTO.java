package com.example.rubypaper.dto;

import lombok.Data;
import lombok.ToString;

//@Data
//@ToString
public class UserDTO {

	private String userName;
	private String userId;
	private String userPwd;
	private String userHobby;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserHobby() {
		return userHobby;
	}
	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}
	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", userId=" + userId + ", userPwd=" + userPwd + ", userHobby="
				+ userHobby + "]";
	}
	
	
}
