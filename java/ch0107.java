public class ch0107{
	public static void main( String[] args ){
		int i ;
		double ans = 0.0 ;
		for( i = 1 ; i < 10000000 ; ++i ){
			if( i % 2 == 0 )
				ans = ans - (double)1/(i*2-1) ;
			else
				ans = ans + (double)1/(i*2-1) ;
		}
		ans = ans * 4 ;
		System.out.println(ans) ;
	}
}