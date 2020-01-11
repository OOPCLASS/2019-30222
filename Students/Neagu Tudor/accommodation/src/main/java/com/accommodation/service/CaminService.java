package com.accommodation.service;

import java.util.List;

import com.accommodation.model.Camin;
import com.accommodation.repository.CaminRepository;

public class CaminService implements Service<Camin> {

	private CaminRepository caminRepository= new CaminRepository();
	
	@Override
	public Camin save(Camin entity) {
		// TODO Auto-generated method stub
		return caminRepository.save(entity);
	}

	@Override
	public Camin findById(Long id) {
		// TODO Auto-generated method stub
		return caminRepository.findById(id);
	}

	@Override
	public List<Camin> findAll() {
		// TODO Auto-generated method stub
		return caminRepository.findAll();
	}

	@Override
	public boolean delete(Camin entity) {
		// TODO Auto-generated method stub
		return caminRepository.delete(entity);
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return caminRepository.deleteById(id);
	}
	
	public List<Camin> findByAdmin(String admin){
		return caminRepository.findByAdmin(admin);
	}
	
	public List<Camin> findByAdress(String adress){
		return caminRepository.findByAdress(adress);
	}

}
