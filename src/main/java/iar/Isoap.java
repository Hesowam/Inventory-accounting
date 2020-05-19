package iar;

import products.Soap;

import java.sql.SQLException;
import java.util.List;

public interface Isoap {
    void add(Soap soap) throws Exception;
List<Soap> getSoapList() throws SQLException;
}
