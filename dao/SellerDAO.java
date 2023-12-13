package demo_dao_jdbc.dao;

import demo_dao_jdbc.entities.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);

    List<Seller> findAll();
}
