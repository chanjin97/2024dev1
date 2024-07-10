package com.study.spring.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryService {

	@Autowired
	private DiaryRepository diaryRepository;
	
	public Diary create(Diary diary) {
		Diary returnDiary = diaryRepository.save(diary);
		return returnDiary;
	}
	
	// 리스트 페이지
	public List<Diary> selectAll() {
		return diaryRepository.findAll();
	}
	
	// view 페이지  하나의 데이터
	public Optional<Diary> select(Long id) {
		Optional<Diary> diary = diaryRepository.findById(id);
		return diary;
	}
	
	// 삭제
	public void delete(Long id) {
		diaryRepository.deleteById(id);
	}
	
	// 업데이트후 저장
	public Diary update(Diary diary) {
		
		// 존재하는 Diary 엔티티 검색 없을시 diary not found
		Diary existingDiary = diaryRepository.findById(diary.getId())
				.orElseThrow(() -> new RuntimeException("Diary not found!"));
		
		// 필드 업데이트
		existingDiary.changeContent(diary.getContent());
				
		// 업데이트된 Diary 엔티티를 저장
		return diaryRepository.save(existingDiary);
				
				
	}
}








