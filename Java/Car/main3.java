package Car;

public class main3 {
    public static void main(String[] args) {
        Car Ford = new Car("Ford",200000,2021,"green");
        System.out.println("Echo has a " + Ford.getMake() + ", colored " + Ford.getColor() + " worth " + Ford.getPrice());
        Car Nissan = Ford;
        Nissan.setMake("Nissan");
        Nissan.setPrice(200000);
        System.out.println(Nissan.getMake());
        Nissan.drive();
    }   
}