import java.util.Scanner;

public class ch0910{

	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter an integer: ") ;
		int value = in.nextInt() ;
		String ans = decimalToBinary(value) ;
		System.out.println(ans) ;
	}

	public static String decimalToBinary( int value ){
		String ans = "" ;
		int tmp = value ;
		while( tmp != 0 ){
			if( tmp % 2 == 0 )
				ans = "0" + ans ;
			else
				ans = "1" + ans ;
			tmp /= 2 ;
		}
		if( value < 0 ){
			int i = ans.length() - 1 ;
			while( ans.charAt(i) == '0' )
				--i ;
			--i ;
			while( i >= 0 ){
				StringBuilder strb = new StringBuilder(ans);
				if( ans.charAt(i) == '0' )
					strb.setCharAt(i,'1') ;
				else
					strb.setCharAt(i,'0') ;
				--i ;
				ans = strb.toString() ;
			}
			ans = "1" + ans ;
		}
		else{
			ans = "0" + ans ;
		}
		return ans ;
	}
}