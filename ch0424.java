public class ch0424{
	public static void main( String[] args ){
		double i = 1 ;
		double j = 3 ;
		double ans = 0 ;
		for( ; i <= 97 ; i+=2 ){
			ans += i/j ;
			j+=2 ;
		}
		System.out.println("The answer is: "+ans) ;
	}
}