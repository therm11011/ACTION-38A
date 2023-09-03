package Activity13;
public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;

    public Person(String newName, String newNationality, String newDateOfBirth, int newSeatNumber){
        name = newName;
        nationality = newNationality;
        dateOfBirth = newDateOfBirth;
        seatNumber = newSeatNumber;
    }
    public static void main(String[] args) {
        Person person = new Person("Gina", "Ph", "04/29/2000", 14);
        System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth + "\n" + "Seat Number: " + person.seatNumber + "\n");

    }
}
