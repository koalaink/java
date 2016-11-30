import java.util.Scanner;

public class ch0618{
	public static void main( String[] args ){
		int n ;
		double[] arr ;
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter n :") ;
		n = in.nextInt() ;
		System.out.println("Enter "+n+" numbers :") ;
		arr = new double[n] ;
		for( int i = 0 ; i < n ; ++i ){
			arr[i] = in.nextDouble() ;
		}
		b_sort(arr,n) ;
		for( int i = 0 ; i < n ; ++i )
			System.out.print(arr[i] + " ") ;
		System.out.println("");
	}
	public static void b_sort( double[] arr , int n ){
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 1 ; j < n ; ++j ){
				if( arr[j] < arr[j-1] ){
					double tmp = arr[j] ;
					arr[j] = arr[j-1] ;
					arr[j-1] = tmp ;
				}
			}
		}
		//return arr ;
	}
}