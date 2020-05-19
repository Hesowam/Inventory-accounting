package visual;

import iar.impl.soapImpl;
import iar.Isoap;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homepage {
    public static void main(String[] args) throws ClassNotFoundException {
        homepage run = new homepage();
        homepage.run();

    }
    public static void run() throws ClassNotFoundException {
        int inputValue = 0;
        System.out.println("+---------------------------+");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|2. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("|1. Знайти товар            |");
        System.out.println("+---------------------------+");
        Scanner scan = new Scanner(System.in);
        inputValue = scan.nextInt();
        switch (inputValue){
            case 1:
                List soaps = new ArrayList();
                System.out.println("entered " + inputValue);
                Isoap soap = new soapImpl();
                try {
                    soaps = soap.getSoapList();
                    System.out.println(soaps);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            default:
                System.out.println("Помилка.\nВи ввели хибне число - " + inputValue+", введіть число від 1 до 12");
                run();

        }
    }
}
