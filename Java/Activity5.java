
public class Activity5 {
    public static void main(String[] args){
        double change = 3.50;
        double price = 2.50;
        System.out.println("Me: Hi Java, do I have enough to buy chips?");
        System.out.println("Java: " + (change >= price));
        System.out.println("Me: can the elevator hold everyone?");
        int People = 25;
        int Capacity = 20;
        System.out.println("Java: " + (People <= Capacity));
        System.out.println("Me: Hi Java, will my friend be happy?");
        String FriendEmotion = "Sad";
        String Happy = "Happy";
        System.out.println("Java: " + (FriendEmotion == Happy));
        System.out.println("Me: Hi Java, can anyone attend to my dinner party?");
        boolean Invite = true;
        System.out.println("Java: " + (Invite == true));
        System.out.println("Me: Hi Java, can I win the election?");
        int CurrentAge = 23;
        int AgeRequirement = 40;
        System.out.println("Java: " + (CurrentAge >= AgeRequirement));
    }
}

