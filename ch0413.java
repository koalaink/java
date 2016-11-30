public class ch0413{
	public static void main( String[] args ){
		int n = 100 ;
		while( n*n*n >= 12000 )
			--n ;
		System.out.println("The max number of n is: " + n ) ;
	}
}