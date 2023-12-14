package demo_dao_jdbc;

import demo_dao_jdbc.dao.DaoFactory;
import demo_dao_jdbc.dao.SellerDAO;
import demo_dao_jdbc.entities.Seller;

public class AppDaoJdbc {
    public static void main(String[] args) {

        //Department obj = new Department(1, "Books");
        //System.out.println(obj);
        //Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        //System.out.println(seller);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();
        System.out.println("<--- Test 1: Seller FindById --->");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);


    }
}
