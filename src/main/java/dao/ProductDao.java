package dao;

import products.Products;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    void add(Products products) throws Exception;
    List<Products> getProductList() throws SQLException;
    void deleteProduct(int id) throws SQLException;
    void updateProductInformation(Products products);
    List<Products> searchByInt(String filterName, int value) throws Exception;
    List<Products> getSearchByDouble(String filterName, double value) throws Exception;
    List<Products> getSearchByString(String filterName, String value) throws Exception;
}
