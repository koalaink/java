import java.util.Scanner;
public class ch0810{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter a, b, c: ") ;
		double a = in.nextDouble() ;
		double b = in.nextDouble() ;
		double c = in.nextDouble() ;
		QuadraticEquation qua = new QuadraticEquation(a,b,c) ;
		System.out.println("Discriminant is: "+qua.getDiscriminant()) ;
		if( qua.getDiscriminant() >= 0 ){
			System.out.println("Root1 is: " + qua.getRoot1() ) ;
			System.out.println("Root2 is: " + qua.getRoot2() ) ;
		}
	}
}

class QuadraticEquation{
	private double a ;
	private double b ;
	private double c ;
	QuadraticEquation( double a , double b , double c ){
		this.a = a ;
		this.b = b ;
		this.c = c ;
	}
	double getA(){
		return a ;
	}
	double getB(){
		return b ;
	}
	double getC(){
		return c ;
	}
	double getDiscriminant(){
		return b*b - 4*a*c ;
	}
	double getRoot1(){
		if( this.getDiscriminant() < 0 )
			return 0 ;
		return (-b+Math.sqrt(this.getDiscriminant()))/(2*a) ;
	}
	double getRoot2(){
		if( this.getDiscriminant() < 0 )
			return 0 ;
		return (-b+Math.sqrt(this.getDiscriminant()))/(2*a) ;
	}
}