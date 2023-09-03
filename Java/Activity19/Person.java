package Activity19;

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
    public String toString(){ // Task 1
        return "Name: "+getName()+"\n"+"Nationality: "+getNationality()+"\n"+ "Date of Birth: "+getDateOfBirth()+"\n"+"Seat Number: "+getSeatNumber()+"\n"+ "Passport: "+getPassport()+"\n";
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
    public String getPassport(){
        return Arrays.toString(passport);
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
        passport =new String[]{name, nationality, dateOfBirth};
    }
    public void setSeatNumber(int customerSeatNumber){
        this.seatNumber = customerSeatNumber;
        chooseSeat(this.seatNumber);
    }

    static boolean applyPassport(int n){
        int number = (int) (Math.random() * 2);
        return number == 1 ? true : false;
    }
    static boolean chooseSeat(int seat){
        int vacantSeat = (int) (seat * 11 + 1);
        boolean approved = applyPassport(vacantSeat);
        return approved;
    }
    public static void main(String[] args) {
        Person person = new Person("Gian", "PH", "04/29/2000", 18);
        String[] personPasport = {person.getName(), person.getNationality(), person.getDateOfBirth()};
        person.setPassport(personPasport);
        System.out.println(person.toString());
        
    }
    
}