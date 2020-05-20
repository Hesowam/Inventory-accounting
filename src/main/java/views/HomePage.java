package views;

import views.interfaceForProducts.AddProduct;
import views.interfaceForProducts.GetAllRows;
import views.interfaceForProducts.RemoveProduct;

import java.util.Scanner;

public class HomePage {
    public static void main(String[] args) throws Exception {
       HomePage.run();
    }
    public static void run() throws Exception {
        System.out.println("+---------------------------+");
        System.out.println("|1. Вивести список товарів  |");
        System.out.println("|2. Добавити товар          |");
        System.out.println("|3. Видалити товр           |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("+---------------------------+");
        System.out.print("\nВведіть номер: ");
        String option = new Scanner(System.in).next();
        while(Integer.parseInt(option)<1 && Integer.parseInt(option)>10){
            System.out.println("Error!");
            option = new Scanner(System.in).next();
        }
        switch (option){
            case "1":{
                new GetAllRows();
                break;
            }
            case "2":{
                new AddProduct();
                break;
            }
            case "3":{
                new RemoveProduct();
                break;
            }
        }
    }
}