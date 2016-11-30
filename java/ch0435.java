public class ch0435{
	public static void main( String[] args ){
		double ans = 0 ;
		for( double i = 1 ; i < 625 ; ++i ){
			ans = ans + 1/(Math.sqrt(i)+Math.sqrt(i+1)) ;
		}
		System.out.println(ans) ;
	}
}