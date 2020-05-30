package products;

public class Products {
    private int id;
    private String name;
    private int count;
    private String date;
    private int countInPackage;
    private double price;
    private String dateOfManufacturing;
    private String expirationDate;
    private String distributor;
    private int weight;
    public Products(){
    }
    public Products(int id, String name, String date, String dateOfManufacturing,
                    String expirationDate, int weight, double price,
                    String distributor, int      countInPackage, int count){
        this.id = id;
        this.name = name;
        this.date = date;
        this.dateOfManufacturing = dateOfManufacturing;
        this.expirationDate = expirationDate;
        this.weight = weight;
        this.price = price;
        this.distributor = distributor;
        this.countInPackage = countInPackage;
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
