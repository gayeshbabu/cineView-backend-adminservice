package com.cineAdmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int movieId;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	private String name;
	private String title;
	private String comments;
	private double rating;

	public Review() {
		super();
	}

	public Review(int id,String name, String title, String comments, int movieId, double rating) {
		super();
		this.id = id;
		this.name=name;
		this.title = title;
		this.comments = comments;
		this.movieId = movieId;
		this.rating = rating;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", movieId=" + movieId + ", name=" + name + ", title=" + title
				+ ", comments=" + comments + ", rating=" + rating + "]";
	}

	
}
