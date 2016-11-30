import java.util.Random;
import java.util.Scanner;

public class ch0402{
	public static void main( String[] args ){
		final int NUMBER_OF_QUESTIONS = 10 ;
		int correctCount = 0 ;
		int count = 0 ;
		long startTime = System.currentTimeMillis() ;
		String output_list = "" ;
		Scanner in = new Scanner(System.in) ;
		while( count < NUMBER_OF_QUESTIONS ){
			int number1 = (int)(Math.random()*15)+1 ;
			int number2 = (int)(Math.random()*15)+1 ;

			System.out.print("What is "+number1+" + "+number2+"?") ;
			int ans = in.nextInt() ;
			if( ans == number1 + number2 ){
				System.out.println("You are correct!") ;
				correctCount++ ;
			}
			else{
				System.out.println("Your answer is wrong.\n"+number1+" + "+number2+" should be "+(number1+number2));
			}
			count++ ;
			output_list += "\n" + number1 + " + " + number2 + " = " + ans + ((number1+number2==ans)?" correct":" wrong") ;
		}
		long endTime = System.currentTimeMillis() ;
		long testTime = endTime - startTime ;
		System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime/1000 + " seconds\n" + output_list ) ;
	}
}