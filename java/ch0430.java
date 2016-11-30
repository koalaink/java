import java.util.Scanner;

public class ch0430{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the initial deposit amount: ") ;
		double num = in.nextDouble() ;
		System.out.print("Enter annual percentage yield: ") ;
		double change = in.nextDouble() ;
		System.out.print("Enter maturity period (number of months): ") ;
		int month = in.nextInt() ;
		for( int i = 1 ; i <= month ; ++i ){
			num = num*(1+change/100/12) ;
			System.out.println("Now you has " + num + " .") ;
		}
	}
}