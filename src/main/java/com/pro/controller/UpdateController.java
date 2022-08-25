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
public class UpdateController {
	@Autowired
	ServerService service;

	@Autowired
	Server server;

	@RequestMapping(value = "/updateServerDetail", method = RequestMethod.POST)
	public ModelAndView updateServerDetail(@RequestParam ("serverId") String id ,@RequestParam("serverName") String name, @RequestParam("serverIp") String ip ,@RequestParam("serverCapacity") String capacity,
			@RequestParam("serverStatus") String status)
	{

		server.setServerName(name);
		server.setServerIp(ip);
		server.setServerCapacity(capacity);
		server.setActive(status);

		int Id= Integer.parseInt(id);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");

		String res = null;

		if (service.updateServerDetail(server,Id)) {
			res = "employee details saved in database Successfully!!!";
			mv.addObject("res", res);
		} else {
			res = "unable to save employee details in database!!!";
			mv.addObject("res", res);
		}
		return mv;
		
//		@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
//		public ModelAndView saveEmployee(@RequestParam("name") String name, @RequestParam("salary") String salary,@RequestParam("id") String id) 
//		{
//
//			emp.setName(name);
//			emp.setSalary(Integer.parseInt(salary));
//		//	emp.setEmpId(Integer.parseInt(id));
//			int Id= Integer.parseInt(id);
//
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("welcome");
//
//			String res = null;
//
//			if (service.updateEmployee(emp,Id)) {
//				res = "employee details saved in database Successfully!!!";
//				mv.addObject("res", res);
//			} else {
//				res = "unable to save employee details in database!!!";
//				mv.addObject("res", res);
//			}
//			return mv;
//	}
}
	
}