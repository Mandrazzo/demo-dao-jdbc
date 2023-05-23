package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {
	
	void insert(Departament obj);
	void update(Departament obg);
	void deleteById(Integer id);
	Departament findById(Integer id);
	List<Departament> findAll();

}
