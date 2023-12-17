package demo_dao_jdbc;

import demo_dao_jdbc.dao.DaoFactory;
import demo_dao_jdbc.dao.SellerDAO;
import demo_dao_jdbc.entities.Department;
import demo_dao_jdbc.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AppDaoJdbc {
    public static void main(String[] args) {

        //Department obj = new Department(1, "Books");
        //System.out.println(obj);
        //Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        //System.out.println(seller);

        Scanner sc = new Scanner(System.in);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("<--- Test 1: Seller FindById --->");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findAllByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: seller findAll =====");
        list = sellerDAO.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 4: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update =====");
        seller = sellerDAO.findById(1);
        seller.setName("Martha Waine");
        sellerDAO.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: seller delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
