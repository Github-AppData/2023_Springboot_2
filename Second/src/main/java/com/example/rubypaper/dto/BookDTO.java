package com.example.rubypaper.dto;

public class BookDTO {

	private String Title;
	private String Author;
	private String Publisher;
	private String Date;
	
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "BookDTO [Title=" + Title + ", Author=" + Author + ", Publisher=" + Publisher + ", Date=" + Date + "]";
	}
	
	
}
