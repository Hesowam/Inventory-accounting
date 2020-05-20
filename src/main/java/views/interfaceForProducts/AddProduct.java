package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.ProductCounter;
import products.Products;
import products.Validator;
import views.HomePage;

import java.sql.SQLException;
import java.util.Scanner;

public class AddProduct {
    private ProductDao productDao =  new ProductsDaoImpls();
    public AddProduct() throws Exception {

        ProductCounter counter = new ProductCounter();
        int countValue = counter.getProductCounter();
        Validator validator = new Validator();
        System.out.print("Введіть найменування товару: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Введіть дату прибуття товару: ");
        String date = new Scanner(System.in).next();
        while (!validator.getValidationDate(date)){
            System.out.print("Введіть коректну дату в форматі (yyyy-mm-dd): ");
            date = new Scanner(System.in).next();
        }
        System.out.print("Введіть дату виготовлення: ");
        String date_manufacturing = new Scanner(System.in).next();
        while (!validator.getValidationDate(date_manufacturing)){
            System.out.print("Введіть коректну дату в форматі (yyyy-mm-dd): ");
            date_manufacturing = new Scanner(System.in).next();
        }
        System.out.print("Товар придатний до: ");
        String date_expiration = new Scanner(System.in).next();
        while (!validator.getValidationDate(date_expiration)){
            System.out.print("Введіть коректну дату в форматі (yyyy-mm-dd): ");
            date_expiration = new Scanner(System.in).next();
        }
        System.out.print("Введіть вагу товару: ");
        String weight = new Scanner(System.in).next();
        System.out.print("Введіть ціну товару: ");
        String price = new Scanner(System.in).next();
        System.out.print("Введіть дистриб'ютора товару: ");
        String distributor = new Scanner(System.in).nextLine();
        System.out.print("Введіть к-сть товару в упаковці: ");
        String countInPackage = new Scanner(System.in).next();
        System.out.print("Введіть к-сть товару на складі: ");
        String count = new Scanner(System.in).next();
        if ((countValue+Integer.parseInt(count))>100){
            System.out.println("Склад преповнено. На складі "+countValue+" + "+(count+countValue)+" товарів із 100");
            return;
        }
        try{
            Products products = new Products();
            products.setName(name);
            products.setDate(date);
            products.setDateOfManufacturing(date_manufacturing);
            products.setExpirationDate(date_expiration);
            products.setWeight(Integer.parseInt(weight));
            products.setPrice(Double.parseDouble(price));
            products.setDistributor(distributor);
            products.setCountInPackage(Integer.parseInt(countInPackage));
            products.setCount(Integer.parseInt(count));
            productDao.add(products);

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("Повернутись до головного меню (y / n)");
        String option = new Scanner(System.in).next();
        option.toLowerCase();
        while (!option.equals("n") && !option.equals("y")){
            System.out.println("Повернутись до головного меню (y / n)");
            option = new Scanner(System.in).next();
            option.toLowerCase();
        }
        if (option.equals("y")) new HomePage().run();
        else return;
    }
}