import java.util.Scanner;
public class ch0401{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.println("Enter an int value, the program exits if the input is 0:") ;
		int x ;
		
		int positive_num = 0 ;
		int negative_num = 0 ;
		int total = 0 ;
		double average = 0 ;
		while( true ){
			x = in.nextInt() ;
			if( x == 0 )
				break ;
			total += x ;
			if( x < 0 )
				negative_num++ ;
			else
				positive_num++ ;
		}
		System.out.println("The number of positives is " + positive_num + ".") ;
		System.out.println("The number of negatives is " + negative_num + ".") ;
		System.out.println("The total is " + total + ".") ;
		System.out.println("The average is " + ((double)total/(positive_num+negative_num)) + ".") ;
	}
}