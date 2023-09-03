package Activity12;
import java.util.*;

public class Person
{
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;
    
	public static void main(String[] args) {
	    Person person = new Person();
	    person.name = "Gian";
	    person.nationality = "PH";
	    person.dateOfBirth = "04/29/2000";
	    String[] passport = {person.name, person.nationality, person.dateOfBirth}; 
	    person.passport = passport;
		person.seatNumber = 17;
		System.out.println(person.name);
		System.out.println(person.nationality);
		System.out.println(person.dateOfBirth);
		System.out.println(Arrays.toString(person.passport));
		System.out.println(person.seatNumber);
	}
}