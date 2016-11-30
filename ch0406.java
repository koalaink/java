public class ch0406{
	public static void main( String[] args ){
		int a = 1 ;
		int b = 1609 ;
		int c = 20 ;
		double d = 20/1.609 ;
		double e = 5/1.609 ;
		System.out.println("Mile    km     km     Mile") ;
		for( ; a <= 10 ; ++a ){
			System.out.println(a + (a<10?" ":"") + "     " + (double)b/1000 + "     " + c + "     " + d ) ;
			b += 1609 ;
			c += 5 ;
			d += e ;
		}
	}
}