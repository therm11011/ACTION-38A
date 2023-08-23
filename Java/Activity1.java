public class Activity1{
	public static void main(String[] args) {
		String name, country, sport, game, subject;
		int age, hours;
		char grade;
		
		name = "Gian Mari G. Ramos";
		age = 23;
		country = "Philippines";
		sport = "Football";
		hours = 3;
		game = "VALORANT";
		subject = "Understanding the Self";
		grade = 'A';

		System.out.println("My name is " + name + " I'm " + age + " years old and from " + country + ".");
		System.out.println("My favorite sport is "+ sport + ". I play for " + hours + " hour(s) a day.");
		System.out.println( "I like to play " + game + " when I'm tired.");
		System.out.println("In school, my favorite subject was " + subject + ". I scored an " + grade +".");
	}
}