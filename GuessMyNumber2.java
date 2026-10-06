import java.util.Scanner;
import java.util.Random;


public class GuessMyNumber2{

public static String HOL(int x, int num){
	if (x>num){return "lower";}
	if (x<num){return "higher";}
	if (x==num){System.out.println("YOU WIN! :]");
		return "win";}
	return "ewf";	
	
	
}




	public static void main(String[] arg){
		Random random = new Random();
	int number = random.nextInt();

	System.out.println("guess my number, its from 1 to 100");
	Scanner in = new Scanner(System.in);
	int guess = in.nextInt();
	String ans = HOL(guess,number);
	if (ans != "win"){
		System.out.println(ans);
			 guess = in.nextInt();
	 ans = HOL(guess,number);
	if (ans != "win"){
		System.out.println(ans);
			 guess = in.nextInt();
 ans = HOL(guess,number);
	if (ans != "win"){
		System.out.println("YOU LOSE >:[");
		
	}
	}
	}
 
}

}
