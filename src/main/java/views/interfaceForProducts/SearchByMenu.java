package views.interfaceForProducts;

import views.HomePage;

import java.util.Scanner;

public class SearchByMenu {
    public SearchByMenu() throws Exception {
        System.out.println("+===================================+");
        System.out.println("|  Виберіть критерії пошуку         |");
        System.out.println("|___________________________________|");
        System.out.println("|  1. ID товару                     |");
        System.out.println("|  2. Ім'я товару                   |");
        System.out.println("|  3. Ціна                          |");
        System.out.println("|  4. Кількість                     |");
        System.out.println("|  5. Кількість в упаковці          |");
        System.out.println("|  6. Дистриб'ютор                  |");
        System.out.println("|  7. Повернутись до головного меню |");
        System.out.println("|                                   |");
        System.out.println("+===================================+");
        System.out.print("\nВведіть номер: ");
        String option = new Scanner(System.in).next();
        while (Integer.parseInt(option)<1 || Integer.parseInt(option) >7){
            System.out.print("\nПомилка! Введіть коректне значення: ");
            option = new Scanner(System.in).next();
        }
        switch (option){
            case "1":{
                new GetProductByFilter("id");
                break;
            }
            case "2":{
                new GetProductByFilter("name");
                break;
            }
            case "3":{
                new GetProductByFilter("price");
                break;
            }
            case "4":{
                new GetProductByFilter("count");
                break;
            }
            case "5":{
                new GetProductByFilter("countInPackage");
                break;
            }
            case "6":{
                new GetProductByFilter("distributor");
                break;
            }
            case "7":{
                new HomePage().run();
                break;
            }
        }
    }
}
