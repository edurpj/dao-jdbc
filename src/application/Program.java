package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		//Seller seller = new Seller();
		//seller.setBaseSalary(3000);
		//seller.setName("Teste");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("________ TEST 1: find By id: ________ ");
		Seller seller = sellerDao.findById(3);	
		System.out.println(seller);
		
		
		

	}

}
