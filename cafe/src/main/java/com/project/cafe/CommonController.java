package com.project.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/common")
public class CommonController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView common(Locale locale) {
		ModelAndView model = new ModelAndView();		
		
		List<String> Names = new ArrayList<String>();
		String[] name = {"홍길동", "임꺽정", "고길동"};
		for(String n : name) Names.add(n);
		
		List<Integer> Ages = new ArrayList<Integer>();
		int[] ages = {52, 66, 72};
		for(int a : ages) Ages.add(a);
		
		model.addObject("Ages", Ages );
//		model.addObject("Names", Names );
		model.setViewName("common/common");
		
		return model;
	}

}
