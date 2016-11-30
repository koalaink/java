import java.util.Scanner;
public class ch0221{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		double x1 , y1 , x2 , y2 , x3 , y3 ;
		System.out.print("Enter three points for a triangle: ") ;
		x1 = in.nextDouble() ;
		y1 = in.nextDouble() ;
		x2 = in.nextDouble() ;
		y2 = in.nextDouble() ;
		x3 = in.nextDouble() ;
		y3 = in.nextDouble() ;
		double side1 = Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5);
		double side2 = Math.pow((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2),0.5);
		double side3 = Math.pow((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3),0.5);
		double s = (side1+side2+side3)/2 ;
		double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
		System.out.println("The area of the triangle is " + area ) ;
	}
}