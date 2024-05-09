package com.cineAdmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cineAdmin.entity.Admin;


@Repository
public interface AdminRepo extends JpaRepository <Admin, Integer> {
	
	@Query("select a from Admin a where a.username=:username and a.password=:password")
	List<Admin> findAdmin(@Param("username")String usrername, @Param("password")String password) ;
}