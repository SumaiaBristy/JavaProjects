package comm.example;

import java.io.Serializable;

public class League implements Serializable {
	
	
	private int id;
	private String title;
	private int year;
	private String season;
	
	
	public League() {
		super();
	}


	public League(int id, String title, int year, String season) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.season = season;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getSeason() {
		return season;
	}


	public void setSeason(String season) {
		this.season = season;
	}
	
	
	
	
	

}
