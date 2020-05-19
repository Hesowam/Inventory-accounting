package iar.impl;

import iar.Isoap;
import products.soap;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static get.db.*;

public class soapImpl implements Isoap {
    public List<soap> getSoapList() throws ClassNotFoundException {
        List<soap> soaps=new ArrayList<soap>();
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM soap");
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int count = resultSet.getInt(3);
                Date date = resultSet.getDate(4);
                int countInPackage = resultSet.getInt(5);
                double price = resultSet.getDouble(6);
                Date dateOfManufacturing = resultSet.getDate(7);
                Date expirationDate = resultSet.getDate(8);
                String manufacturing = resultSet.getString(9);
                String cosmeticClass = resultSet.getString(10);
                int weight = resultSet.getInt(11);
                products.soap soap = new products.soap(id, name, count, date, countInPackage,
                        price, dateOfManufacturing, expirationDate, manufacturing,
                        cosmeticClass, weight);

                soaps.add(soap);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return soaps;
    }
}
