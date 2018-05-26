package com.nawak.taxisBus.services.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nawak.taxisBus.services.CRUDService;

public class CRUDServiceImpl<T> implements CRUDService<T>{
	
	private JpaRepository<T, Long> repository;

	public CRUDServiceImpl(JpaRepository<T, Long> repository) {
		this.repository = repository;
	}
	
	@Override
	public T create(T object) {
		return repository.save(object);
	}

	@Override
	public void delete(T object) {
		
		repository.delete(object);
		return;
	}

	@Override
	public T save(T object) {
		return repository.save(object);
	}

	@Override
	public List<T> list() {
		return repository.findAll();
	}

	@Override
	public T get(Long id) {
		return repository.getOne(id);
	}

	@Override
	public T save(Long id, T object) {
		return save(object);
	}

}
