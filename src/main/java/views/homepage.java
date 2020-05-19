package views;

import views.soap.GetAllRows;

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
        System.out.println();
        Scanner scan = new Scanner(System.in);
        inputValue = scan.nextInt();
        switch (inputValue){
            case 1:
                GetAllRows getAllRows = new GetAllRows();
                getAllRows.getAllRows();
                break;
            default:
                System.out.println("Помилка.\nВи ввели хибне число - " + inputValue+", введіть число від 1 до 12");
                run();
        }
    }
}
