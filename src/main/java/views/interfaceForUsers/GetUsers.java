package views.interfaceForUsers;

import dao.UsersDao;
import dao.impl.UsersDaoImpls;
import products.Users;
import views.HomePage;

import java.util.List;
import java.util.Scanner;

public class GetUsers {
    public GetUsers() throws Exception {
        UsersDao users = new UsersDaoImpls();
        List<Users> usersList = users.getAllUsers();
        System.out.println("| id | username |");
        for (Users s: usersList) {
            System.out.println("| "+s.getId()+" | "+s.getUsername()+" |");
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
