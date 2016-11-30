import java.util.Scanner;

public class ch0443{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the number of second: ") ;
		int s = in.nextInt() ;
		long lastTime = System.currentTimeMillis() ;
		--s ;
		while( s >= 0  ){
			long nowTime = System.currentTimeMillis() ;
			if( nowTime-lastTime == 1000 ){
				if( s != 0 )
					System.out.println(s+" seconds remaining.") ;
				else
					System.out.println("Stopped.") ;
				s-- ;
				lastTime = nowTime ; 
			}
		}
	}
}