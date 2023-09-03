package Activity10;

public class Activity10 {
    public static void main(String[] args) {
        String day="Friday";
        
        if(day.equals("Monday")){
            System.out.println("Sorry, I have to stay at work late.");
        }
        else if(day.equals("Tuesday")){
            System.out.println("It looks like I have meetings all day.");
        }
        else if(day.equals("Wednesday")){
            System.out.println("I have a dentist appointment. Some other time!");
        }
        else if(day.equals("Thursday")){
            System.out.println("Sorry, thursday is date night!");
        }
        else if(day.equals("Friday")||day.equals("Saturday")||day.equals("Sunday")){
            System.out.println("I'm free!!");
        }
        else{
            System.out.println("That's not a day.");
        }
        System.out.println();

        }
    }