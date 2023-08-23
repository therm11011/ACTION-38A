public class Activity2 {
    public static void main(String[] args){
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;


        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;

        System.out.println("Time for Business! Your selling each apple for 40 cents");
        float ApplePrice = 0.40f;
        

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfCustomers++;
        int NumberPurchased = 4;
        numOfApples -= NumberPurchased;

        System.out.println("Another customer walked in. She bought 20 apples!");
        numOfCustomers++;
        NumberPurchased +=20;
        
        numOfApples -= NumberPurchased;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfCustomers++;
        NumberPurchased +=200;
        numOfApples -= NumberPurchased;

        

        System.out.println("Wow! So far, you made: " + (ApplePrice * NumberPurchased) + ".");
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " left.");
        
    }
}
