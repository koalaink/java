import java.util.Scanner;

public class ch0442{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		final double basic = 5000 ;
		System.out.print("Enter your COMMISSION_SOUGHT: ") ;
		double goal = in.nextDouble() ;
		double dis = goal ;
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