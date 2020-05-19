package products;

import java.util.Date;

public class soap {
    private int id;
    private String name;
    private int count;
    private Date date;
    private int countInPackage;
    private double price;
    private Date dateOfManufacturing;
    private Date expirationDate;
    private String manufacturing;
    private int weight;
    private String cosmeticClass;
    public soap(){
    }
    public soap(int id, String name, int count, Date date, int countInPackage,
                double price, Date dateOfManufacturing, Date expirationDate,
                String manufacturing, String cosmeticClass, int weight){
        this.id = id;
        this.name = name;
        this.count = count;
        this.countInPackage = countInPackage;
        this.price = price;
        this.date = date;
        this.manufacturing = manufacturing;
        this.dateOfManufacturing = dateOfManufacturing;
        this.expirationDate = expirationDate;
        this.weight = weight;
        this.cosmeticClass = cosmeticClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCountInPackage() {
        return countInPackage;
    }

    public void setCountInPackage(int countInPackage) {
        this.countInPackage = countInPackage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(Date dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCosmeticClass() {
        return cosmeticClass;
    }

    public void setCosmeticClass(String cosmeticClass) {
        this.cosmeticClass = cosmeticClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
