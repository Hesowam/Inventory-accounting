package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.Products;
import views.HomePage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetAllRows {
    public GetAllRows(){
        List<Products> products = new ArrayList();
        ProductDao product = new ProductsDaoImpls();
        int count = 0;
        try{
            products = product.getProductList();
        } catch(
                SQLException exception){
            exception.printStackTrace();
        }
        System.out.println("+------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------+");
        System.out.println("| ID\t| Найменування\t| Дата прибуття\t| " +
                "Дата виготовлення\t| Дійсний до\t| Вага (Гр.)(Мл.)\t|" +
                " Ціна (грн.)\t| Дистриб'ютор\t| К-сть в упаковці\t| К-сть на складі\t|");
        System.out.println("+------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------+");
        for(Products s: products){
            System.out.println("| "+s.getId()+"\t\t| "+s.getName()+"\t| "+
                    s.getDate()+"\t| "+s.getDateOfManufacturing()+"\t\t| "+
                    s.getExpirationDate()+"\t| "+s.getWeight()+"\t\t\t\t| "+
                    s.getPrice()+"\t\t\t| "+s.getDistributor()+"\t| "+
                    s.getCountInPackage()+"\t\t\t\t| "+s.getCount()+"\t\t\t\t|");
            count+=s.getCount();
            System.out.println("+------------------------------------------------------------------------" +
                    "------------------------------------------------------------------------------------------+");
        }
        if (count>=100){
            System.out.println("\nСклад переповнено");
            return;
        }
        System.out.println("\nНа складі товарів "+count+" із 100. Склад може вмістити ще "+(100-count)+" одиниць товару.");
        System.out.println("Повернутись до головного меню (y / n)");
        String option = new Scanner(System.in).next();
        option.toLowerCase();
        while (!option.equals("n") && !option.equals("y")){
            System.out.println("Повернутись до головного меню (y / n)");
            option = new Scanner(System.in).next();
            option.toLowerCase();
        }
        if (option.equals("y")) new HomePage();
        else return;
    }
}
