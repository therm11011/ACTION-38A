package inheritance;

import inheritance.Shirt.Size;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setSize(Size.SMALL);
        shirt.setColor("Blue");
        shirt.setPrice(25000);
        shirt.setBrand("UKAY");
        shirt.fold();
        productStore(shirt);
        
        Pants pants = new Pants();
        pants.setWaist(35);
        pants.setLength(40);
        pants.setColor("Blue");
        pants.setPrice(100);
        pants.setBrand("UKAY2");
        pants.fold();
        productStore(pants);
    }
    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". " + "Your total comes to " + product.getPrice());
    }
}
