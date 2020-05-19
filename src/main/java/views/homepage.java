package views;

import views.soap.Input;

import java.util.Scanner;

public class homepage {
    public static void main(String[] args) throws Exception {
       homepage.run();
    }
    public static void run() throws Exception {
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
        String option = new Scanner(System.in).next();
        while(!option.equals("1")){
            System.out.println("Error!");
        }
        switch (option){
            case "1":{
                new Input();
                break;
            }


        }
    }
}
