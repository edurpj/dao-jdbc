package application;

import com.mysql.fabric.xmlrpc.base.Data;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Seller seller = new Seller();
		//seller.setBaseSalary(3000);
		seller.setName("Teste");
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		System.out.println(seller);

	}

}
