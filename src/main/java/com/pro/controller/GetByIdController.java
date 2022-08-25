package com.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.pro.entity.Server;
import com.pro.service.ServerService;

@Controller
public class GetByIdController {
	@Autowired
	ServerService service;

	@Autowired
	Server server;

	
	@RequestMapping(value ="/getServerDetailByid", method = RequestMethod.GET)
	public ModelAndView getServerDetailById(@RequestParam("serverId") String id) {
		 int Id = Integer.parseInt(id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		
		String res = service.getServerDetailById(Id).toString();
		
		mv.addObject("res",res);
		return mv;
	}
	

}
