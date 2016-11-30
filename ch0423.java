public class ch0423{
	public static void main( String[] args ){
		int n = 50000 ;
		double ans1 = 0 ;
		double ans2 = 0 ;
		int i = 1 , j = n ;
		for( ; i <= n ; ++i ){
			ans1 += (double)1/i ;
			ans2 += (double)1/j ;
			--j ;
		}
		System.out.println("The answer of adding from first to last is: "+ans1) ;
		System.out.println("The answer of adding from last to first is: "+ans2) ;
	}
}