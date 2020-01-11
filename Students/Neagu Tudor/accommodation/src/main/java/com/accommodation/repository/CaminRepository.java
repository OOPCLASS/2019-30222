package com.accommodation.repository;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.accommodation.model.Camin;
import com.accommodation.service.HibernateService;
@SuppressWarnings("unchecked")
public class CaminRepository implements Repository<Camin>{

	
	
	
	@Override
	public Camin save(Camin entity) {//saves entity into the camin table in the database
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
	public Camin findById(Long id) {//return Camin object whose id you want
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Camin found=(Camin) databaseSession.get(Camin.class, id);
		databaseSession.close();
		return found;
	}

	@Override
	public List<Camin> findAll() {//return a list <Camin> with all of the Camine
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Query query=databaseSession.createQuery("from com.accommodation.model.Camin C");
		List<Camin> result=query.list();
		databaseSession.close();
		return result;
		
	
	}

	@Override
	public boolean delete(Camin entity) {//delete the camin you specify as Camin object
		
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
	public boolean deleteById(Long id) {//delete the camin with the id you specify; return true if succedeed, false if not (boolean)
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Camin found=(Camin) databaseSession.get(Camin.class, id);
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
	
	public List <Camin> findByAdmin(String admin)//returns list with all of the Camine with the admin like the specified string
	{
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Query query=databaseSession.createQuery("from com.accommodation.model.Camin C WHERE C.admin = :param");
		query.setParameter("param",admin);
		List<Camin> result=query.list();
		databaseSession.close();
		return result;
	}
	
	public List<Camin> findByAdress(String adress)//returns list with all of the Camine with the adress like the specified string
	{
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Query query=databaseSession.createQuery("from com.accommodation.model.Camin C WHERE C.adress = :param");
		query.setParameter("param",adress);
		List<Camin> result=query.list();
		databaseSession.close(); 
		return result;
	}
	
}
	

