package com.cineAdmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cineAdmin.entity.Review;


@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
	
	@Query("Select  r from Review r where r.movieId=:movieId")
	List<Review> findReviewByMovieId(@Param("movieId") Integer movieId);
	
	@Query("Select  rat from Review rat where rat.id=:movieId")
	List<Review> findRatingByMovieId(@Param("movieId") Integer movieId);
	
	

}
