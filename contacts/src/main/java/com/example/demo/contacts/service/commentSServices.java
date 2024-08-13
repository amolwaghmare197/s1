package com.example.demo.contacts.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.contacts.entity.Comments;

@Service
public interface commentSServices {

	public List<Comments> allComment();
	
	public Comments getByDate(LocalDate date);
	
	public Comments getByName(String name);
}
