import java.util.Scanner;
import java.util.Random;

public class Triangle{
	
public static boolean check(int a, int b, int c){
	if (a<= 0 || b <= || c<= 0){System.out.println("[ERROR] NO NEGATIVES OR 0s ");
	return false;}
	return true;
}	
	
	
public static void main (String[] args){
	System.out.println("enter 3 numbers for processing; ");
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();

	boolean yn = check(a,b,c);
	if(yn == false){
	if (a> b+ c||b>a+c||c> b+a){	
	System.out.println("[ERROR] THEY CANT MAKE A TRIANGLE ");
	}else{System.out.println("THEY CAN MAKE A TRIANGLE! ");}
	}
}


}
