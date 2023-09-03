package Activity15;
public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
    
    //Constructors
    public Person(String newName, String newNationality, String newDateOfBirth, int newSeatNumber){
        name = newName;
        nationality = newNationality;
        dateOfBirth = newDateOfBirth;
        seatNumber = newSeatNumber;
    }
    public Person(Person another){
        this(another.name, another.nationality, another.dateOfBirth, another.seatNumber);
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
    }

    static void applyPassport(){
        int number = (int) (Math.random() * 2);
        System.out.println(number == 1 ? true : false);
    }
    public static void main(String[] args) {
        Person person = new Person("Gian", "PH", "04/29/2000", 18);
        Person twin = new Person(person);

        twin.setName("Samantha Marie");
        twin.setSeatNumber(17);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
        System.out.println("Name: " + twin.getName() + "\n" + "Nationality: " + twin.getNationality() + "\n" + "Date of Birth: " + twin.getDateOfBirth() + "\n" + "Seat Number: " + twin.getSeatNumber() + "\n");
    }
}
