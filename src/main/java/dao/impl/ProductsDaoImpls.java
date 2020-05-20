package dao.impl;

import dao.ProductDao;
import products.Products;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import static db.Db.*;

public class ProductsDaoImpls implements ProductDao {

    public void add(Products products) {
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword())){
            PreparedStatement statement = connection.prepareStatement("INSERT into products values (null ,?,?,?,?,?,?,?,?,?)");{
                statement.setString(1, products.getName());
                statement.setDate(2, Date.valueOf(products.getDate()));
                statement.setDate(3, Date.valueOf(products.getDateOfManufacturing()));
                statement.setDate(4, Date.valueOf(products.getExpirationDate()));
                statement.setInt(5,products.getWeight());
                statement.setDouble(6, products.getPrice());
                statement.setString(7, products.getDistributor());
                statement.setInt(8, products.getCountInPackage());
                statement.setInt(9, products.getCount());
                int rows = statement.executeUpdate();
                System.out.println("Додано рядків "+rows);
            }}catch (SQLException exception){System.err.println(exception.getMessage());}
    }

    public List<Products> getProductList() {
        List<Products> products = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products")) {
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String date = resultSet.getString(3);
                String dateOfManufacturing = resultSet.getString(4);
                String expirationDate = resultSet.getString(5);
                int weight = resultSet.getInt(6);
                double price = resultSet.getDouble(7);
                String distributor = resultSet.getString(8);
                int countInPackage = resultSet.getInt(9);
                int count = resultSet.getInt(10);
                Products productsOb = new Products(id, name, date, dateOfManufacturing,
                        expirationDate, weight, price, distributor, countInPackage, count);
                products.add(productsOb);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    @Override
    public void deleteProduct(int id) throws SQLException {
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword());
            PreparedStatement statement = connection.prepareStatement("DELETE FROM products WHERE id = ?")){
                statement.setInt(1,id);
                int rows = statement.executeUpdate();
                System.out.println("Видалено "+rows+" рядків.");
            }catch (Exception exception){System.err.println(exception.getMessage());}
    }
}