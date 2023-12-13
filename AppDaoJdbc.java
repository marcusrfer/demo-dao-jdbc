package demo_dao_jdbc;

import demo_dao_jdbc.entities.Department;

public class AppDaoJdbc {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }
}
