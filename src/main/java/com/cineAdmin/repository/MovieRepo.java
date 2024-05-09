package com.cineAdmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cineAdmin.entity.Movie;


@Repository
public interface MovieRepo extends JpaRepository <Movie, Integer> {
	
	@Query("select m from Movie m where m.Title like :movie%")
	List<Movie> searchMovie(@Param("movie")String movie) ;
	
	

}
