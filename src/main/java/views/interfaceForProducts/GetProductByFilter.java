package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.Products;
import views.HomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetProductByFilter {
    public GetProductByFilter(String value) throws Exception {
        List<Products> productsList = new ArrayList<>();
        ProductDao productDao = new ProductsDaoImpls();
        System.out.println("+===================================+");
        System.out.println("|  Пошук по критеріям               |");
        System.out.println("|___________________________________|");
        System.out.println("|                                   |");
        System.out.println("      Обраний критерій "+value);
        System.out.println("|                                   |");
        System.out.println("+===================================+");
        switch (value.toLowerCase()){
            case "id":{
                System.out.print("Введіть ID: ");
                int id = new Scanner(System.in).nextInt();
                try {
                    productsList = productDao.searchByInt("id =", id);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
            case "count":{
                System.out.print("Введіть к-сть: ");
                int count = new Scanner(System.in).nextInt();
                System.out.println("    1. Знайти товар з кількість меньше "+count);
                System.out.println("    2. Знайти товар з кількість більше "+count);
                System.out.println("    2. Знайти товар з кількість рівною "+count);
                System.out.print("Виберіть із списку: ");
                int option = new Scanner(System.in).nextInt();
                try {
                    switch (option){
                        case 1: productsList = productDao.searchByInt("Count <", count); break;
                        case 2: productsList = productDao.searchByInt("Count >", count); break;
                        case 3: productsList = productDao.searchByInt("Count =", count); break;
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
            case "countinpackage":{
                System.out.print("Введіть к-сть в упаковці: ");
                int countInPackage = new Scanner(System.in).nextInt();
                System.out.println("    1. Знайти товар з кількість меньше "+countInPackage);
                System.out.println("    2. Знайти товар з кількість більше "+countInPackage);
                System.out.println("    2. Знайти товар з кількість рівною "+countInPackage);
                System.out.print("Виберіть із списку: ");
                int option = new Scanner(System.in).nextInt();
                try {
                    switch (option){
                        case 1: productsList = productDao.searchByInt("Count_in_package <", countInPackage); break;
                        case 2: productsList = productDao.searchByInt("Count_in_package >", countInPackage); break;
                        case 3: productsList = productDao.searchByInt("Count_in_package =", countInPackage); break;
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
            case "price":{
                System.out.print("Введіть ціну: ");
                int price = new Scanner(System.in).nextInt();
                System.out.println("    1. Знайти товар з кількість меньше "+price);
                System.out.println("    2. Знайти товар з кількість більше "+price);
                System.out.println("    2. Знайти товар з кількість рівною "+price);
                System.out.print("Виберіть із списку: ");
                int option = new Scanner(System.in).nextInt();
                try {
                    switch (option){
                        case 1: productsList = productDao.searchByInt("Price <", price); break;
                        case 2: productsList = productDao.searchByInt("Price >", price); break;
                        case 3: productsList = productDao.searchByInt("Price = ", price); break;
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
            case "name":{
                System.out.print("Введіть ім'я (чутливий до регістру): ");
                String name = new Scanner(System.in).nextLine();
                try {
                    productsList = productDao.getSearchByString("Name", name);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
            case "distributor":{
                System.out.print("Введіть дистриб'ютора (чутливий до регістру): ");
                String distributor = new Scanner(System.in).nextLine();
                try {
                    productsList = productDao.getSearchByString("Distributor", distributor);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
        }
        if (!productsList.isEmpty()){
            System.out.println("+------------------------------------------------------------------------" +
                    "------------------------------------------------------------------------------------------+");
            System.out.println("| ID\t| Найменування\t| Дата прибуття\t| " +
                    "Дата виготовлення\t| Дійсний до\t| Вага (Гр.)(Мл.)\t|" +
                    " Ціна (грн.)\t| Дистриб'ютор\t| К-сть в упаковці\t| К-сть на складі\t|");
            System.out.println("+------------------------------------------------------------------------" +
                    "------------------------------------------------------------------------------------------+");
            for(Products s: productsList){
                System.out.println("| "+s.getId()+"\t\t| "+s.getName()+"\t| "+
                        s.getDate()+"\t| "+s.getDateOfManufacturing()+"\t\t| "+
                        s.getExpirationDate()+"\t| "+s.getWeight()+"\t\t\t\t| "+
                        s.getPrice()+"\t\t\t| "+s.getDistributor()+"\t| "+
                        s.getCountInPackage()+"\t\t\t\t| "+s.getCount()+"\t\t\t\t|");
                System.out.println("+------------------------------------------------------------------------" +
                        "------------------------------------------------------------------------------------------+");
            }
        }
        else {
            System.out.println("Елементів не знайдено.");
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
