package com.study.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
// 너는 레파지토리이다, MyDAO라는 저장소이다
public class MyDAO {
	@Autowired
	private JdbcTemplate jdbcTemplatename;
	
	public List<MyDTO> list () {
		String query = "select * from mybbs1 order by id desc";
		List<MyDTO> list = jdbcTemplatename.query(
				query, new BeanPropertyRowMapper<>(MyDTO.class)
				);
		return list;
	}

}
