package com.portfolio.main.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.portfolio.main.board.dto.TestDTO;
import com.portfolio.main.board.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/query")
	public @ResponseBody List<TestDTO> query() throws Exception{
		return testService.getAll();
	}
	
	@RequestMapping("/jsp")
	public String jsp() throws Exception {
		return "test";
	}
	
	@RequestMapping("mav")
	public ModelAndView mav() throws Exception{
		ModelAndView mav = new ModelAndView("mavSample");
		
		mav.addObject("key", "fruits");
		
		List<String> fruitList = new ArrayList<String>();
		
		fruitList.add("apple");
		fruitList.add("pineapple");
		
		mav.addObject("value", fruitList);
		
		return mav;
		
	}
}
