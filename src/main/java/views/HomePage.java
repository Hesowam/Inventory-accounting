package views;

import dao.UsersDao;
import dao.impl.UsersDaoImpls;
import products.Users;
import views.interfaceForProducts.*;

import java.util.Scanner;

public class HomePage {
    public static void main(String[] args) throws Exception {
        UsersDao dao = new UsersDaoImpls();
        while (true){
            System.out.print("Введіть логін: ");
            String username = new Scanner(System.in).next();
            System.out.print("Введіть пароль: ");
            String password = new Scanner(System.in).next();
            Users users = new Users(username, password);
            if (dao.validateUser(users)) break;
            else System.out.println("Помилка. Хибні дані.");
        }
       HomePage.run();
    }
    public static void run() throws Exception {
        System.out.println("+===================================+");
        System.out.println("|  Меню                             |");
        System.out.println("|___________________________________|");
        System.out.println("|  1. Вивести список товарів        |");
        System.out.println("|  2. Добавити товар                |");
        System.out.println("|  3. Видалити товр                 |");
        System.out.println("|  4. Оновити інформацію про товар  |");
        System.out.println("|  5. Знайти товар по критеріям     |");
        System.out.println("|  6. Вихід                         |");
        System.out.println("|                                   |");
        System.out.println("+===================================+");
        System.out.print("\nВведіть номер: ");
        String option = new Scanner(System.in).next();
        while(Integer.parseInt(option)<1 || Integer.parseInt(option)>6){
            System.out.print("\nПомилка! Введіть коректне значення: ");
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
            case "4":{
                new UpdateProduct();
                break;
            }
            case "5":{
                new SearchByMenu();
                break;
            }
            case "6":{
                return;
            }
        }
    }
}
