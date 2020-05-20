package views.interfaceForProducts;

import dao.ProductDao;
import dao.impl.ProductsDaoImpls;
import products.Products;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetAllRows {
    public GetAllRows(){
        List<Products> products = new ArrayList();
        ProductDao soap = new ProductsDaoImpls();
        try{
            products = soap.getSoapList();
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
        for(Products s: products){
            System.out.println("| "+s.getId()+"\t| "+s.getName()+"\t\t| "+
                    s.getPrice()+"\t| "+s.getCount()+"\t\t\t| "+
                    s.getDateOfManufacturing()+"\t\t|"+
                    s.getExpirationDate()+"\t|"+
                    s.getDistributor()+"\t\t|"+
                    s.getWeight()+"\t\t|"+s.getDate()+"\t\t\t\t|");
            System.out.println("+----------------------------------------------------------------------" +
                    "----------------------------------------------------------------------------------+");
        }
    }
}
