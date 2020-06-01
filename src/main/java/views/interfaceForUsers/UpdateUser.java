package views.interfaceForUsers;

import dao.UsersDao;
import dao.impl.UsersDaoImpls;
import products.Users;
import views.HomePage;

import java.util.Scanner;

public class UpdateUser {
    public UpdateUser() throws Exception {
        UsersDao users = new UsersDaoImpls();
        System.out.println("Введіть id товару: ");
        int id = new Scanner(System.in).nextInt();
        System.out.println("Введіть нове ім'я користувача: ");
        String username = new Scanner(System.in).next();
        System.out.println("Введіть новий пароль: ");
        String password = new Scanner(System.in).next();
        Users user = new Users(id,username,password);
        users.updateUser(user);
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
