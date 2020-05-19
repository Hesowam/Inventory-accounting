package views.soap;

import dao.SoapDao;
import dao.impl.SoapImplDao;
import products.Soap;

import java.sql.SQLException;
import java.util.Scanner;

public class Input{
   private SoapDao soapDao =  new SoapImplDao();

    public Input() throws Exception {
        System.out.println("Введіть назву мила");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Введіть ціну");
        String price = new Scanner(System.in).next();
        System.out.println("Введіть дату:");
        String date = new Scanner(System.in).next();
        System.out.println("Введіть к-сть:");
        String count = new Scanner(System.in).next();
        System.out.println("Введіть к-сть в коробці");
        String countInPackage = new Scanner(System.in).next();
        System.out.println("DOM:");
        String DOM = new Scanner(System.in).next();
        System.out.println("DOE");
        String DOE = new Scanner(System.in).next();
        System.out.println("Manufactoring");
        String manu = new Scanner(System.in).next();
        System.out.println("Cos Class");
        String cos = new Scanner(System.in).next();
        System.out.println("Weight:");
        String weight = new Scanner(System.in).next();
        try{
            Soap soap = new Soap();
            soap.setName(name);
            soap.setPrice(Double.valueOf(price));
            soap.setDate(date);
            soap.setCount(Integer.parseInt(count));
            soap.setCountInPackage(Integer.parseInt(countInPackage));
            soap.setDateOfManufacturing(DOM);
            soap.setExpirationDate(DOE);
            soap.setManufacturing(manu);
            soap.setCosmeticClass(cos);
            soap.setWeight(Integer.parseInt(weight));
            soapDao.add(soap);

        }catch (SQLException ex) {
            ex.printStackTrace();
        }



    }
}
