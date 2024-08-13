package com.example.demo.contacts.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.contacts.entity.Comments;
import com.example.demo.contacts.repositpory.comments_repo;

@Service
public class commentsServiceImpl implements commentSServices {

	@Autowired
	private comments_repo commentRepo;
	
	@Override
	public List<Comments> allComment() {
		// TODO Auto-generated method stub
		return commentRepo.findAll();
	}

	@Override
	public Comments getByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return commentRepo.findUserByUserDate(date);
	}

	@Override
	public Comments getByName(String name) {
		// TODO Auto-generated method stub
		return commentRepo.findUserByUserByName(name);
	}

}
