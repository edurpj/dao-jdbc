package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		// Seller seller = new Seller();
		// seller.setBaseSalary(3000);
		// seller.setName("Teste");

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("________ TEST 1: find By id: ________ ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("________ TEST 2: find By department: ________ ");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("________ TEST 3: find all: ________ ");

		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
