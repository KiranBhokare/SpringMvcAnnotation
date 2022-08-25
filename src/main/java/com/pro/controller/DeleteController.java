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
public class DeleteController {

	@Autowired
	ServerService service;

	@Autowired
	Server server;

	
	@RequestMapping(value = "/deleteserverDetail", method = RequestMethod.GET)
	public ModelAndView deleteserverDetail(@RequestParam("serverId") String id) {
		 int Id = Integer.parseInt(id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		
		String res = null;
		if (service.deleteServerDetail(Id))
			res="Server details deleted successfully ";
		else
			res= "Unable to delete Server details";
		
		mv.addObject("res",res);
		return mv;
	}
	
}
