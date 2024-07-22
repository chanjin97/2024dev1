package com.study.spring.service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.spring.entity.Diary;
import com.study.spring.entity.DiaryImage;
import com.study.spring.repository.DiaryImageRepository;
import com.study.spring.repository.DiaryRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DiaryService {

	private final DiaryRepository diaryRepository;
	private final DiaryImageRepository diaryImageRepository;
	
	public Diary createDiary(Diary diary, List<String> imageUrls) {
		diary.setCreatedAt(ZonedDateTime.now()); // 생성시간 설정
		Diary savedDiary = diaryRepository.save(diary); // diary 저장
		
		if (imageUrls != null && !imageUrls.isEmpty()) {
			List<DiaryImage> images = imageUrls.stream()
					.map(url -> DiaryImage.builder()
							.diary(savedDiary)
							.imageURL(url)
							.createdAt(ZonedDateTime.now())
							.build())
					.collect(Collectors.toList()); // diaryImage 객체 리스트 생성
			diaryImageRepository.saveAll(images); // diaryImage 리스트 저장
			savedDiary.setImages(images); // diary에 이미지 리스트 설정
		}
		return savedDiary;
	}
	
	// 모든 diary 조회
	public List<Diary> getAllDiaries() {
		return diaryRepository.findAllwithImages();
	}
	
	// 해당 id 로 diary조회
	public Diary getDiaryById(Long id) {
		return diaryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Diary 가 없습니다"));
	}
	
	@Transactional
	public Diary updateDiary(Long id, Diary diaryView) {
		Diary diary = getDiaryById(id); // 기존 diary 조회
		diary.setContent(diaryView.getContent()); // 내용 업데이트
		diary.setCategory(diaryView.getCategory()); // 카테고리 업데이트
		
		return diaryRepository.save(diary); // 변경사항 저장
	}

	@Transactional
	public void deleteDiary(Long id) {
		diaryRepository.deleteById(id); // id로 diary 삭제
	}
	
	
}







