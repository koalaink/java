import java.util.Scanner;
public class ch0630{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the number of elament: ") ;
		int n = in.nextInt() ;
		double[] arr = new double[n] ;
		for( int i = 0 ; i < n ; ++i ){
			arr[i] = in.nextDouble() ;
		}
		boolean ans = isConsecutiveFour(arr,n) ;
		System.out.println(ans);
	}
	public static boolean isConsecutiveFour( double[] values , int n ){
		for( int i = 0 ; i <= n-4 ; ++i ){
			int j ;
			for( j = 1 ; j <= 3 ; ++j ){
				if( values[i+j] != values[i+j-1] )
					break ;
			}
			if( j > 3 ) return true ;
		}
		return false ;
	}
}