public class ch0718{
	public static void main( String[] args ){
		int[][] arr = { {1,2} , {3,4} , {5,6} , {7,8} , {9,10} } ;
		int n = 5 , m = 2 ;
		int times = 1000 ;
		for( int i = 0 ; i < times ; ++i ){
			int c1 = (int)(Math.random()*n) ;
			int c2 = (int)(Math.random()*n) ;
			int[] tmp = arr[c1] ;
			arr[c1] = arr[c2] ;
			arr[c2] = tmp ;
		}
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < m ; ++j )
				System.out.print(arr[i][j]+" ");
			System.out.println("");
		}
	}
}