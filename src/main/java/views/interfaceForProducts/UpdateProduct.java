package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.Validator;

import java.util.Scanner;

public class UpdateProduct {
    public UpdateProduct(){
        ProductDao productDao = new ProductsDaoImpls();
        Validator validator = new Validator();
//        System.out.print("Введіть id товару: ");
//        int id = new Scanner(System.in).nextInt();
        System.out.print("Введіть id товару: ");
        String date = new Scanner(System.in).next();

        boolean validation = validator.getValidationDate(date);
        while (!validation){
            System.out.print("Введіть коректну дату в форматі (yyyy-mm-dd): ");
            date = new Scanner(System.in).next();
            validation = validator.getValidationDate(date);
        }
    }
}
