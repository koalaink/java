import java.util.Scanner;

public class ch0722{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		double[][] A = new double[2][2] ;
		System.out.print("Enter a, b, c, d: ") ;
		A[0][0] = in.nextDouble() ;
		A[0][1] = in.nextDouble() ;
		A[1][0] = in.nextDouble() ;
		A[1][1] = in.nextDouble() ;
		double[][] ans = new double[2][2] ;
		ans = inverse(A) ;
		for( int i = 0 ; i < 2 ; ++i ){
			for( int j = 0 ; j < 2 ; ++j )
				System.out.print(String.format("%.1f",ans[i][j])+" ") ;
			System.out.println() ;

		}
	}
	public static double[][] inverse( double[][] A ){
		double a = A[0][0] ;
		double b = A[0][1] ;
		double c = A[1][0] ;
		double d = A[1][1] ;
		double e = a*d-b*c ;
		if( e == 0 )
			return null ;
		double[][] ans = new double[2][2] ;
		ans[0][0] = d/e ;
		ans[0][1] = -b/e ;
		ans[1][0] = -c/e ;
		ans[1][1] = a/e ;
		return ans ;
	}
}