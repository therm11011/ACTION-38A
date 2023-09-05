package Car;
public class Car {
    String make;
    double price;
    int year;
    String color;

    public Car(String make, double price, int year, String color){
        this.make = make;
        this.price = price; 
        this.year = year;
        this.color = color;
    }
    public Car(Car another){
        this(another.make,another.price,another.year,another.color); 
    }
    public String getMake() {
        return make;
    }
    public double getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    

    public void drive(){
        System.out.println("Please drive your car to the nearest exit.");
    }
}

