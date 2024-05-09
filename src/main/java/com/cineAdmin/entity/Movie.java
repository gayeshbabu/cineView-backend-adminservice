package com.cineAdmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Title;
	private String Language;
	private String Genre;
	private int Releasing_year;
	private String ImgUrl;
	private String LeadRole;
	private String Director;
	private String Trailer;
	
	public Movie() {
		super();
	}

	public Movie(String title, String language, String genre, String imgUrl, int releasing_year, String leadRole, String director, String trailer) {
		super();
		Title = title;
		Language = language;
		Genre = genre;
		ImgUrl = imgUrl;
		Releasing_year = releasing_year;
		LeadRole = leadRole;
		Director = director;
		Trailer = trailer;
	}

	public Movie(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getGenre() {
		return Genre;
	}

	public String getImgUrl() {
		return ImgUrl;
	}

	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getReleasing_year() {
		return Releasing_year;
	}

	public void setReleasing_year(int releasing_year) {
		Releasing_year = releasing_year;
	}

	public String getLeadRole() {
		return LeadRole;
	}

	public void setLeadRole(String leadRole) {
		LeadRole = leadRole;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getTrailer() {
		return Trailer;
	}

	public void setTrailer(String trailer) {
		Trailer = trailer;
	}

}
