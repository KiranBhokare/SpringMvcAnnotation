package com.pro.service;

import java.util.List;

import com.pro.entity.Server;

public interface ServerService {

    public boolean saveServerDetail(Server entity);
	
	public Server getServerDetailById (int Id);
	
	public List<Server> getAllServerDetails();
	
	public boolean updateServerDetail(Server entity, int Id);
	
	public boolean deleteServerDetail(int Id);
}
