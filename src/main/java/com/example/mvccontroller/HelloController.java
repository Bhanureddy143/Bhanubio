package com.example.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping(value="/")
	public ModelAndView getresult(ModelAndView mv) {
		mv.addObject("name","Bhanuprakash Reddy Thummalapeta");
		mv.setViewName("Result");
		return mv;
	}
	


}
