package Activity8;

public class Activity8 {
    public static void main(String[] args) {
        // int temp=25;
        int temp = 25;
        String forecast;
        if(temp<=-1){
            forecast="The forecast is FREEZING! Stay home!";
        }
        else if(temp<=10&&temp>-1){
            forecast="The forecast is Chilly. Wear a coat!";
        }
        else{
            forecast="It's warm. Go outside!";
        }
        System.out.println(forecast+"\n");
        }
    }