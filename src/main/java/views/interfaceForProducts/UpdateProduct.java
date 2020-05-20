package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.Products;
import products.Validator;

import java.util.Scanner;

public class UpdateProduct {
    public UpdateProduct(){
        ProductDao productDao = new ProductsDaoImpls();
        Validator validator = new Validator();
        System.out.print("Введіть id товару: ");
        int id = new Scanner(System.in).nextInt();

        System.out.print("Введіть найменування товару: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Введіть дату прибуття товару: ");
        String date = new Scanner(System.in).next();
        while (!validator.getValidationDate(date)){
            System.out.print("Введіть коректну дату в форматі (yyyy-mm-dd): ");
            date = new Scanner(System.in).next();
        }
        System.out.print("Введіть дату прибуття товару: ");
        String date_manufacturing = new Scanner(System.in).next();
        while (!validator.getValidationDate(date_manufacturing)){
            System.out.print("Введіть коректну дату в форматі (yyyy-mm-dd): ");
            date_manufacturing = new Scanner(System.in).next();
        }
        System.out.print("Введіть дату прибуття товару: ");
        String date_expiration = new Scanner(System.in).next();
        while (!validator.getValidationDate(date_expiration)){
            System.out.print("Введіть коректну дату в форматі (yyyy-mm-dd): ");
            date_expiration = new Scanner(System.in).next();
        }
        System.out.print("Введіть вагу товару: ");
        int weight = new Scanner(System.in).nextInt();
        System.out.print("Введіть ціну товару: ");
        Double price = new Scanner(System.in).nextDouble();
        System.out.print("Введіть дистриб'ютора товару: ");
        String distributor = new Scanner(System.in).nextLine();
        System.out.print("Введіть к-сть товару в упаковці: ");
        int countInPackage = new Scanner(System.in).nextInt();
        System.out.print("Введіть к-сть товару на складі: ");
        int count = new Scanner(System.in).nextInt();
        try {
            Products products = new Products();
            products.setId(id);
            products.setName(name);
            products.setDate(date);
            products.setDateOfManufacturing(date_manufacturing);
            products.setExpirationDate(date_expiration);
            products.setWeight(weight);
            products.setPrice(price);
            products.setDistributor(distributor);
            products.setCountInPackage(countInPackage);
            products.setCount(count);
            productDao.updateProductInformation(products);
        }catch (Exception exception){
            System.err.println(exception.getMessage());
        }
    }
}
