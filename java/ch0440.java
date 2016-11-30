public class ch0440{
	public static void main( String[] args ){
		final int times = 1000000 ;
		int step ;
		int up = 0 ;
		int down = 0 ;
		for( int i = 0 ; i < times ; ++i ){
			step = (int)(Math.random()*2) ;
			if( step == 0 )
				up++ ;
			else
				down++ ;
		}
		System.out.println("The number of up is: "+up+", and the number of down is: "+down) ;
	}
}