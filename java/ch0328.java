import java.util.Scanner;
public class ch0328{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		double x1 , y1 , width1 , height1 ;
		double x2 , y2 , width2 , height2 ;
		System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
		x1 = in.nextDouble() ;
		y1 = in.nextDouble() ;
		width1 = in.nextDouble() ;
		height1 = in.nextDouble() ;
		System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
		x2 = in.nextDouble() ;
		y2 = in.nextDouble() ;
		width2 = in.nextDouble() ;
		height2 = in.nextDouble() ;
		if( (x2-width2/2) >= (x1-width1/2) && (x2+width2/2) <= (x1+width1/2) && (y2-height2/2) >= (y1-height1/2) && (y2+height2/2) <= (y1+height1/2) )
			System.out.println("r2 is inside r1 .") ;
		else if( (x2-width2/2) >  (x1+width1/2) || (x2+width2/2) < (x1-width1/2) || (y2-height2/2) > (y1+height1/2) || (y2+height2/2) < (y1-height1/2) )
			System.out.println("r2 does not overlap r1 .") ;
		else
			System.out.println("r2 overlaps r1 .") ;
	}
}