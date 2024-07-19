package com.study.spring.dto;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiaryDTO {

	private Long id;
	private Long reservationId;
	private String content;
	private String category;
	private ZonedDateTime createdAt;
}
