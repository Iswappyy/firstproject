package com.pro.wings.service;

import java.util.List;

import com.pro.wings.entity.ServerManagement;

public interface ServerManagementService { 
	
	public boolean addServer(ServerManagement servermanage);

	public List<ServerManagement> getServerList();

	public ServerManagement getServerById(int serverId);
}
