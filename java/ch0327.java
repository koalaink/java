import java.util.Scanner;
public class ch0327{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter a point's x- and y-coordinates: ") ;
		double x = in.nextDouble() ;
		double y = in.nextDouble() ;
		if( (-0.5*x+100) > y  && x > 0 && y > 0 )
			System.out.println("The point is in the triangle.") ;
		else
			System.out.println("The point is not in the triangle.") ;
	}
}