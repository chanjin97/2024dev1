package com.study.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyDAO {
	@Autowired
	private JdbcTemplate JdbcTemplateName;
	
	public List<MyDTO> list () {
		String query = "select * from mybbs1";
		List<MyDTO> list = JdbcTemplateName.query(
				query, new BeanPropertyRowMapper<>(MyDTO.class) 
				);
		return list;
	}
}
