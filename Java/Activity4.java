import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args){
        Scanner Bot = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = Bot.next();
        
        System.out.println("\nHi! "+ name + " I'm Javabot, where are you from?");
        String address = Bot.next();
        System.out.println("\nI hear it's beautiful at " + address + "! I'm from a place called Oracle.");
        System.out.println("How old are you?");
        int age = Bot.nextInt();
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old");
        System.out.println("That means I'm " + (400/age) + " times older than you.");
        System.out.println("Enough about me. What is your favorite language? (just don't say Python)");
        String ProgLang = Bot.next();
        System.out.println("\n"+ ProgLang + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");

    }
}