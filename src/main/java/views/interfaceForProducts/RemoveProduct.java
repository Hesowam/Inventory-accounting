package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;

import java.sql.SQLException;
import java.util.Scanner;

public class RemoveProduct {
    public RemoveProduct(){
        ProductDao productDao = new ProductsDaoImpls();
        System.out.print("Введіь ID товару ");
        int id = new Scanner(System.in).nextInt();
        try {
            productDao.deleteProduct(id);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.println("Повернутись до головного меню (y / n)");
    }

}
