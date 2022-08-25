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
public class SaveController {

	@Autowired
	ServerService service;

	@Autowired
	Server server;

	@RequestMapping(value = "/addServerDetail", method = RequestMethod.POST)
	public ModelAndView saveServerdetail(@RequestParam("serverName") String name, @RequestParam("serverIp") String ip ,@RequestParam("serverCapacity") String capacity,
			@RequestParam("serverStatus") String status)
	{
		server.setServerName(name);
		server.setServerIp(ip);
		server.setServerCapacity(capacity);
		server.setActive(status);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");

		String res = null;

		if (service.saveServerDetail(server)) {
			res = "server details saved in database Successfully!!!";
			mv.addObject("res", res);
		} else {
			res = "unable to save server details in database!!!";
			mv.addObject("res", res);
		}
		return mv;
	}
}
