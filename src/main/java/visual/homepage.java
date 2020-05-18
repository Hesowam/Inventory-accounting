package visual;

import java.util.Scanner;

public class homepage {
    public static void main(String[] args) {
        homepage run = new homepage();
        homepage.run();

    }
    public static void run(){
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
                System.out.println("entered " + inputValue);
                break;
            default:
                System.out.println("Помилка.\nВи ввели хибне число - " + inputValue+", введіть число від 1 до 12");
                run();

        }
    }
}
