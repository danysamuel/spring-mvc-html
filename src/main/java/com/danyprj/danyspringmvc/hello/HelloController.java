package com.danyprj.danyspringmvc.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}

	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView hello(@RequestParam("name") String name) {
		 ModelAndView model = new ModelAndView("hello");
		model.addObject("hello", name);
		return model;
	}
}
