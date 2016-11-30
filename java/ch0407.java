public class ch0407{
	public static void main( String[] args ){
		double price = 10000 ;
		for( int i = 0 ; i < 10 ; ++i ){
			price = price*1.05 ;
		}
		System.out.println( "10 years after: " + price ) ;
		double ans = 0 ;
		for( int i = 0 ; i < 4 ; ++i ){
			ans += price ;
			price = price*1.05 ;
		}
		System.out.println( "10 years after 4-year's total price is: " +ans ) ;
	}
}