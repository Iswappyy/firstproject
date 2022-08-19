package com.pro.wings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.wings.dao.ServerManagementDao;
import com.pro.wings.entity.ServerManagement;

@Service
public class ServerManagementServiceImpl implements ServerManagementService{
	
	@Autowired
	ServerManagementDao serverDao;

	@Override
	public boolean addServer(ServerManagement servermanage) {
		return serverDao.addServer(servermanage);
	}

	@Override
	public List<ServerManagement> getServerList() {
		return serverDao.getServerList();
	}

	@Override
	public ServerManagement getServerById(int serverId) {
		return serverDao.getServerById(serverId);
	}

}
