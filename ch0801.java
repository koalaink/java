import java.util.Scanner;

public class ch0801{
	public static void main( String[] args ){
		Rectangle r1 = new Rectangle(4,40) ;
		Rectangle r2 = new Rectangle(3.5,35.9) ;
		System.out.println("Rectangle1 : width = " + r1.width + " , height = " + r1.height + " , area = " + r1.getArea() + " , perimeter = " + r1.getPerimeter() ) ;
		System.out.println("Rectangle2 : width = " + r2.width + " , height = " + r2.height + " , area = " + r2.getArea() + " , perimeter = " + r2.getPerimeter() ) ;

	}
}

class Rectangle{
	double width ;
	double height ;
	Rectangle(){
		width = height = 1 ;
	}
	Rectangle( double w , double h ){
		width = w ;
		height = h ;
	}
	double getArea(){
		return width*height ;
	}
	double getPerimeter(){
		return (width+height)*2 ;
	}
}