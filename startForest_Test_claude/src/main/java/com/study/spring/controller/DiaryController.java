package com.study.spring.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.dto.DiaryCreateRequest;
import com.study.spring.dto.DiaryDTO;
import com.study.spring.entity.Diary;
import com.study.spring.entity.DiaryImage;
import com.study.spring.service.DiaryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/diary")
@RequiredArgsConstructor
@Log4j2
public class DiaryController {

	public final DiaryService diaryService;
	
	// 별숲기록 생성
	@PostMapping
	public ResponseEntity<DiaryDTO> createDiary(@RequestBody DiaryCreateRequest request) {
		Diary diary = Diary.builder()
				.content(request.getContent())
				.category(request.getCategory())
				.build(); // diary 객체생성
		
		Diary createdDiary = diaryService.createDiary(diary, request.getImageUrls());
		
		return ResponseEntity.ok(convertToDTO(createdDiary)); // 생성된diary를 DTO로 변환하여 return(반환)
	}
	
	// 모든 별숲기록 조회
	@GetMapping("/list")
	public ResponseEntity<List<DiaryDTO>> getAllDiaries() {
		List<Diary> diaries = diaryService.getAllDiaries();
		List<DiaryDTO> diaryDTOs = diaries.stream().map(this::convertToDTO).collect(Collectors.toList());
		
		return ResponseEntity.ok(diaryDTOs); // 모든 diary를 DTO 리스트로 변환하여 반환
	}
	
	// 해당 별숲기록 view
	@GetMapping("/view/{id}")
	public ResponseEntity<DiaryDTO> getDiary(@PathVariable("id") Long id) {
		Diary diary = diaryService.getDiaryById(id);
		
		return ResponseEntity.ok(convertToDTO(diary)); // 특정 ID의 Diary를 DTO로 변환하여 반환
	}
	
	// 해당 별숲기록 수정하기
	@PutMapping("/view/{id}")
	public ResponseEntity<DiaryDTO> updateDiary(
			@PathVariable("id") Long id, @RequestBody DiaryCreateRequest request
			) {
		Diary diaryView = Diary.builder()
				.content(request.getContent())
				.category(request.getCategory())
				.build(); // 업데이트할 diary 정보쇙성
		
		Diary updatedDiary = diaryService.updateDiary(id, diaryView);
		
		return ResponseEntity.ok(convertToDTO(updatedDiary)); // 업데이트된 diary를 DTO로 변환하여 반환
	}
	
	// 해당 별숲기록 삭제
	@DeleteMapping("/view/{id}")
	public ResponseEntity<Void> deleteDiary(@PathVariable("id") Long id) {
		diaryService.deleteDiary(id);
		
		log.info("delete success" + id);
		return ResponseEntity.noContent().build(); // 삭제후 204 No Content 응답 ?
	}
		
	
	private DiaryDTO convertToDTO(Diary diary) {
		return DiaryDTO.builder()
				.id(diary.getId())
				.content(diary.getContent())
				.category(diary.getCategory())
				.createdAt(diary.getCreatedAt())
				.imageUrls(diary.getImages().stream().map(DiaryImage::getImageURL).collect(Collectors.toList()))
				.build(); // diary Entity 를 diaryDTO로 변환
	}
	
	
}






