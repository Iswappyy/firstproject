package com.pro.wings.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity

public class ServerManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int serverId;
	String serverName;
	String ServerIp;
	String serverCapacity;
	
	public ServerManagement() {
		super();
		
	}
	public ServerManagement(int serverId, String serverName, String serverIp, String serverCapacity) {
		super();
		this.serverId = serverId;
		this.serverName = serverName;
		this.ServerIp = serverIp;
		this.serverCapacity = serverCapacity;
	}
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
		return ServerIp;
	}
	public void setServerIp(String serverIp) {
		ServerIp = serverIp;
	}
	public String getServerCapacity() {
		return serverCapacity;
	}
	public void setServerCapacity(String serverCapacity) {
		this.serverCapacity = serverCapacity;
	}
	@Override
	public String toString() {
		return "ServerManagement [serverId=" + serverId + ", serverName=" + serverName + ", ServerIp=" + ServerIp
				+ ", serverCapacity=" + serverCapacity + "]";
	}
	
	
	
	
}
