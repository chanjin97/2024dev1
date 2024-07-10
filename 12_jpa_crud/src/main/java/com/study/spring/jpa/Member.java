package com.study.spring.jpa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="jpamember1")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@Getter
//@Setter
@Builder
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	@Column(name="create_date")
	private LocalDate createDate;
	
	
	// @Setter를 사용 안할때
//	public void changeUsername(String username) {
//		this.username = username;
//	}
//	public void changeCreateDate(LocalDate createDate) {
//		this.createDate = createDate;
//	}
	

	
	
}











