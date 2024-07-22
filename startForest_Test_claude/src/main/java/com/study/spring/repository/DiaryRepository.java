package com.study.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.study.spring.entity.Diary;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
	// JpaRepository를 상속받아 기본적인 CRUD 메서드 제공
	
	@Query("SELECT d"
			+ "from Diary d"
			+ "left join fetch d.images")
	List<Diary> findAllWithImages();
	
}
