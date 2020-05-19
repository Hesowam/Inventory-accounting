package visual.soap;

import dao.SoapDao;
import dao.impl.SoapImplDao;

import java.util.Scanner;

public class Input{
    SoapDao soapDAO = new SoapImplDao();

    public Input() throws Exception {
        System.out.println("Введіть назву мила");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Введіть ціну");
        String price = new Scanner(System.in).next();
    }
}
