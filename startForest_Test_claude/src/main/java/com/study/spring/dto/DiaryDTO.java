package com.study.spring.dto;

import java.time.ZonedDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiaryDTO {

	private Long id;
	private String content;
	private String category;
	private ZonedDateTime createdAt;
	private List<String> imageUrls;
}
