package iar.impl;

import iar.SoapDao;
import products.Soap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static db.Db.*;

public class soapImpl implements SoapDao {

    public void add(Soap soap) {
//        try(Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD)){
//        PreparedStatement statement = connection.prepareStatement("INSERT into soap values (null, ?,?,?,?,?,?,?,?,?,?)");{
//            statement.setString(1, soap.getName());
//            statement.setInt(2, soap.getCount());
//            statement.setDate(3, (java.sql.Date) soap.getDate());
//            statement.setInt(4, soap.getCountInPackage());
//            statement.setDouble(5, soap.getPrice());
//            statement.setDate(6, (java.sql.Date) soap.getDateOfManufacturing());
//            statement.setDate(7, (java.sql.Date) soap.getExpirationDate());
//            statement.setString(8, soap.getManufacturing());
//            statement.setString(9, soap.getCosmeticClass());
//            statement.setInt(10, soap.getWeight());
//            int rows = statement.executeUpdate();
//            System.out.println("Додано рядків "+rows);
//        }}catch (SQLException exception){System.err.println(exception.getMessage());}
    }

    public List<Soap> getSoapList() {
        List<Soap> soaps= new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM soap");
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int count = resultSet.getInt(3);
                String date = resultSet.getString(4);
                int countInPackage = resultSet.getInt(5);
                double price = resultSet.getDouble(6);
                String dateOfManufacturing = resultSet.getString(7);
                String expirationDate = resultSet.getString(8);
                String manufacturing = resultSet.getString(9);
                String cosmeticClass = resultSet.getString(10);
                int weight = resultSet.getInt(11);
                Soap soap = new Soap(id, name, count, date, countInPackage,
                        price, dateOfManufacturing, expirationDate, manufacturing,
                        cosmeticClass, weight);
                soaps.add(soap);
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return soaps;
    }
}
