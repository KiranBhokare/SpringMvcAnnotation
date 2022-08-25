package com.pro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Server {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Server_Id")
	private int serverId;
	private String serverName;
	private String serverIp;
	private String serverCapacity;
	private String isActive;
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	public String getServerCapacity() {
		return serverCapacity;
	}
	public void setServerCapacity(String serverCapacity) {
		this.serverCapacity = serverCapacity;
	}
	public String isActive() {
		return isActive;
	}
	public void setActive(String isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return " Server Detail [serverId=" + serverId + ", serverName=" + serverName + ", serverIp=" + serverIp
				+ ", serverCapacity=" + serverCapacity + ", isActive=" + isActive + "]";
	}
	
}
	
