import java.util.Scanner;

public class ch0441{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter numbers: ") ;
		int x ;
		int max = -0xffffff ;
		int times = 0 ;
		while( true ){
			x = in.nextInt() ;
			if( x == 0 )
				break ;
			if( x > max ){
				max = x ;
				times = 1 ;
			}
			else if( x == max ){
				times++ ;
			}
		}
		System.out.println("The largest number is "+max+" .") ;
		System.out.println("The occurrence count of the largest number is "+times+" .") ;
	}
}