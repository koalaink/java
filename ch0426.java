public class ch0426{
	public static void main( String[] args ){
		double jc = 1 ;
		double e = 1 ;
		for( int i = 2 ; i <= 100001 ; ++i ){
			e += jc ;
			if( i % 10000 == 1 && i != 1 )
				System.out.println("i = "+(i-1)+", e = "+e+" .") ;
			jc = jc/i ;
		}
	}
}