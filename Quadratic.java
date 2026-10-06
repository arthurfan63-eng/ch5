
import java.util.Scanner;
import java.util.Random;
public class Quadratic{
	
public static String descrimination(int a, int b, int c){
double discriminant = b * b - 4 * a * c;

if (a == 0) {
    System.out.println("This is not a quadratic equation.");
} else if (discriminant < 0) {
    System.out.println("There are no real roots.");
} else {
    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
    String ret = (x1+"and"+x2);
    return ret;
}

	
	return "d";
}	
	
	
public static void main (String[] args){
	System.out.println("enter 3 numbers for processing; ");
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
	String ans = descrimination(a,b,c);
}


}
