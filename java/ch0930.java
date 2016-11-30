import java.util.Scanner;

public class ch0930{

	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the credit card number: ") ;
		String number = in.next() ;
		if( isValid(number) == true )
			System.out.println("It's a qualified number!") ;
		else
			System.out.println("It's not a qualified number!") ;
	}

	public static boolean isValid(String number){
		int size = number.length() ;
		if( size < 13 || size > 16 )
			return false ;
		char pre = number.charAt(0) ;
		char pre2 = number.charAt(1) ;
		if( pre != '4' && pre != '5' && pre != '6' && (pre2 != '3' || pre2 != '7') )
			return false ;
		if( (sumOfOddPlace(number)+sumOfDoubleEvenPlace(number)) % 10 == 0 )
			return true ;
		return false ;
	}

	public static int sumOfDoubleEvenPlace(String number){
		int ans = 0 ;
		int i = number.length() - 2 ;
		while( i >= 0 ){
			ans += getDigit((int)(number.charAt(i)-'0')*2) ;
			i -= 2 ;
		}
		return ans ;
	}

	public static int getDigit(int number){
		if( number < 10 )
			return number ;
		return number/10+number%10 ;
	}

	public static int sumOfOddPlace(String number){
		int ans = 0 ;
		int i = number.length() - 1 ;
		while( i >= 0 ){
			ans += (int)(number.charAt(i)-'0') ;
			i -= 2 ;
		}
		return ans ;
	}

}