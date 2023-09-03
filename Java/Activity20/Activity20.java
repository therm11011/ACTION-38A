package Activity20;
import java.util.Arrays;

class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber=10;
    private String[] passport={"name","nationality","dateOfBirth"};
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name=name;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;
        this.passport=new String[3];
    }
    void setPassport(){
        passport=new String[]{name, nationality, dateOfBirth};
    }
    String getPassport(){
        //setPassport();
        return Arrays.toString(passport);
    }
    void setName(String x){
        this.name=x;
    }
    String getName(){
        return name;
    }
    void setNationality(String x){
        this.nationality=x;
    }
    String getNationality(){
        return nationality;
    }
    void setDateOfBirth(String x){
        this.nationality=x;
    }
    String getDateOfBirth(){
        return dateOfBirth;
    }
    void setSeatNumber(int i){
        this.seatNumber=i;
    }
    int getSeatNumber(){
        return seatNumber;
    }
    public String toString(){ // Task 1
        return "Name: "+getName() + "\n" + "Nationality: "+getNationality() + "\n" + "Date of Birth: "+getDateOfBirth()+"\n" + "Seat Number: "+getSeatNumber()+"\n"+ "Passport: "+getPassport()+"\n";
        }
}
class Airline{
    Person[] people;
    Airline(){ // Task 1
        people=new Person[11];
    } 
    String getPerson(int index){
        return people[index].toString();
    }
    void setPerson(Person[] person){
        for(int i=0; i<person.length; i++){
            people[i]=person[i];}
    }
}
public class Activity20 {
    public static void main(String[] args){
        Person[] people = new Person[]{
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
            new Person("Hammurabi","Babylon","1750 BC",11),
        };
        Airline airline=new Airline();
        airline.setPerson(people);
        System.out.println(airline.getPerson(1));
        System.out.println(airline.getPerson(5));
        System.out.println(airline.getPerson(10));
    }
}