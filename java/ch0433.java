public class ch0433{
	public static void main( String[] args ){
		for( int i = 2 ; i <= 10000 ; ++i ){
			if( i == getDivisorsSum(i) )
				System.out.println(i) ;
		}
	}
	static int getDivisorsSum( int x ){
		int sum = 1 ;
		for( int i = 2 ; i <= (int)(Math.sqrt(x)) ; ++i ){
			if( x % i != 0 )
				continue ;
			sum += i + x/i ;
		}
		return sum ;
	}
}