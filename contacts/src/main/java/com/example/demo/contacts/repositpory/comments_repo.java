package com.example.demo.contacts.repositpory;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.contacts.entity.Comments;

@Repository
public interface comments_repo extends JpaRepository<Comments, Long> {

	
	@Query("SELECT a FROM Comments a WHERE a.from_person = :name")
	Comments findUserByUserByName(@Param("name") String name);
	
	@Query("SELECT a FROM Comments a WHERE DATE(a.dateofcomment) = :date")
	Comments findUserByUserDate(@Param("date") LocalDate date);
}

