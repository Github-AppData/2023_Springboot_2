package com.example.rubypaper.dto;

public class UserDTO {

	private String username;
	private String userid;
	private String useremail;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", userid=" + userid + ", useremail=" + useremail + "]";
	}
	
	
}
