import java.util.Scanner;

public class ch0432{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		int lottery1 = (int)(Math.random()*90) + 10 ;
		int lottery2 = (int)(Math.random()*90) + 10 ;
		while( lottery1 == lottery2 ){
			lottery2 = (int)(Math.random()*90) + 10 ;
		}
		System.out.print("Enter your first lottery pick (two digits): ") ;
		int guess1 = in.nextInt() ;
		System.out.print("Enter your second lottery pick (two digits): ") ;
		int guess2 = in.nextInt() ;
		System.out.println("The lottery numbers are ( " + lottery1 + ", " + lottery2 + " ).") ;
		if( lottery1 == guess1 && lottery2 == guess2 )
			System.out.println("Exact match: you win $10,000") ;
		else if( lottery1 == guess2 && lottery2 == guess1 )
			System.out.println("Match all numbers: you win $3,000") ;
		else if( guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2 )
			System.out.println("Match one number: you win $1,000") ;
		else
			System.out.println("Sorry, no match") ;
	}
}