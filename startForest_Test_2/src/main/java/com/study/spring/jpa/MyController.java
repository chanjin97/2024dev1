package com.study.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diary")
public class MyController {

	@Autowired
	DiaryService diaryService;

	@PostMapping("/list")
	public String create(
			@RequestParam("")
			) {
		
	}
	
}
