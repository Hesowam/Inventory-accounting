package dao.impl;

import dao.UsersDao;
import products.Users;

import java.sql.*;

import static db.Db.*;

public class UsersDaoImpls implements UsersDao {
    @Override
    public boolean validateUser(Users users) throws SQLException {
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword());
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString(2);
                String password = resultSet.getString(3);
                Users users_from_db = new Users(name, password);
                if  (users.equalsUsers(users_from_db)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void addUser(Users users) throws SQLException {
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword());
            PreparedStatement statement = connection.prepareStatement("INSERT into users values (null, ?,?)");){
            statement.setString(1, users.getUsername());
            statement.setString(2, users.getPassword());
            int rows = statement.executeUpdate();
            System.out.println("Added "+rows+" users.");
        }
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword());
            PreparedStatement statement = connection.prepareStatement("DELETE FROM users where id = ?");){
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            System.out.println("Deleted "+rows+" users.");
        }
    }
}
