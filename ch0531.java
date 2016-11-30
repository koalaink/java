import java.util.Scanner;

public class ch0531{

	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the credit card number: ") ;
		long number = in.nextLong() ;
		if( isValid(number) == true )
			System.out.println("It's a qualified number!") ;
		else
			System.out.println("It's not a qualified number!") ;
	}

	public static boolean isValid(long number){
		int size = getSize(number) ;
		if( size < 13 || size > 16 )
			return false ;
		long pre = getPrefix(number,1) ;
		long pre2 = getPrefix(number,2) ;
		if( pre != 4 && pre != 5 && pre != 6 && pre2 != 37 )
			return false ;
		if( (sumOfOddPlace(number)+sumOfDoubleEvenPlace(number)) % 10 == 0 )
			return true ;
		return false ;
	}

	public static int sumOfDoubleEvenPlace(long number){
		int ans = 0 ;
		number /= 10 ;
		while( number != 0 ){
			ans += getDigit((int)(number%10*2)) ;
			number /= 100 ;
		}
		return ans ;
	}

	public static int getDigit(int number){
		if( number < 10 )
			return number ;
		return number/10+number%10 ;
	}

	public static int sumOfOddPlace(long number){
		int ans = 0 ;
		while( number != 0 ){
			ans += number % 10 ;
			number /= 100 ;
		}
		return ans ;
	}

	public static boolean prefixMatched(long number, int d){
		int size = getSize(number) ;
		long tmp = 1 ;
		for( int i = 1 ; i < size ; ++i )
			tmp *= 10 ;
		long ans = number / tmp ;
		if( ans == (long)d )
			return true ;
		return false ;
	}

	public static int getSize(long d){
		long n = d ;
		int ans = 0 ;
		while( n != 0 ){
			n /= 10 ;
			++ans ;
		}
		return ans ;
	}

	public static long getPrefix(long number, int k){
		int size = getSize(number) ;
		if( size <= k )
			return number ;
		long tmp = 1 ;
		for( int i = k ; i < size ; ++i )
			tmp *= 10 ;
		long ans = number / tmp ;
		return ans ;
	}
}