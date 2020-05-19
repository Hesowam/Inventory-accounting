package visual.soap;

import iar.Isoap;
import iar.impl.soapImpl;

import java.util.Scanner;

public class Input{
    Isoap soapDAO = new soapImpl();

    public Input() throws Exception {
        System.out.println("Введіть назву мила");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Введіть ціну");
        String price = new Scanner(System.in).next();
    }
}
