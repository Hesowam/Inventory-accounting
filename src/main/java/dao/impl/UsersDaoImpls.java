package dao.impl;

import dao.UsersDao;
import products.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
                if  (users_from_db.equalsUsers(users)){
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

    @Override
    public void updateUser(Users user) throws SQLException {
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword());
            PreparedStatement statement = connection.prepareStatement("UPDATE  users SET username = ?, passoword = ? where id = ?");){
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getUsername());
            statement.setInt(3, user.getId());
            int rows = statement.executeUpdate();
            System.out.println("Updated "+rows+" users.");
        }
    }

    @Override
    public List<Users> getAllUsers() throws SQLException {
        List<Users> usersList = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(getDatabaseUrl(), getDatabaseUser(), getDatabasePassword());
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String password = resultSet.getString(3);
                Users users = new Users(id,name, password);
                usersList.add(users);
            }
        }
        return usersList;
    }
}
