public class ch0419{
	public static void main( String[] args ){
		int n = 8 ;
		int m = 15 ;
		int[][] arr = new int[8][15] ;
		arr[0][m/2] = 1 ;
		for( int i = 0 ; i < n ; ++i ){
			if( i != 0 ) arr[i][m/2] = arr[i-1][m/2]*2 ;
			for( int j = m/2-1 ; j >= 0  ; --j ){
				arr[i][j] = arr[i][j+1]/2 ;
				arr[i][m-j-1] = arr[i][m-j-2]/2 ;
			}
		}
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < m ; ++j ){
				if( arr[i][j] == 0 )
					System.out.print("    ") ;
				else
					System.out.print(arr[i][j]+(arr[i][j]<10?"   ":(arr[i][j]<100?"  ":" "))) ;
			}
			System.out.println() ;
		}
	}
}