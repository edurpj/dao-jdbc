package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		// Seller seller = new Seller();
		// seller.setBaseSalary(3000);
		// seller.setName("Teste");
		
		Scanner sc = new Scanner(System.in);
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
		
		/*System.out.println("________ TEST 4: Seller insert: ________ ");
		Seller newSeller = new Seller(null, "Kayd", "kayd@gmail.com", new Date(), (double) 5000, department);
		SellerDaoJDBC sellerDaoJDBC = new SellerDaoJDBC(null);
		sellerDaoJDBC.insert(newSeller);
		System.out.println("Inserted " + newSeller.getId()); */
		
		System.out.println("________ TEST 5: Seller Update: ________ ");
		
		seller = sellerDao.findById(1);
		seller.setName("Joel");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("________ TEST 6: Seller Delete: ________ ");
		System.out.println("Enter de id number for delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		sc.close();
	}
	
}
