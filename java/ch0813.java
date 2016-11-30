import java.util.Scanner;

public class ch0813{
	static int r , c ;
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the number of rows and columns of the array: ") ;
		r = in.nextInt() ;
		c = in.nextInt() ;
		double[][] a = new double[r][c] ;
		for( int i = 0 ; i < r ; ++i ){
			for( int j = 0 ; j < c ; ++j ){
				a[i][j] = in.nextDouble() ;
			}
		}
		Location locat = new Location() ;
		locat = locateLargest(a) ;
		System.out.println("The location of the largest element is " + locat.maxValue + " at (" + locat.row + ", " + locat.column + ")");
	}

	public static Location locateLargest( double[][] a ){
		Location locat = new Location() ;
		locat.maxValue = -0xffffff ;
		for( int i = 0 ; i < r ; ++i ){
			for( int j = 0 ; j < c ; ++j ){
				if( a[i][j] > locat.maxValue ){
					locat.maxValue = a[i][j] ;
					locat.row = i ;
					locat.column = j ;
				}
			}
		}
		return locat ;
	}
}

class Location{
	public int row ;
	public int column ;
	public double maxValue ;
}