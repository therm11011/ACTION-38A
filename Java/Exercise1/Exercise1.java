package Exercise1;
import java.util.*;
public class Exercise1 { 
    public static void main(String[] args) { 
    //Task #1
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First Integer: ");
    int x = input.nextInt();
    System.out.print("Enter Second Integer: ");
    int y = input.nextInt();
    System.out.print("Enter Third Integer: ");
    int z = input.nextInt();

    int result = x * y * z;
    System.out.println("product is: " + result);
    
    //Task 2
    x = 2;
    y = 3;
    System.out.printf( "x = %d\n", x );
    System.out.printf( "Value of %d + %d is %d\n", x, x, ( x + x ) );
    System.out.printf( "x = \n" );
    System.out.printf( "%d = %d\n", ( x + y ), ( y + x ) );
    }
    
}
