package com.portfolio.main.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.portfolio.main.board.dto.TestDTO;

@Mapper
public interface TestMapper {

	public List<TestDTO> getAll() throws Exception;
	
}
