package views.interfaceForUsers;

import dao.UsersDao;
import dao.impl.UsersDaoImpls;
import views.HomePage;

import java.util.Scanner;

public class RemoveUsers {
    public RemoveUsers() throws Exception {
        UsersDao users = new UsersDaoImpls();
        System.out.print("Введіть id менеджера: ");
        int id = new Scanner(System.in).nextInt();
        users.deleteUser(id);
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
