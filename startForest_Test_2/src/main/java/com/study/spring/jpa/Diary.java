package com.study.spring.jpa;

import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="startforestdiary")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Diary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int reservationId;
	private String content;
	private String category;
	private ZonedDateTime createdAt;
	
	
	public void changeContent(String content) {
		this.content = content;
	}
	
	
	
	
}
