public class ch0420{
	public static void main( String[] args ){
		final int MAX = 1001 ;
		boolean[] isPrime = new boolean[MAX] ;
		for( int i = 0 ; i < MAX ; ++i )
			isPrime[i] = true ;
		isPrime[0] = isPrime[1] = false ;
		for( int i = 0 ; i < MAX ; ++i ){
			if( !isPrime[i] ) continue ;
			for( int j = 2 ; j*i < MAX ; ++j )
				isPrime[i*j] = false ;
		}
		int count = 0 ;
		for( int i = 2 ; i < MAX ; ++i ){
			if( isPrime[i] ){
				System.out.print(i+(i<10?"   ":(i<100?"  ":" "))) ;
				count++ ;
				if( count == 10 ){
					System.out.println() ;
					count = 0 ;
				}
			}
		}
		System.out.println() ;
	}
}