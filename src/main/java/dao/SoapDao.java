package dao;

import products.Soap;

import java.sql.SQLException;
import java.util.List;

public interface SoapDao {
    void add(Soap soap) throws Exception;
    List<Soap> getSoapList() throws SQLException;
}
