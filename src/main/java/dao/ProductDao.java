package dao;

import products.Products;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    void add(Products products) throws Exception;
    List<Products> getProductList() throws SQLException;
    void deleteProduct(int id) throws SQLException;
}
