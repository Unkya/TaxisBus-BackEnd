package com.nawak.taxisBus.services;

import java.util.List;

public interface CRUDService<T> {

	public T create(T user);
	public void delete(T user);
	public T save(T user);
	public T save(Long id, T user);
	
	public List<T> list();
	public T get(Long id);
}
