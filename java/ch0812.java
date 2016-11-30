import java.util.Scanner;

public class ch0812{
	public static void main( String[] args ){
		double sx , sy , ex , ey ;
		line l1 = new line() ;
		line l2 = new line() ;
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the endpoints of the first line segment:" ) ;
		sx = in.nextDouble() ;
		sy = in.nextDouble() ;
		ex = in.nextDouble() ;
		ey = in.nextDouble() ;
		l1.set(sx,sy,ex,ey);
		System.out.print("Enter the endpoints of the second line segment:" ) ;
		sx = in.nextDouble() ;
		sy = in.nextDouble() ;
		ex = in.nextDouble() ;
		ey = in.nextDouble() ;
		l2.set(sx,sy,ex,ey) ;
		l1.show_crosser_with(l2) ;
	}
}

class line{
	private double sx ;
	private double sy ;
	private double ex ;
	private double ey ;
	line(){
		this.sx = 0 ;
		this.sy = 0 ;
		this.ex = 0 ;
		this.ey = 0 ;
	}
	void set( double sx , double sy , double ex , double ey ){
		this.sx = sx ;
		this.sy = sy ;
		this.ex = ex ;
		this.ey = ey ;
	}
	void show_crosser_with( line line2 ){
		double k1 = (ey-sy)/(ex-sx) ;
		double k2 = (line2.ey-line2.sy)/(line2.ex-line2.sx) ;
		if( k1 == k2 ){
			System.out.println( "These two lines are parallel to each other !" ) ;
		}
		else{
			double csx , csy ;
			double b1 = sy - k1*sx ;
			double b2 = line2.sy - k2*line2.sx ;
			csx = (b2-b1)/(k1-k2) ;
			csy = k1*(b2-b1)/(k1-k2) + b1 ;
			System.out.println( "The intersecting point is: (" + csx + ", " + csy + ")" ) ;
		}
	}
}