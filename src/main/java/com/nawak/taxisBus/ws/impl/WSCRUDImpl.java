package com.nawak.taxisBus.ws.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nawak.taxisBus.services.CRUDService;

public abstract class WSCRUDImpl<T> {

	private CRUDService<T> service;
	
	public WSCRUDImpl(CRUDService<T> service) {
		this.service = service;
	}

	
    public List<T> list() {
    	return service.list();
	}

	public T get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	public T add(T object) {
		return service.create(object);
	}

	public T update(@PathVariable("id") Long id, T object) {
		return service.save(id, object);
	}

	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		T object = service.get(id);
		service.delete(object);
		return;
	}

}
