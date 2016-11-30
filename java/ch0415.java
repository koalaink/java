import java.util.Scanner;

public class ch0415{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter two integers: ") ;
		int a = in.nextInt() ;
		int b = in.nextInt() ;
		if( a > b ){
			int tmp = a ;
			a = b ;
			b = tmp ;
		}
		for( int i = a ; i > 2 ; --i ){
			if( a % i == 0 && b % i == 0 ){
				System.out.println("The gcd of the two integers is " + i + ".") ;
				break ;
			}
		}
	}
}