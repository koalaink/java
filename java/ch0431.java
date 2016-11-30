import java.util.Scanner;

public class ch0431{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the initial deposit amount: ") ;
		double sum = in.nextDouble() ;
		System.out.print("Enter annual percentage yield: ") ;
		double change = in.nextDouble() ;
		System.out.print("Enter maturity period (number of months): ") ;
		int month = in.nextInt() ;
		System.out.println("Month               CD Value") ;
		for( int i = 1 ; i <= month ; ++i ){
			sum = sum*(1+change/1200) ;
			System.out.println(i+(i<10?"                   ":(i<100?"                  ":"                 "))+sum) ;
		}
	}
}