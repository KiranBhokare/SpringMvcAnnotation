package com.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pro.dao.ServerDao;

import com.pro.entity.Server;

@Service
public class ServerServiceImpl implements ServerService {
	
	@Autowired
	ServerDao serverDao;

	@Override
	public boolean saveServerDetail(Server entity) {
		return serverDao.saveServerDetail(entity);
	}

	@Override
	public Server getServerDetailById(int Id) {
		return serverDao.getServerDetailById(Id);
	}

	@Override
	public List<Server> getAllServerDetails() {
		return serverDao.getAllServerDetails();
	}

	@Override
	public boolean updateServerDetail(Server entity, int Id) {
		return serverDao.updateServerDetail(entity, Id);
	}

	@Override
	public boolean deleteServerDetail(int Id) {
		//System.out.println("Object is deleted...");
		return serverDao.deleteServerDetail(Id);
	}

}
