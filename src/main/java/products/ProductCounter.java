package products;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCounter {
    private int productCounter(){
        int count = 0;
        List<Products> productsList = new ArrayList<>();
        ProductDao products = new ProductsDaoImpls();
        try {
            productsList = products.getProductList();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        for (Products p: productsList) {
            count += p.getCount();
        }
        return count;
    }
    public int getProductCounter(){return productCounter();}
}
