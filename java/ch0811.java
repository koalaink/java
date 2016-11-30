import java.util.Scanner;
public class ch0811{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.println("Enter a, b, c, d, e, f: ") ;
		double a = in.nextDouble() ;
		double b = in.nextDouble() ;
		double c = in.nextDouble() ;
		double d = in.nextDouble() ;
		double e = in.nextDouble() ;
		double f = in.nextDouble() ;
		LinearEquation line = new LinearEquation(a,b,c,d,e,f) ;
		if( line.isSolvable() == false )
			System.out.println("The equation has no solution.") ;
		else
			System.out.println("X = " + line.getX() + " , Y = " + line.getY() ) ;
	}
}

class LinearEquation{
	private double a ;
	private double b ;
	private double c ;
	private double d ;
	private double e ;
	private double f ;
	LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a ;
		this.b = b ;
		this.c = c ;
		this.d = d ;
		this.e = e ;
		this.f = f ;
	}
	boolean isSolvable(){
		if( (a*d - b*c) != 0 )
			return true ;
		return false ;
	}
	double getX(){
		return (e*d-b*f)/(a*d-b*c) ;
	}
	double getY(){
		return (a*f-e*c)/(a*d-b*c) ;
	}
}