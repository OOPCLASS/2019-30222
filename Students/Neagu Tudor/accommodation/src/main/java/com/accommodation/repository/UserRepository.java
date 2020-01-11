package com.accommodation.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.accommodation.model.User;
import com.accommodation.service.HibernateService;
@SuppressWarnings("unchecked")
public class UserRepository implements Repository<User> {

	@Override
	public User save(User entity) {
		try{
			
			Session databaseSession = HibernateService.getSessionFactory().openSession();
			databaseSession.beginTransaction();
			
			databaseSession.saveOrUpdate(entity);
			databaseSession.save(entity);
			
			databaseSession.getTransaction().commit();
			databaseSession.close();
			
			}catch(HibernateException ex) {
				ex.printStackTrace();
			}
			return entity;
		}

	@Override
	public User findById(Long id) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		User found=(User) databaseSession.get(User.class, id);
		databaseSession.close();
		return found;
	}

	@Override
	public List<User> findAll() {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Query query=databaseSession.createQuery("from com.accommodation.model.User C");
		List<User> result=query.list();
		databaseSession.close();
		return result;
	}

	@Override
	public boolean delete(User entity) {
		try{
			Session databaseSession = HibernateService.getSessionFactory().openSession();
			databaseSession.beginTransaction();
			databaseSession.delete(entity);
			databaseSession.getTransaction().commit();
			databaseSession.close();
			
			return true;
			}catch(HibernateException e) {
				
				e.printStackTrace();
				return false;}
				
	}

	@Override
	public boolean deleteById(Long id) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		User found=(User) databaseSession.get(User.class, id);
		if(found!=null)
			{
			databaseSession.delete(found);
			databaseSession.getTransaction().commit();
			}
		databaseSession.close();
			if (found != null)
				return true;
			else
				return false;
		}
	
	public User findByCredentials(String username, String password)
	{
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Query query=databaseSession.createQuery("from com.accommodation.model.User U WHERE U.userName= :uname and U.password= :pass");
		query.setParameter("uname", username);
		query.setParameter("pass", password);
		List<User> result=query.list();
		databaseSession.close();
		if(result.size()!=0)
			return result.get(0);
		else
			return null;
	}
	public User findByUserName(String name) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Query query=databaseSession.createQuery("from com.accommodation.model.User U WHERE U.userName= :uname");
		query.setParameter("uname", name);		
		List<User> result=query.list();
		databaseSession.close();
		if(result.size()!=0)
			return result.get(0);
		else
			return null;
	}

}
