package com.study.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.study.spring.entity.Diary;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
	// JpaRepository를 상속받아 기본적인 CRUD 메서드 제공
	
	@Query("SELECT d "
			+ " from Diary d "
			+ " left join fetch d.images ")
	List<Diary> findAllWithImages();
	
	@Query("select d "
			+ " from Diary d "
			+ " left join fetch d.images "
			+ " where d.id = :id ")
	Optional<Diary> findByIdWithImages(@Param("id") Long id);
}
