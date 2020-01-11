package com.accommodation.service;

import java.util.List;

import com.accommodation.model.Student;
import com.accommodation.repository.StudentRepository;
public class StudentService implements Service<Student> {
	
	private StudentRepository studentRepository= new StudentRepository();
	
	@Override
	public Student save(Student entity) {
		// TODO Auto-generated method stub
		return studentRepository.save(entity);
	}

	@Override
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public boolean delete(Student entity) {
		// TODO Auto-generated method stub
		return studentRepository.delete(entity);
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.deleteById(id);
	}

}
