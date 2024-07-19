package com.study.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.dto.DiaryDTO;
import com.study.spring.service.DiaryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/diary")
@RequiredArgsConstructor
@Log4j2
public class DiaryController {

	private final DiaryService diaryService;
	
	// 게시물 생성
	@PostMapping
	public void createDiary(
			@RequestBody DiaryDTO diaryDTO
			) {
		diaryService.createDiary(diaryDTO);
		
		log.info("post 성공");
	}
	
	// 전체 리스트 조회
	@GetMapping("/list")
	public List<DiaryDTO> getAllDiaries() {
		return diaryService.getAllDiaries().stream()
				.map(entity -> new DiaryDTO(
						entity.getId(),
						entity.getReservationId(),
						entity.getContent(),
						entity.getCategory(),
						entity.getCreatedAt()
						))
				.toList();
		
//		log.info("전체 리스트 조회성공");
	}
	
	// 해당 아이디의 기록 조회
	@GetMapping("/view/{id}")
	public DiaryDTO getDiaryById(@PathVariable Long id) {
//		log.info("해당 아이디 기록 조회 성공");
		
		return diaryService.getDiaryById(id);
		
	}
	
	// 수정 - 아직 미구현
	@PutMapping("/{id}")
	    public void updateDiary(@PathVariable Long id, @RequestBody DiaryDTO diaryDTO) {
	        // TODO: Implement update logic in service
	    }
	
	@DeleteMapping("/view/{id}")
	public void deleteDiary (
			@PathVariable("id") Long id
			) {
		diaryService.deleteDiary(id);
		
//		log.info("해당 기록 삭제 성공");
	}
	
}
