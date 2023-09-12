package com.example.rubypaper.dto;

public class BoardDTO {

	private String num;
	private String title;
	private String name;
	
	public BoardDTO(String num, String title, String name) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", title=" + title + ", name=" + name + "]";
	}
	
	
	
}
