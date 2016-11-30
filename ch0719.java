import java.util.Scanner;
public class ch0719{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter integer n and m as a n*m matrix: ") ;
		int n = in.nextInt() ;
		int m = in.nextInt() ;
		int[][] matrix = new int[n][m] ;
		System.out.println("Enter your matrix: ") ;
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < m ; ++j ){
				matrix[i][j] = in.nextInt() ;
			}
		}
		boolean ans = isConsecutiveFour(matrix,n,m) ;
		System.out.println(ans);
	}
	public static boolean isConsecutiveFour( int[][] matrix , int n , int m ){
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < m ; ++j ){
				if( j+3 < m && matrix[i][j]==matrix[i][j+1] && matrix[i][j+2]==matrix[i][j+3] && matrix[i][j+1]==matrix[i][j+2] )
					return true ;
				if( i+3 < n && matrix[i][j]==matrix[i+1][j] && matrix[i+2][j]==matrix[i+3][j] && matrix[i+1][j]==matrix[i+2][j] )
					return true ;
				if( j+3 < m && i+3 < n ){
					if( matrix[i][j]==matrix[i+1][j+1] && matrix[i+2][j+2]==matrix[i+3][j+3] && matrix[i+1][j+1]==matrix[i+2][j+2] )
						return true ;
				}
				if( j-3 >= 0 && i+3 < n ){
					if( matrix[i][j]==matrix[i+1][j-1] && matrix[i+2][j-2]==matrix[i+3][j-3] && matrix[i+1][j-1]==matrix[i+2][j-2] )
						return true ;
				}
			}
		}
		return false ;
	}
}