import java.util.Date;
import java.util.Scanner;

public class ch1101{

	public static void main( String[] args ){
		Triangle t1 = new Triangle(1,1.5,1) ;
		t1.setColor("yellow") ;
		t1.setFilled(true) ;
		System.out.println("Area: "+t1.getArea()) ;
		System.out.println("Perimeter: "+t1.getPerimeter()) ;
		System.out.println("Color: "+t1.getColor()) ;
		System.out.println("isFilled: "+t1.isFilled()) ;
	}

}

class GeometricObject{
	private String color ;
	private boolean filled ;
	private Date dateCreated ;

	public GeometricObject(){
		dateCreated = new Date() ;
	}

	public GeometricObject( String color , boolean filled ){
		dateCreated = new Date() ;
		this.color = color ;
		this.filled = filled ;
	}

	public String getColor(){
		return this.color ;
	}

	public void setColor( String color ){
		this.color = color ;
	}

	public boolean isFilled(){
		return filled ;
	}

	public void setFilled( boolean filled ){
		this.filled = filled ;
	}

	public Date getDateCreate(){
		return dateCreated ;
	}

	public String toString(){
		return "create on " + dateCreated + "\ncolor: " + color + " and filled: " + filled ;
	}
}

class Triangle extends GeometricObject{
	private double side1 ;
	private double side2 ;
	private double side3 ;

	Triangle(){
		side1 = side2 = side3 = 1.0 ;
	}

	Triangle( double side1 , double side2 , double side3 ){
		this.side1 = side1 ;
		this.side2 = side2 ;
		this.side3 = side3 ;
	}

	public double getSide1(){
		return side1 ;
	}

	public double getSide2(){
		return side2 ;
	}

	public double getSide3(){
		return side3 ;
	}

	public void setSide1( double side1 ){
		this.side1 = side1 ;
	}

	public void setSide2( double side2 ){
		this.side2 = side2 ;
	}

	public void setSide3( double side3 ){
		this.side3 = side3 ;
	}

	public double getArea(){
		double p = (side1+side2+side3)/2 ;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)) ;
	}

	public double getPerimeter(){
		return side1+side2+side3 ;
	}

	public String toString(){
		return "Triangle: side1 = " + side1 +" side2 = " + side2 +" side3 = " + side3 ;
	}
}