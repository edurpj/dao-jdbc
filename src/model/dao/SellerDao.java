package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;


public interface SellerDao {
		
	static void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
