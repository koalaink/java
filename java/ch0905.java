import java.util.Scanner;

public class ch0905{

	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter a string: ") ;
		String s = in.next() ;
		int[] counts = count(s) ;
		for( int i = 0 ; i < 10 ; ++i )
			System.out.println("counts["+i+"] = "+counts[i]) ;
	}

	public static int[] count( String s ){
		int[] ans = new int[10] ;
		for( int i = 0 ; i < 10 ; ++i )
			ans[i] = 0 ;
		for( int i = 0 ; i < s.length() ; ++i ){
			if( s.charAt(i) >= '0' && s.charAt(i) <= '9' ){
				int tmp = (int)(s.charAt(i)-'0') ;
				ans[tmp]++ ;
			}
		}
		return ans ;
	}

}