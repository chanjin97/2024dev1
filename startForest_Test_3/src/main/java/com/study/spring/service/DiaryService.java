package com.study.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.spring.dto.DiaryDTO;
import com.study.spring.entity.DiaryEntity;
import com.study.spring.repository.DiaryRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DiaryService {

	private final DiaryRepository diaryRepository;
	
	// 생성
	@Transactional
	public void createDiary(DiaryDTO diaryDTO) {
		
		
		DiaryEntity diary = DiaryEntity.builder()
				.reservationId(diaryDTO.getReservationId())
				.category(diaryDTO.getCategory())
				.createdAt(diaryDTO.getCreatedAt())
				.build();
		
		diaryRepository.save(diary);
		
//		DiaryEntity saveEntity = diaryRepository.save(diaryEntity);
//		return convertToDTO(saveEntity);
	}
	
	// 삭제
	public void deleteDiary(Long diaryId) {
		DiaryEntity diary = diaryRepository.findById(diaryId).orElseThrow();
		diaryRepository.delete(diary);
	}

	// 리스트 조회
	public List<DiaryEntity> getAllDiaries() {
		return diaryRepository.findAll();
	}
	
	// 하나의 기록 조회
	public DiaryDTO getDiaryById(Long id) {
		DiaryEntity diary = diaryRepository.findById(id).orElseThrow(()-> new RuntimeException("DiaryId not found: " + id));
		return new DiaryDTO(
				diary.getId(),
				diary.getReservationId(),
				diary.getContent(),
				diary.getCategory(),
				diary.getCreatedAt()
				);
	}
	
//	private Object convertToDTO(DiaryEntity saveEntity) {
//		return DiaryDTO.builder()
//				
//				.build();
//	}
	
	
}
