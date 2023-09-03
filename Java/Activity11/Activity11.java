package Activity11;

import java.util.Scanner;
public class Activity11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("-Welcome to the Java Dealership");
        System.out.println("-Select option 'a' to buy a car");
        System.out.println("-Select option 'b' to sell a car");
        String option=scan.nextLine();
        String insurance;
        String license;
        int creditScore;
        if(option.equals("a")){
            System.out.println("you chose option "+option);
            if(option.equals("a")){
                System.out.println("\nWhat is your budget?");
                int budget=scan.nextInt();
                if(budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    insurance=scan.next()+scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    license=scan.next()+scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    creditScore=scan.nextInt();
                    if(insurance.equals("yes") && license.equals("yes") && creditScore>660){
                     System.out.println("\nSold! Pleasure doing business with you!");
                    } else {
                        System.out.println("\nWe're sorry. You are not eligible");
                    }
                }      
                else{
                    System.out.println("\nWe're sorry. You are not eligible");
                }
            }
            else if((option.equals("b"))){
                System.out.println("\nWhat is your car valued at?");
                int value=scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price=scan.nextInt();
                if(value > price && price < 30000){
                    System.out.println("We will buy your car. Pleasure doing business with you!");
                }
                else{
                    System.out.println("Sorry, we're not interested.");
                }
            }
        }
        else{
            System.out.println("invalid option "+option);
        }
        scan.close();
    }
}
