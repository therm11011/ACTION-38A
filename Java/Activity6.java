public class Activity6 {
    public static void main(String[] args){
        int SituationCase = 0;
        double wallet = 100d;
        System.out.println("Can you buy me this bag?");
        double BagPrice = 90;
        switch (SituationCase) {
            case 0:
                 System.out.println("Sure!");
                 wallet -= BagPrice;
                 if(wallet <= BagPrice){
                    SituationCase = 1;
                 }
                break;
            case 1:
               
                System.out.println("Sorry, I only have "+ (int)wallet +"$ left.");
            default:
                break;
        }
        System.out.println("Can you buy me this bag again?");
        switch (SituationCase) {
            case 0:
                 System.out.println("Sure!");
                 wallet -= BagPrice;
                break;
            case 1:
                System.out.println("Sorry, I only have "+ (int)wallet+"$ left.");
            default:
                break;
        }

    }
}
