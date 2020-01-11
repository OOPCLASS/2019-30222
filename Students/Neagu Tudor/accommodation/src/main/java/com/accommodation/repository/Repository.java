package com.accommodation.repository;

import java.util.List;

import com.accommodation.model.AbstractEntity;

public interface Repository<T extends AbstractEntity> {

	T save(T entity);
	
	T findById(Long id);
	
	List<T> findAll();
	
	boolean delete(T entity);

	boolean deleteById(Long id);
}
