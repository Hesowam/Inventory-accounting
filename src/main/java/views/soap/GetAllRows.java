package views.soap;

import iar.SoapDao;
import iar.impl.SoapImplDao;
import products.Soap;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetAllRows {
    public static void getAllRows(){
        List<Soap> soaps = new ArrayList();
        SoapDao soap = new SoapImplDao();
        try{
            soaps = soap.getSoapList();
        } catch(
                SQLException exception){
            exception.printStackTrace();
        }
        for(Soap s:soaps){
            System.out.println("\tНаймаенування товару\tціна\tдата виробництва\tвжити до\tКлас косметики\t" +
                    "Виробник\tВага\tДата добавлення на склад");
            System.out.println(s.getName()+"\t\t"+
                    s.getPrice()+"\t\t"+s.getWeight()+"\t\t"+
                    s.getDateOfManufacturing()+"\t\t"+
                    s.getExpirationDate()+"\t\t"+ s.getCosmeticClass()+"\t\t"+
                    s.getManufacturing()+"\t\t"+
                    s.getWeight()+"\t\t"+s.getDate());
        }
    }
}
