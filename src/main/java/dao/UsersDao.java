package dao;

import products.Users;

import java.sql.SQLException;

public interface UsersDao {
    boolean validateUser(Users users) throws SQLException;
    void addUser(Users users) throws SQLException;
    void deleteUser(int id)throws SQLException;
}
