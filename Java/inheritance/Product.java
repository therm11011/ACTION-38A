package inheritance;
/**
 * Product
 */
public class Product {
    private double price;
    private String color;
    private String brand;
    public double getPrice(){
        return this.price;
    }
    public String getColor() {
        return color;
    }
    public String getBrand() {
        return brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold(){
        System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }
}