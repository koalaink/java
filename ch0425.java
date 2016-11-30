// import java.util.Scanner;
public class ch0425{
	public static void main( String[] args ){
		// Scanner in = new Scanner(System.in) ;
		double pi = 0.0 ;
		for( int i = 1 ; i <= 100000 ; ++i ){
			if( i % 2 == 1 )
				pi = pi + (double)1/(2*i-1) ;
			else
				pi = pi - (double)1/(2*i-1) ;
			if( i % 10000 == 0 )
				System.out.println("when i = "+i+", pi = "+4*pi ) ;
		}
	}
}