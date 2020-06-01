package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.ProductCounter;
import products.Products;
import products.Validator;
import views.HomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateProduct {
    public UpdateProduct() throws Exception {
        ProductDao productDao = new ProductsDaoImpls();
        Validator validator = new Validator();
        ProductCounter counter = new ProductCounter();
        int countValue = counter.getProductCounter();
        System.out.print("Введіть id менеджера: ");
        int id = new Scanner(System.in).nextInt();
        List<Products> arrayList = new ArrayList<>();
        arrayList = productDao.searchByInt("id", id);
        while (arrayList.isEmpty()){
            System.out.println("Товар з таким ID не знайдено.\n");
            System.out.println("Веедіть інший ID: ");
            id = new Scanner(System.in).nextInt();
            arrayList = productDao.searchByInt("id", id);
        }
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
        int weight = new Scanner(System.in).nextInt();
        System.out.print("Введіть ціну товару: ");
        Double price = new Scanner(System.in).nextDouble();
        System.out.print("Введіть дистриб'ютора товару: ");
        String distributor = new Scanner(System.in).nextLine();
        System.out.print("Введіть к-сть товару в упаковці: ");
        int countInPackage = new Scanner(System.in).nextInt();
        System.out.print("Введіть к-сть товару на складі: ");
        int count = new Scanner(System.in).nextInt();
        if ((countValue+count)>100){
            System.out.println("Склад преповнено. На складі "+countValue+" + "+count+" товарів із 100");
            return;
        }
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
