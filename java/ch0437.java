import java.util.Scanner;

public class ch0437{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter an integer(decimal): ") ;
		int x = in.nextInt() ;
		boolean isNegative = false ;
		String output = "" ;
		if( x < 0 ){
			x = -x ;
			isNegative  = true ;
		}
		while( x != 0 ){
			int tmp = x % 2 ;
			if( tmp == 1 )
				output = "1" + output ;
			else
				output = "0" + output ;
			x /= 2 ;
		}
		char[] ans = new char[output.length()] ;
		ans = output.toCharArray() ;
		System.out.print("To binary string is: ") ;
		if( isNegative ){
			int len = output.length() - 1 ;
			while( len >= 0 && output.charAt(len) == '0' )
				--len ;
			--len ;
			while( len >= 0 ){
				if( output.charAt(len) == '0' )
					ans[len] = '1' ;
				else
					ans[len] = '0' ;
				--len ;
			}
			System.out.print("1") ;
		}
		else{
			System.out.print("0") ;
		}
		for( int i = 0 ; i < output.length() ; ++i )
			System.out.print(ans[i]) ;
		System.out.println() ;
	}
}