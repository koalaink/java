import java.util.Scanner;
public class ch0621{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the number of balls to drop: ") ;
		int n = in.nextInt() ;
		System.out.print("Enter the number of slots in the bean machine: ") ;
		int f = in.nextInt() ;
		int[] sum = new int[f+1] ;
		for( int i = 0 ; i <= f ; ++i )
			sum[i] = 0 ; 
		for( int i = 0 ; i < n ; ++i ){
			double st = (f+1)/2 ;
			for( int j = 0 ; j < f ; ++j ){
				int step = (int)(Math.random()*2) ;
				if( step == 0 )
					st = st - 0.5 ;
				else
					st = st + 0.5 ;
			}
			sum[(int)st]++ ;
		}
		int max = -1 ;
		for( int i = 0 ; i <= f ; ++i )
			if( sum[i] > max ) max = sum[i] ;
		for( int i = max ; i >= 1 ; --i ){
			for( int j = 0 ; j <= f ; ++j ){
				if( sum[j] == i ){
					System.out.print("O") ;
					sum[j]-- ;
				}
				else{
					System.out.print(" ") ;
				}
			}
			System.out.println("");
		}
	}
}