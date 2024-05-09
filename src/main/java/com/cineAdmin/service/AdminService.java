package com.cineAdmin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.cineAdmin.ResponseType.TokenResponse;
import com.cineAdmin.entity.Admin;
import com.cineAdmin.entity.AdminAuth;
import com.cineAdmin.entity.Movie;
import com.cineAdmin.entity.Review;
import com.cineAdmin.entity.User;


public interface AdminService {
	
	List<User> getAllUsers();
	
	List<Movie> getMovies();
	
	Admin addAdmin(Admin admin);
	
	ResponseEntity<TokenResponse> adminAuthenticate(AdminAuth admin);
	
	User retrieveUser(String name);
	
	User updateUser(Integer id,  User user);
	
	void deleteUser(int id);
	
	List<Movie> searchMovie(String movie);
	
	Movie addMovie(Movie movie);
	
	Movie updateMovie(int id, Movie movie);
	
	void deleteMovie(int id);
	
	Optional<Review> getReview(int id);
	
	void deleteReview(int id);

}
