package views.soap;

import iar.SoapDao;
import iar.impl.SoapImplDao;

import java.util.Scanner;

public class Input{
    SoapDao soapDAO = new SoapImplDao();

    public Input() throws Exception {
        System.out.println("Введіть назву мила");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Введіть ціну");
        String price = new Scanner(System.in).next();
        System.out.println("Вага");
        int weight = new Scanner(System.in).nextInt();
        System.out.println("Введіть кількість");
        int count = new Scanner(System.in).nextInt();
        System.out.println("Введіть фірму виробник");
        String manufacturing = new Scanner(System.in).nextLine();

    }
}
