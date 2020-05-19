package iar;

import products.soap;

import java.sql.SQLException;
import java.util.List;

public interface Isoap {
List<soap> getSoapList() throws SQLException, ClassNotFoundException;
}
