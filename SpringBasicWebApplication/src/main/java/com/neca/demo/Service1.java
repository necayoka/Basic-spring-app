package com.neca.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Service1 {

	@RequestMapping("/")
	public String home() {
		return "page1";
	}
	
	@RequestMapping("page1")
	public ModelAndView page1(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("tech") String tech) {
		
		ModelAndView mv = new ModelAndView();
		
		String result = "Name is " + name + ", age " + age + " and technology is " + tech;
		mv.addObject("result", result);
		mv.setViewName("page2");
		
		return mv;
	}
	
	@RequestMapping("page2")
	public ModelAndView page2(@RequestParam("year") String year) {
		
		ModelAndView mv = new ModelAndView();
		
		String result = "He is at " + year;
		mv.addObject("result", result);
		mv.setViewName("page3");
		
		return mv;
	}
	
}
