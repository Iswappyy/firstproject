package com.pro.wings.dao;

import java.util.List;

import com.pro.wings.entity.ServerManagement;

public interface ServerManagementDao {
	
	public boolean addServer(ServerManagement entity);
	
	public List<ServerManagement> getServerList();

	public ServerManagement getServerById(int serverId);


}
