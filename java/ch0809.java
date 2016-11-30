import java.util.Scanner;

public class ch0809{
	public static void main( String[] args ){
		RegularPolygon re1 = new RegularPolygon() ;
		RegularPolygon re2 = new RegularPolygon(6,4) ;
		RegularPolygon re3 = new RegularPolygon(10,4,5.6,7.8) ;
		System.out.println( "re1 perimeter is: " + re1.getPerimeter() ) ;
		System.out.println( "re1 area is: " + re1.getArea() ) ;
		System.out.println( "re2 perimeter is: " + re2.getPerimeter() ) ;
		System.out.println( "re2 area is: " + re2.getArea() ) ;
		System.out.println( "re3 perimeter is: " + re3.getPerimeter() ) ;
		System.out.println( "re3 area is: " + re3.getArea() ) ;
	}
}

class RegularPolygon{
	private int n ;
	private double side ;
	private double x ;
	private double y ;
	RegularPolygon(){
		this.n = 3 ;
		this.side = 1 ;
		this.x = 0 ;
		this.y = 0 ;
	}
	RegularPolygon( int n , double side ){
		this.x = y = 0 ;
		this.n = n ;
		this.side = side ;
	}
	RegularPolygon( int n , double side , double x , double y ){
		this.n = n ;
		this.side = side ;
		this.x = x ;
		this.y = y ;
	}
	int getN(){
		return n ;
	}
	double getSide(){
		return side ;
	}
	double getX(){
		return x ;
	}
	double getY(){
		return y ;
	}
	void setN( int n ){
		this.n = n ;
	}
	void setSide( double side ){
		this.side = side ;
	}
	void setX( double x ){
		this.x = x ;
	}
	void setY( double y ){
		this.y = y ;
	}
	double getPerimeter(){
		return n * side ;
	}
	double getArea(){
		return n*side*side/4/Math.tan(side) ;
	}
}
