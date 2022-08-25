package com.pro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.pro.entity.Server;

@Repository
public class ServerDaoImpl implements ServerDao {
	
	@Autowired
	SessionFactory factory;

	@Override
	public boolean saveServerDetail(Server entity) {
		Session session = null;
		try {
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
			session.save(entity);
			
			tx.commit();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public Server getServerDetailById(int Id) {
		Session session = null;
		try {
			session = factory.openSession();
			
			return session.get(Server.class, Id);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null ;
		} finally {
			session.close();
		}
	}

	@Override
	public List<Server> getAllServerDetails() {
		Session session = null;
		try {
			session = factory.openSession();
			
			return session.createQuery("from Server").list();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean updateServerDetail(Server entity, int Id) {
		Session session = null;
		try {
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(entity);
			
			tx.commit();
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
			
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteServerDetail(int Id) {

		Session session = null;
		try {
			session = factory.openSession();
			Transaction tx = session.beginTransaction();			
			Server e1 =session.get(Server.class, Id);		
			session.delete(e1);
		tx.commit();
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
			
		} finally {
			session.close();
		}
	
	}

}
