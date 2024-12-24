package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1 = SELLER FINDBYID ====");

		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		System.out.println();
		System.out.println("=== TESTE 2 = SELLER FINDBYDEPARTMENT ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.err.println(obj);
		}
		System.out.println();
		System.out.println("=== TESTE 3 = SELLER FINDALL ====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.err.println(obj);
		}
		System.out.println();
		/*
		 * System.out.println("=== TESTE 4 = SELLER INSERT	 ===="); Seller newSeller =
		 * new Seller(null, "Erik", "erick@gmail.com", new Date(), 40000.0, department
		 * ); sellerDao.insert(newSeller); System.out.println("Inserted! New id = " +
		 * newSeller.getId()); System.out.println();
		 * System.out.println("=== TESTE 5 = SELLER UPDATE	 ===="); seller =
		 * sellerDao.findById(1); seller.setName("Marta Pereira");
		 * sellerDao.update(seller); System.out.println("UPDATE COMPLETO");
		 */
		System.out.println();
		System.out.println("=== TESTE 6 = SELLER DELETE	 ====");
		System.out.println("Entre com o id para o test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete completo");

	}

}
