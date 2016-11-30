public class ch0404{
	public static void main( String[] args ){
		int a = 1 ;
		int b = 1609 ;
		System.out.println("Mile    km") ;
		for( ; a <= 10 ; ++a ){
			System.out.println(a + (a<10?" ":"") + "     " + (double)b/1000) ;
			b += 1609 ;
		}
	}
}