package products;

public class Soap {
    private int id;
    private String name;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;
    private String date;
    private int countInPackage;
    private double price;
    private String dateOfManufacturing;
    private String expirationDate;
    private String manufacturing;
    private int weight;
    private String cosmeticClass;
    public Soap(){
    }
    public Soap(int id, String name, String date, int count, int countInPackage,
                double price, String dateOfManufacturing, String expirationDate,
                String manufacturing, String cosmeticClass, int weight){
        this.id = id;
        this.name = name;
        this.countInPackage = countInPackage;
        this.price = price;
        this.date = date;
        this.count = count;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public String getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(String dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
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
