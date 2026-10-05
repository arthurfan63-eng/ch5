import java.util.Scanner;
import java.util.Random;


public class GuessMyNumber2{

public static String HOL(int x){
	if (x>49){return "lower";}
	if (x<49){return "higher";}
	if (x==49){System.out.println("YOU WIN! :]");
		return "win";}
	return "ewf";	
	
	
}




	public static void main(String[] arg){
	int number = 49;

	System.out.println("guess my number, its from 1 to 100");
	Scanner in = new Scanner(System.in);
	int guess = in.nextInt();
	String ans = HOL(guess);
	if (ans != "win"){
		System.out.println(ans);
			 guess = in.nextInt();
	 ans = HOL(guess);
	if (ans != "win"){
		System.out.println(ans);
			 guess = in.nextInt();
 ans = HOL(guess);
	if (ans != "win"){
		System.out.println("YOU LOSE >:[");
		
	}
	}
	}
 
}

}
