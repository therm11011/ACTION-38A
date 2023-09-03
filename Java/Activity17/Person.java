package Activity17;

import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
    
    //constructors
    public Person(String newName, String newNationality, String newDateOfBirth, int newSeatNumber){
        name = newName;
        nationality = newNationality;
        dateOfBirth = newDateOfBirth;
        seatNumber = newSeatNumber;
        this.passport = new String[3];
    }
    // Getters
    public String getName(){
        return name;
    }
    public String getNationality(){
        return nationality;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String[] getPassport(){
        return passport;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    
    //Setters
    public void setName(String customerName){
        this.name = customerName;
    }
    public void setNationality(String customerNationality){
        this.nationality = customerNationality;
    }
    public void setDateOfBirth(String customerDateOfBirth){
        this.dateOfBirth = customerDateOfBirth;
    }
    public void setPassport(String[] customerPassport){
        boolean approved = applyPassport(seatNumber);
        if(approved == true){
            this.passport = customerPassport;
        } else {
            passport = new String[3];
        }
    }
    public void setSeatNumber(int customerSeatNumber){
        this.seatNumber = customerSeatNumber;
    }

    //functions
    static boolean applyPassport(int n){
        int number = (int) (Math.random() * 2);
        return number == 1 ? true : false;
    }
    //main
    public static void main(String[] args) {
        Person person = new Person("Gian", "PH", "04/29/2000", 18);
        String[] personPasport = {person.getName(), person.getNationality(), person.getDateOfBirth()};
        person.setPassport(personPasport);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n" + Arrays.toString(person.getPassport()));
        System.out.println(person.getPassport()[0] != null ? "Congratulations! " + person.getName() + ". Your passport was approved." : "We are sorry " + person.getName() + ". We cannot process your application");        
    }
    
}
    
