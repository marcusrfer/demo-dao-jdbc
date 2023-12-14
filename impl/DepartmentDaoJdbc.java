package demo_dao_jdbc.impl;

import demo_dao_jdbc.dao.DepartmentDAO;
import demo_dao_jdbc.entities.Department;

import java.sql.Connection;
import java.util.List;

public class DepartmentDaoJdbc implements DepartmentDAO {
    public DepartmentDaoJdbc(Connection connection) {
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
