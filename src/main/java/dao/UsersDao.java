package dao;

import products.Users;

import java.sql.SQLException;
import java.util.List;

public interface UsersDao {
    boolean validateUser(Users users) throws SQLException;
    void addUser(Users users) throws SQLException;
    void deleteUser(int id)throws SQLException;
    void updateUser(Users user)throws SQLException;
    List<Users> getAllUsers()throws SQLException;
}
