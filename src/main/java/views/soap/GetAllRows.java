package views.soap;

import dao.SoapDao;
import dao.impl.SoapDaoImpls;
import products.Soap;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetAllRows {
    public GetAllRows(){
        List<Soap> soaps = new ArrayList();
        SoapDao soap = new SoapDaoImpls();
        try{
            soaps = soap.getSoapList();
        } catch(
                SQLException exception){
            exception.printStackTrace();
        }
        System.out.println("+------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------+");
        System.out.println("|Id\t| Наймаенування товару\t\t| Ціна\t| Кількість\t| Дата виробництва\t" +
                "| Вжити до\t| Клас\t\t\t| Фірма виробник\t| Вага\t| Дата добавлення на склад |");
        System.out.println("+------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------+");
        for(Soap s:soaps){
            System.out.println("| "+s.getId()+"\t| "+s.getName()+"\t\t| "+
                    s.getPrice()+"\t| "+s.getCount()+"\t\t\t| "+
                    s.getDateOfManufacturing()+"\t\t|"+
                    s.getExpirationDate()+"\t|"+ s.getCosmeticClass()+"\t\t|"+
                    s.getManufacturing()+"\t\t|"+
                    s.getWeight()+"\t\t|"+s.getDate()+"\t\t\t\t|");
            System.out.println("+----------------------------------------------------------------------" +
                    "----------------------------------------------------------------------------------+");
        }
    }
}
