package com.example.demo.contacts.entity;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Comments {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ID;
	private String from_person;
	private LocalDateTime dateofcomment;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getFrom_person() {
		return from_person;
	}
	public void setFrom_person(String from_person) {
		this.from_person = from_person;
	}
	public LocalDateTime getDateofcomment() {
		return dateofcomment;
	}
	public void setDateofcomment(LocalDateTime dateofcomment) {
		this.dateofcomment = dateofcomment;
	}
	@Override
	public String toString() {
		return "Comments [ID=" + ID + ", from_person=" + from_person + ", dateofcomment=" + dateofcomment + "]";
	}
	public Comments(Long iD, String from_person, LocalDateTime dateofcomment) {
		super();
		ID = iD;
		this.from_person = from_person;
		this.dateofcomment = dateofcomment;
	}
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
