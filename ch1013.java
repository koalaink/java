import java.util.Scanner;

public class ch1013{
	public static void main( String[] args ){
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5)) ;
		System.out.println("t1 Area: "+t1.getArea()) ;
		System.out.println("t1 perimeter: "+t1.getPerimeter()) ;
		System.out.println("t1 contains (3,3)? "+t1.contains(new MyPoint(3,3))) ;
		System.out.println("t1 contains Triangle? "+t1.contains(new Triangle2D(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4)))) ;
		System.out.println("t1 overlaps Triangle? "+t1.overlaps(new Triangle2D(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5)))) ;
	}
}


class MyPoint{
	
	private double x;
	private double y;
	
	public MyPoint(){
		
		setX(0);
		setY(0);
	}
	public MyPoint(double x,double y){
		
		setX(x);
		setY(y);
	}
	public double getX() {
		
		return x;
	}
	public void setX(double x) {
		
		this.x = x;
	}
	public double getY() {
		
		return y;
	}
	public void setY(double y) {
		
		this.y = y;
	}
	public double distance(MyPoint p2){
		
		double distance=Math.sqrt((Math.pow(this.getX()-p2.getX(),2)+Math.pow(this.getY()-p2.getY(),2)));
		return distance;
	}
	public double distance(double x2,double y2){
		double distance=Math.sqrt((Math.pow(this.getX()-x2,2)+Math.pow(this.getY()-y2,2)));
		return distance;
	}
	public String toString(){
		return "x = "+x+" y = "+y ;
	}
}

class Triangle2D{

	private MyPoint p1 ;
	private MyPoint p2 ;
	private MyPoint p3 ;

	public Triangle2D(){
		p1 = new MyPoint(0,0) ;
		p2 = new MyPoint(1,1) ;
		p3 = new MyPoint(2,5) ;
	}

	public Triangle2D( MyPoint p1 , MyPoint p2 , MyPoint p3 ){
		this.p1 = new MyPoint(p1.getX(),p1.getY()) ;
		this.p2 = new MyPoint(p2.getX(),p2.getY()) ;
		this.p3 = new MyPoint(p3.getX(),p3.getY()) ;
	}

	public MyPoint getP1(){
		return p1 ;
	}

	public MyPoint getP2(){
		return p2 ;
	}

	public MyPoint getP3(){
		return p3 ;
	}

	public void setP1( MyPoint p ){
		this.p1 = new MyPoint(p.getX(),p.getY()) ;
	}

	public void setP2( MyPoint p ){
		this.p2 = new MyPoint(p.getX(),p.getY()) ;
	}

	public void setP3( MyPoint p ){
		this.p3 = new MyPoint(p.getX(),p.getY()) ;
	}

	public double getPerimeter(){
		double ans = this.p1.distance(this.getP2()) ;
		ans += this.p2.distance(this.getP3()) ;
		ans += this.p3.distance(this.getP1()) ;
		return ans ;
	}

	public double getArea(){
		double p = this.getPerimeter()/2 ;
		return Math.sqrt(p*(p-p1.distance(p2))*(p-p1.distance(p3))*(p-p2.distance(p3))) ;
	}

	public boolean contains( MyPoint p ){
		double areas = 0.0 ;
		Triangle2D t1 = new Triangle2D(p,p1,p2) ;
		Triangle2D t2 = new Triangle2D(p,p1,p3) ;
		Triangle2D t3 = new Triangle2D(p,p2,p3) ;
		areas = t1.getArea() + t2.getArea() + t3.getArea() ;
		return areas == this.getArea() ;
	}

	public boolean contains( Triangle2D t ){
		if( this.contains(t.getP1()) == false )
			return false ;
		if( this.contains(t.getP2()) == false )
			return false ;
		return this.contains(t.getP3()) ;
	}

	public boolean overlaps( Triangle2D t ){
		if( contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p1.getX(),p1.getY(),p2.getX(),p2.getY(),t.p1.getX(),t.p1.getY(),t.p2.getX(),t.p2.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p1.getX(),p1.getY(),p2.getX(),p2.getY(),t.p1.getX(),t.p1.getY(),t.p3.getX(),t.p3.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p1.getX(),p1.getY(),p2.getX(),p2.getY(),t.p2.getX(),t.p2.getY(),t.p3.getX(),t.p3.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p1.getX(),p1.getY(),p3.getX(),p3.getY(),t.p1.getX(),t.p1.getY(),t.p2.getX(),t.p2.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p1.getX(),p1.getY(),p3.getX(),p3.getY(),t.p1.getX(),t.p1.getY(),t.p3.getX(),t.p3.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p1.getX(),p1.getY(),p3.getX(),p3.getY(),t.p2.getX(),t.p2.getY(),t.p3.getX(),t.p3.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p2.getX(),p2.getY(),p3.getX(),p3.getY(),t.p1.getX(),t.p1.getY(),t.p2.getX(),t.p2.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p2.getX(),p2.getY(),p3.getX(),p3.getY(),t.p1.getX(),t.p1.getY(),t.p3.getX(),t.p3.getY()) )
			return true ;
		if( java.awt.geom.Line2D.linesIntersect(p2.getX(),p2.getY(),p3.getX(),p3.getY(),t.p2.getX(),t.p2.getY(),t.p3.getX(),t.p3.getY()) )
			return true ;
		return false ;
	}
}