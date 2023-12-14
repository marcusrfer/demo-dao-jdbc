package demo_dao_jdbc.impl;

import JDBC.DB;
import JDBC.DbException;
import demo_dao_jdbc.dao.SellerDAO;
import demo_dao_jdbc.entities.Department;
import demo_dao_jdbc.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJdbc implements SellerDAO {

    private Connection conn;

    public SellerDaoJdbc(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        String stmt = "select s.Id, s.Name, Email, BirthDate, BaseSalary, DepartmentId, d.name as depName " +
                "from seller s " +
                "join department d on s.departmentid = d.Id " +
                "where s.id = ?";

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(stmt);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                Department dep = new Department();
                Seller seller = new Seller();

                dep.setId(rs.getInt("DepartmentId"));
                dep.setName(rs.getString("depName"));
                seller.setId(rs.getInt("Id"));
                seller.setName(rs.getString("Name"));
                seller.setEmail(rs.getString("Email"));
                seller.setBirthDate(rs.getDate("BirthDate"));
                seller.setBaseSalary(rs.getDouble("BaseSalary"));
                seller.setDepartment(dep);

                return seller;

            } else {
                return null;
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }


    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
}
