package demo_dao_jdbc.dao;

import demo_dao_jdbc.impl.SellerDaoJdbc;

public class DaoFactory {
    public static SellerDAO createSellerDao(){
        return new SellerDaoJdbc();
    }
}
