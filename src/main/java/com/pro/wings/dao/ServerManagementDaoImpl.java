package com.pro.wings.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pro.wings.entity.ServerManagement;

@Repository
public class ServerManagementDaoImpl implements ServerManagementDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addServer(ServerManagement entity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction txs = session.beginTransaction();
			session.save(entity);
			txs.commit();
			session.close();
			return true;
		}
       catch(Exception e) {
    	   System.out.println("Server not able save to database");
    	   e.printStackTrace();
    	   return false;
       }   	     
	}

	@Override
	public List<ServerManagement> getServerList() {
		String query = "from ServerManagement";
		try {
			Session session = sessionFactory.openSession();
			Transaction txs = session.beginTransaction();
			Query q = session.createQuery(query);
			List<ServerManagement> serverList = q.list();
			
			for(ServerManagement server : serverList) {
				System.out.println("List of Server");
				System.out.println(server.getServerName() + " : " + server.getServerIp() + " : " + server.getServerCapacity());
			}
			txs.commit();
			System.out.println("Succesfully retrived All list of Server..");
			session.close();
			return serverList;
		}catch(Exception e) {
			System.out.println("List of Server NOT found..");
			return null;
		}
		
	}

	@Override
	public ServerManagement getServerById(int serverId) {
		ServerManagement entity;
		String query ="from ServerManagement server where server.serverId =: serverId";
		try {
			Session session = sessionFactory.openSession();
			Transaction txc = session.beginTransaction();
			Query q1 = session.createQuery(query);
			q1.setParameter("serverId",serverId);
			entity = (ServerManagement)q1.uniqueResult();
			txc.commit();
            System.out.println("succesfully got required Server..");
            System.out.println(entity);
            session.close();
			return entity;
		}catch(Exception e) {
			System.out.println("Not get required servar...");
			e.printStackTrace();
			return null;
		}
		
	}

}
