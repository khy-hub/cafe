package com.project.cafe;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		ModelAndView model = new ModelAndView();		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addObject("serverTime", formattedDate );
		model.setViewName("home");
		
		return model;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(Locale locale) {
		ModelAndView model = new ModelAndView();		
		
		model.addObject("PageName", "index" );
		model.setViewName("index");
		
		return model;
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView main(Locale locale) {
		ModelAndView model = new ModelAndView();		
		
		model.addObject("PageName", "main" );
		model.setViewName("main");
		
		return model;
	}
	
}
