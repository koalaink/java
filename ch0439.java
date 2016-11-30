public class ch0439{
	public static void main( String[] args ){
		final double basic = 5000 ;
		double goal = 30000 ;
		double dis = goal - basic ;
		double ans = 0 ;
		if( 5000 * 0.08 > dis ){
			ans = dis / 0.08 ;
		}
		else{
			ans = 5000 ;
			dis = dis - 5000*0.08 ;
			if( 5000 * 0.1 > dis ){
				ans = ans + dis/0.1 ;
			}
			else{
				ans = 10000 ;
				dis = dis - 5000*0.1 ;
				ans = ans + dis/0.12 ;
			}
		}
		System.out.println("The min is: " + ans ) ;
	}
}