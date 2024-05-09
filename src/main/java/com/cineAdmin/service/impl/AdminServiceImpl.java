package com.cineAdmin.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cineAdmin.ResponseType.TokenResponse;
import com.cineAdmin.entity.Admin;
import com.cineAdmin.entity.AdminAuth;
import com.cineAdmin.entity.Movie;
import com.cineAdmin.entity.Review;
import com.cineAdmin.entity.User;
import com.cineAdmin.repository.AdminRepo;
import com.cineAdmin.repository.MovieRepo;
import com.cineAdmin.repository.ReviewRepo;
import com.cineAdmin.repository.UserRepository;
import com.cineAdmin.service.AdminService;
import com.cineAdmin.util.JwtUtil;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	UserRepository userRepo;
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	MovieRepo movieRepo;
	@Autowired
	ReviewRepo reviewRepo;
	@Autowired
	JwtUtil jwtUtil;

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public List<Movie> getMovies() {
		return movieRepo.findAll();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		admin.setRoles("ADMIN");
		return adminRepo.save(admin);
	}

	@Override
	public ResponseEntity<TokenResponse> adminAuthenticate(AdminAuth admin) {
		List<Admin> adminList=adminRepo.findAdmin(admin.getUsername(),admin.getPassword());
		if(adminList.size()==0) {
			TokenResponse r=new TokenResponse();
			r.setMessage("Invalid Username or password");
			return new ResponseEntity<>(r,HttpStatus.BAD_REQUEST);			
		}
		if(adminList.size()>1) {
			TokenResponse r=new TokenResponse();
			r.setMessage("Invalid Username or password");
			return new ResponseEntity<TokenResponse>(r,HttpStatus.BAD_REQUEST);
		}
		
		if(adminList.get(0).getRoles().equals("ADMIN")) {
		return jwtUtil.generateToken(admin.getUsername());
		}
		TokenResponse r=new TokenResponse();
		r.setMessage("Invalid Credentials");
		return new ResponseEntity<TokenResponse>(r,HttpStatus.BAD_REQUEST);
		
	}

	@Override
	public User retrieveUser(String name) {
		
		return userRepo.findByName(name);
	}

	@Override
	public User updateUser(Integer id, User user) {
		User updatedUser= userRepo.findById(id).get();
		
		updatedUser.setName(user.getName());
		updatedUser.setEmail(user.getEmail());
		updatedUser.setPassword(user.getPassword());
		userRepo.save(updatedUser);
		return updatedUser;
	}

	@Override
	public void deleteUser(int id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public List<Movie> searchMovie(String movie) {
		List<Movie> searchedMovies= movieRepo.searchMovie(movie);
		return searchedMovies;
	}

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepo.save(movie);
	}

	@Override
	public Movie updateMovie(int id, Movie movie) {
	Movie updatedMovie=	movieRepo.findById(id).get();
		
	updatedMovie.setTitle(movie.getTitle());
	updatedMovie.setGenre(movie.getGenre());
	updatedMovie.setLanguage(movie.getLanguage());
	updatedMovie.setImgUrl(movie.getImgUrl());
	updatedMovie.setReleasing_year(movie.getReleasing_year());
	updatedMovie.setDirector(movie.getDirector());
	updatedMovie.setLeadRole(movie.getLeadRole());
	updatedMovie.setTrailer(movie.getTrailer());
	return movieRepo.save(updatedMovie);
		
	}

	@Override
	public void deleteMovie(int id) {
		movieRepo.deleteById(id);
		
	}

	@Override
	public Optional<Review> getReview(int id) {
		return reviewRepo.findById(id);
	}

	@Override
	public void deleteReview(int id) {
	 reviewRepo.deleteById(id);
		
	}

	
	

	
	

}
