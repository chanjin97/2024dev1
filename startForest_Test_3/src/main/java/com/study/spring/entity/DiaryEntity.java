package com.study.spring.entity;

import java.time.ZonedDateTime;

import jakarta.persistence.Column;
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
@Table(name="Diary")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiaryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int reservationId;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	private String category;
	
	private ZonedDateTime createdAt;

	public void changeContent(String content) {
		this.content = content;
	}
	
	
	
}
