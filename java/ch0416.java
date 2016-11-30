import java.util.Scanner;

public class ch0416{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter an integer: ") ;
		int x = in.nextInt() ;
		for( int i = 2 ; i <= x ; ++i ){
			if( x % i == 0 ){
				while( x%i==0 ){
					System.out.print(i+" ") ;
					x/=i ;
				}
			}
		}
	}
}