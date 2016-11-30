public class ch0445{
	public static void main( String[] args ){
		int sum = 0 ;
		for( int i = 1 ; i <= 7 ; ++i ){
			for( int j = i + 1 ; j <= 7 ; ++j ){
				System.out.println(i+" "+j) ;
				sum++ ;
			}
		}
		System.out.println("The sum is " + sum + " .") ;
	}
}