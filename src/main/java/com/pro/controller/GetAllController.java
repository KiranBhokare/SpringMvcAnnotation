package com.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.pro.entity.Server;
import com.pro.service.ServerService;

@Controller
public class GetAllController {

	@Autowired
	ServerService service;

	@Autowired
	Server server;
	
	@RequestMapping(value = "/getAllServerDetails", method = RequestMethod.GET)
	public ModelAndView getAllServerDetails() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		
		String res = service.getAllServerDetails().toString();
		
		mv.addObject("res",res);
		return mv;
	}
	
}
