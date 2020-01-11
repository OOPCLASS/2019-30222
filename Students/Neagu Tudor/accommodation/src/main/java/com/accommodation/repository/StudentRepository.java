package com.accommodation.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.accommodation.model.Student;
import com.accommodation.service.HibernateService;
@SuppressWarnings("unchecked")
public class StudentRepository implements Repository<Student> {

	@Override
	public Student save(Student entity) {
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
	public Student findById(Long id) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Student found=(Student) databaseSession.get(Student.class, id);
		databaseSession.close();
		return found;
	}

	@Override
	public List<Student> findAll() {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		Query query=databaseSession.createQuery("from com.accommodation.model.Student C");
		List<Student> result=query.list();
		databaseSession.close();
		return result;
	}

	@Override
	public boolean delete(Student entity) {
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
		Student found=(Student) databaseSession.get(Student.class, id);
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

}
