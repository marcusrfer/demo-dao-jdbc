package demo_dao_jdbc;

import demo_dao_jdbc.entities.Department;
import demo_dao_jdbc.entities.Seller;

import java.util.Date;

public class AppDaoJdbc {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
    }
}
