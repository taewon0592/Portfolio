package com.portfolio.main.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.main.board.dto.TestDTO;
import com.portfolio.main.board.mapper.TestMapper;

@Service
public class TestService {

	@Autowired
	TestMapper testMapper;
	
	public List<TestDTO> getAll() throws Exception{
		
		return testMapper.getAll();
	}
	
}
