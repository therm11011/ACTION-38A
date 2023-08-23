import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args){
        Scanner SignUp = new Scanner(System.in);
        System.out.println("What is your first name?");
        String FirstName = SignUp.next();
        System.out.println("What is your last name?");
        String LastName = SignUp.next();
        System.out.println("How old are you?");
        int age = SignUp.nextInt();
        System.out.println("Make a username");
        String UserName = SignUp.next();
        System.out.println("What city do you live in?");
        String City = SignUp.next();
        System.out.println("What country is that?");
        String country = SignUp.next();


        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + FirstName);
        System.out.println("\tLast Name: " + LastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + UserName);
        System.out.println("\tCity: " + City);
        System.out.println("\tUsername: " + country);

    }

}
