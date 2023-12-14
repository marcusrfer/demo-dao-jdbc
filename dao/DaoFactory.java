package demo_dao_jdbc.dao;

import JDBC.DB;
import demo_dao_jdbc.impl.DepartmentDaoJdbc;
import demo_dao_jdbc.impl.SellerDaoJdbc;

public class DaoFactory {
    public static SellerDAO createSellerDao(){
        return new SellerDaoJdbc(DB.getConnection());
    }

    public static DepartmentDAO createDepartmentDao(){
        return new DepartmentDaoJdbc(DB.getConnection());
    }
}
