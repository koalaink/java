import java.util.Scanner;
public class ch0723{
	public static void main( String[] args ){
		double[][] A = new double[3][3] ;
		double[][] ans = new double[3][3] ;
		Scanner in = new Scanner(System.in) ;
		System.out.println("Enter a11, a12, a13, a21, a22, a23, a31, a32, a33:") ;
		for( int i = 0 ; i < 3 ; ++i )
			for( int j = 0 ; j < 3 ; ++j )
				A[i][j] = in.nextDouble() ;
		ans = inverse(A) ;
		for( int i = 0 ; i < 3 ; ++i ){
			for( int j = 0 ; j < 3 ; ++j )
				System.out.print(ans[i][j]+" ") ;
			System.out.println("");
		}
	}
	public static double[][] inverse( double[][] A ){
		double[][] ans = new double[3][3];
		double a = A[0][0]*A[1][1]*A[2][2]+A[2][0]*A[0][1]*A[1][2]+A[0][2]*A[1][0]*A[2][1]-A[0][2]*A[1][1]*A[2][0]-A[0][0]*A[1][2]*A[2][1]-A[2][2]*A[1][0]*A[0][1];
		// if( a < 0 ) a = -a ;
		ans[0][0] = (A[1][1]*A[2][2]-A[1][2]*A[2][1])/a ;
		ans[0][1] = (A[0][2]*A[2][1]-A[0][1]*A[2][2])/a ;
		ans[0][2] = (A[0][1]*A[1][2]-A[0][2]*A[1][1])/a ;
		ans[1][0] = (A[1][2]*A[2][0]-A[1][0]*A[2][2])/a ;
		ans[1][1] = (A[0][0]*A[2][2]-A[0][2]*A[2][0])/a ;
		ans[1][2] = (A[0][2]*A[1][0]-A[0][0]*A[1][2])/a ;
		ans[2][0] = (A[1][0]*A[2][1]-A[1][1]*A[2][0])/a ;
		ans[2][1] = (A[0][1]*A[2][0]-A[0][0]*A[2][1])/a ;
		ans[2][2] = (A[0][0]*A[1][1]-A[0][1]*A[1][0])/a ;
		return ans ;
	}
}