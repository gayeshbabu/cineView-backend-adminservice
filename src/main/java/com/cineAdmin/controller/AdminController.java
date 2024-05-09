package com.cineAdmin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cineAdmin.ResponseType.GenericResponse;
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

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	UserRepository userRepo;
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	MovieRepo movieRepo;
	@Autowired
	ReviewRepo reviewRepo;
	@Autowired
	AdminService adminService;
	@Autowired
	JwtUtil jwtUtil;
	

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<List<User>>(adminService.getAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/movies")
	public  ResponseEntity<List<Movie>>  getAllMovies() {
		return new ResponseEntity<List<Movie>>(adminService.getMovies(), HttpStatus.OK);
	}
	
	
	@PostMapping("/add-admin")
	public ResponseEntity<?> addAdmin(@RequestBody Admin admin) {
		adminService.addAdmin(admin);
		GenericResponse gr=new GenericResponse();
		 gr.setResponse("Successfully added admin");
		return ResponseEntity.ok(gr);
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> adminAuthenticate(@RequestBody AdminAuth admin) {
		return new ResponseEntity<>(adminService.adminAuthenticate(admin),HttpStatus.OK);		
	}
	
	@GetMapping("/searchuser/{name}")
	public  ResponseEntity<User> retrieveOneUser(@PathVariable String name) {
		return new ResponseEntity<User>(adminService.retrieveUser(name), HttpStatus.OK);
	}
	
	@PutMapping("/updateuser/{id}")
	public ResponseEntity<?> updateUser(@PathVariable int id, @RequestBody User user) {
		adminService.updateUser(id, user);
		GenericResponse gr=new GenericResponse();
		gr.setResponse("User details updated succesfully");
		return new ResponseEntity<>(gr, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<?>deleteUser(@PathVariable int id) {
		adminService.deleteUser(id);
		GenericResponse gr= new GenericResponse();
		gr.setResponse("User deleted");
		return ResponseEntity.ok(gr);
		
	}
	
	@GetMapping("/searchmovie/{movie}")
	public ResponseEntity<?> searchmovie(@PathVariable String movie){
		
		return new ResponseEntity<>(adminService.searchMovie(movie), HttpStatus.OK);
	}
	
	@PostMapping("/addmovie")
	public ResponseEntity<?> addMovie(@RequestBody Movie movie) {
		adminService.addMovie(movie);
		GenericResponse gr=new GenericResponse();
		gr.setResponse("Movie added successfully");
		return new ResponseEntity<>(gr, HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateMovie(@PathVariable int id, @RequestBody Movie movie) {
		adminService.updateMovie(id, movie);
		GenericResponse gr=new GenericResponse();
		gr.setResponse("Movie Updated... succesfully by admin");
		return new ResponseEntity<>(gr, HttpStatus.OK);
}
	
	@DeleteMapping("/deletemovie/{id}")
	public ResponseEntity<?> deleteMovie(@PathVariable int id) {
		adminService.deleteMovie(id);
		GenericResponse gr=new GenericResponse();
		gr.setResponse("Movie deleted successfully");
		return new ResponseEntity<>(gr, HttpStatus.OK);
	}
	
	
	@GetMapping("/review/{id}")
	public  ResponseEntity<?> getReview(@PathVariable int id) {
		return new ResponseEntity<>(adminService.getReview(id), HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deletereview/{id}")
	public ResponseEntity<?> deleteReview(@PathVariable int id) {
		adminService.deleteReview(id);
		GenericResponse gr= new GenericResponse();
		gr.setResponse("Review deleted....");
		return new ResponseEntity<>(gr, HttpStatus.OK);
		
	}

}
