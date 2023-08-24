public class Activity7 {
    public static void main(String[] args) {
        int Griffindor = 100;
        int Ravenclaw = 500;
        int Range = 300;
        int LossRange = 100;
        if (Griffindor > Ravenclaw && (Griffindor - Ravenclaw) > Range){
            System.out.println("Gryffindor takes the house cup!");
        } else if (Griffindor > Ravenclaw && (Griffindor - Ravenclaw) < Range){
            System.out.println("In second place, Gryffindor!");
        } else if (Griffindor < Ravenclaw && (Ravenclaw - Griffindor) < LossRange){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}
