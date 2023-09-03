package Activity9;

public class Activity9 {
    public static void main(String[] args) {
        int day=6;
        boolean holiday=false;
        if(day==6 || day==7){
            System.out.println("It's the weekend, no work!");
        }
        else{
            if(holiday == true){
                System.out.println("Woohoo, no work!");
            }
            else{
                System.out.println("Wake up at 7:00 :(");
            }
        }
        System.out.println();

        }
    }