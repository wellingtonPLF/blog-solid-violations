package br.edu.ifpb.padroes.dao;

import java.util.List;

public interface DAOinterface<T> {
	public void add(T obj);
	public T get(Long id);
	public void update(T obj);
	public void delete(T obj) ;
	public List<T> list();
}
