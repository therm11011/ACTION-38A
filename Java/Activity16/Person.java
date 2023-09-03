package Activity16;

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
        this.passport = customerPassport;
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
        boolean approved = applyPassport(person.getSeatNumber());
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
        System.out.println(approved == true ? "Congratulations! " + person.getName() + ". Your passport was approved. ": "We are sorry " + person.getName() + ". We cannot process your application");
        
    }
    
}