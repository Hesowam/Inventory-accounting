package tests;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import org.junit.jupiter.api.Test;
import products.Products;
import products.Validator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Tests {

    @Test
    void getProductList() throws Exception {
        ProductDao dao = new ProductsDaoImpls();
        List<Products> list = dao.getProductList();
        assertNotNull(list);
    }

    @Test
    void searchByInt() throws Exception {
        ProductDao dao = new ProductsDaoImpls();
        List<Products> list = dao.searchByInt("Count =", -800);
        List<Products> nullList = new ArrayList<>();
        assertEquals(list, nullList);
    }

    @Test
    void getSearchByDouble() throws Exception {
        ProductDao dao = new ProductsDaoImpls();
        List<Products> list = dao.getSearchByDouble("Price", 0);
        List<Products> nullList = new ArrayList<>();
        assertEquals(list, nullList);
    }

    @Test
    void getSearchByString() throws Exception {
        ProductDao dao = new ProductsDaoImpls();
        List<Products> list = dao.getSearchByString("Name", "");
        List<Products> nullList = new ArrayList<>();
        assertEquals(list, nullList);
    }
    @Test
    void validateDate() {
        Validator validator = new Validator();
        assertEquals(validator.getValidationDate("2002-02-06"), true);
        assertEquals(validator.getValidationDate("2002-13-06"), false);
        assertEquals(validator.getValidationDate("2002/10/06"), false);
    }

}