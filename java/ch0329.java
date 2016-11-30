import java.util.Scanner;
public class ch0329{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		double x1 , y1 , r1 ;
		double x2 , y2 , r2 ;
		System.out.println("Enter circle1's center x-, y-coordinates, and radius:") ;
		x1 = in.nextDouble() ;
		y1 = in.nextDouble() ;
		r1 = in.nextDouble() ;
		System.out.println("Enter circle2's center x-, y-coordinates, and radius:") ;
		x2 = in.nextDouble() ;
		y2 = in.nextDouble() ;
		r2 = in.nextDouble() ;
		double dis = Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5) ;
		if( r1 >= r2 + dis )
			System.out.println("circle2 is inside circle1 .") ;
		else if( r1 + r2 > dis )
			System.out.println("circle2 is overlaps circle1 .") ;
		else
			System.out.println("circle2 does not overlap circle1 .") ;
	}
}