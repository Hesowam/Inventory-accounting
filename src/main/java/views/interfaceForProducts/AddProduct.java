package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.ProductCounter;
import products.Products;

import java.sql.SQLException;
import java.util.Scanner;

public class AddProduct {
    private ProductDao productDao =  new ProductsDaoImpls();
    public AddProduct() throws Exception {

        ProductCounter counter = new ProductCounter();
        int countValue = counter.getProductCounter();
        if (countValue>100){
            System.out.println("Склад преповнено. На складі "+countValue+" товарів із 100");
            return;
        }
        System.out.print("Введіть назву товару: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Введіть ціну: ");
        String price = new Scanner(System.in).next();
        System.out.print("Введіть дату прибуття товару: ");
        String date = new Scanner(System.in).next();
        System.out.print("Введіть к-сть товару: ");
        String count = new Scanner(System.in).next();
        System.out.print("Введіть к-сть в коробці: ");
        String countInPackage = new Scanner(System.in).next();
        System.out.print("Дата виготовлення: ");
        String DOM = new Scanner(System.in).next();
        System.out.print("Товар придатний до: ");
        String DOE = new Scanner(System.in).next();
        System.out.print("Дистриб'ютор: ");
        String distributor = new Scanner(System.in).next();
        System.out.print("Вага: ");
        String weight = new Scanner(System.in).next();
        try{
            Products products = new Products();
            products.setName(name);
            products.setDate(date);
            products.setDateOfManufacturing(DOM);
            products.setExpirationDate(DOE);
            products.setWeight(Integer.parseInt(weight));
            products.setPrice(Double.parseDouble(price));
            products.setDistributor(distributor);
            products.setCountInPackage(Integer.parseInt(countInPackage));
            products.setCount(Integer.parseInt(count));
            productDao.add(products);

        }catch (SQLException ex) {
            ex.printStackTrace();
        }



    }
}