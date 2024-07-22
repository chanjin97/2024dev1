package com.study.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.spring.entity.DiaryImage;

public interface DiaryImageRepository extends JpaRepository<DiaryImage, Long> {
 // JpaRepository를 상속받아 기본적인 CRUD 메서드 제공
}
