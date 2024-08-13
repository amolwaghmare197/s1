package com.example.demo.contacts.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.contacts.entity.Comments;
import com.example.demo.contacts.repositpory.comments_repo;
import com.example.demo.contacts.service.commentSServices;

@RestController
@RequestMapping("/api")
public class HomeController {
	

	
	@Autowired
	private commentSServices cmmentService;
	
	@GetMapping("/v1/all")
	public void getall() {
		System.out.println(cmmentService.allComment());
	}
	
	@GetMapping("/v1/name")
	public void getOnName(@RequestParam("name") String name) {
		System.out.println(cmmentService.getByName(name));
	}
	
	@GetMapping("/v1/date")
	public void getOnDate(@RequestParam("date") LocalDate date) {
		System.out.println(cmmentService.getByDate(date));
	}
	
}
