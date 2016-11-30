import java.util.Scanner;
public class ch0444{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		int times = 0 ;
		for( int i = 0 ; i < 1000000 ; ++i ){
			double x = Math.random()*2 ;
			double y = Math.random()*2 ;
			if( x < 1 ||  y > 1 && -x+3 > y )
				times++ ;
		}
		System.out.println(" p = "+(double)times/1000000) ;
	}
}