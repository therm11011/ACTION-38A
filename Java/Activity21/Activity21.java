package Activity21;
import java.util.Arrays;
class Person {
    private int seat=-1;
    private String name="Rayan Slim";
    private String nationality="Canadian";
    private String dateOfBirth="01/01/1111";
    private int seatNumber=10;
    private String[] passport={"name","nationality","dateOfBirth"};
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name=name;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;
        this.passport=new String[3];
    }
    boolean applyPassport() { // Denies or approves passport application
	int number = (int)(Math.random()*2);
	return number==1; // Returns 'true' if 'number' equals 1
    }
    void setPassport(){
        passport=new String[]{name, nationality, dateOfBirth};}
    String getPassport(){
        return Arrays.toString(passport);}
    void setName(String x){
        this.name=x;}
    String getName(){
        return name;}
    void setNationality(String x){
        this.nationality=x;}
    String getNationality(){
        return nationality;}
    void setDateOfBirth(String x){
        this.nationality=x;}
    String getDateOfBirth(){
        return dateOfBirth;}
    void setSeatNumber(int i){
        this.seatNumber=i;}
    int getSeatNumber(){
        return seatNumber;}
    int chooseSeat(){
        int[] seatChoices={6,6,2,2,2,4,11};
        return seatChoices[++seat];
    }
}
class Airline{
    Person[] people;
    int headCount=0; // for totaling 'person' objects
    Airline(){
        people=new Person[11];}
    String getPerson(int index){
        return people[index].toString();}
    void setPerson(Person[] person){
     for(int i=0; i<person.length; i++){
           people[i]=person[i];}
    }
    void createReservation(Person person){ // Task 1
        int index=person.getSeatNumber()-1;
        int i=0;
        while(index>-1&&i<=people.length&&i<=headCount){ // 'index' cannot be null; 
            if(index==people[i].getSeatNumber()-1&&index!=i&&!people[i-1].getPassport().contains("null, null, null")){
                // 'index' compares each person's seat no. if it's taken; 'index' should not compare to itself; 
                // the condition above also checks if the previous seat is taken (For Task 3) [this condition is dedicated to Hammurabi XD]
                System.out.println(person.getName()+", seat: "+person.getSeatNumber()+" is already taken."
                    + " Please choose another seat.");
                person.setSeatNumber(index=person.chooseSeat()); // Overwrites 'index' with new values from 'chooseSeat()'
                index--; // 'index' needs to reduce by 1
                i=-1; // Resets 'i' counter
            }
            i++; // 'i' increments for for-looping
        }
        headCount++; // Counters persons; stops at the last person
        if(!person.getPassport().contains("null, null, null")){ // checks if passport is invalid
            System.out.println("Thank you, "+person.getName()+", for flying with Java airlines. "
                + "Your seat number is "+person.getSeatNumber());
        }
        else{
            System.out.println("Sorry, "+person.getName()+". Your passport: "
                +person.getPassport()+" is not valid.");
        }
        
    }
}
public class Activity21 {
    public static void main(String[] args){
        Person[] people = new Person[]{ // Task 5
            new Person("Cleopatra","Egypt","69 BC",1),
            new Person("Alexander the Great ","Macedon","356 BC",2),
            new Person("Julius Caesar","Rome","100 BC",3),
            new Person("Hannibal","Carthage","247 BC",4),
            new Person("Confucius","China","551 BC",5),
            new Person("Pericles","Greece","429 BC",6),
            new Person("Spartacus","Thrace","111 BC",7),
            new Person("Marcus Aurelius","Rome","121 AD",8),
            new Person("Leonidas","Greece","540 BC",9),
            new Person("Sun Tzu","China","544 BC",10),
            new Person("Hammurabi","Babylon","1750 BC",10), // Task 2
        };
        Airline airline=new Airline();
        airline.setPerson(people); // Transfers 'people' objects to 'Airline' class
        for (Person people1 : people) { // Shortened version for an object for-loop
            boolean passportApproved = people1.applyPassport(); // Task 3
            if(passportApproved){ // Task 3
                people1.setPassport();
                airline.createReservation(people1);
            }
            else{
                airline.createReservation(people1);
            }
        }
    }
}