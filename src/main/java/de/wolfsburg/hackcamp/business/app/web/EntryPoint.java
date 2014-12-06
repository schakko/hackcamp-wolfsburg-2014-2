package de.wolfsburg.hackcamp.business.app.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class EntryPoint {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.addObject("mein_text", "Hallo Welt");

		mav.setViewName("app/index");
		return mav;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView postIndex( ModelAndView mav, @RequestParam("name") String name, HttpServletRequest request) {
		mav.addObject("mein_text", "Hallo Welt" + name  + request.getContextPath());
		

		mav.setViewName("app/index");
		return mav;
	}
}
