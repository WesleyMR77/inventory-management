package inventory.management.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private Double price;
    private int theAmount;
    private double total;

    public Product() {
    }

    public Product(int id, String name, String Description, Double price, int theAmount, double total) {
        this.id = id;
        this.name = name;
        this.description = Description;
        this.price = price;
        this.theAmount = theAmount;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getTheAmount() {
        return theAmount;
    }

    public void setTheAmount(int theAmount) {
        this.theAmount = theAmount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
       
    
}
