public class ch0808{
	public static void main( String[] args ){
		Fan fan1 = new Fan() ;
		fan1.setSpeed(3) ;
		fan1.setRadius(10) ;
		fan1.setColor("yellow") ;
		fan1.setOn(true) ;
		Fan fan2 = new Fan() ;
		fan2.setSpeed(2) ;
		fan2.setRadius(5) ;
		fan2.setColor("blue") ;
		fan2.setOn(false) ;
		System.out.println("fan1:\n" + fan1.tostring()) ;
		System.out.println("fan2:\n" + fan2.tostring()) ;
	}
}

class Fan{
	public static int SLOW = 1 ;
	public static int MEDIUM = 2 ;
	public static int FAST = 3 ;
	private int speed ;
	private boolean on ;
	private double radius ;
	String color ;
	Fan(){
		speed = SLOW ;
		on = false ;
		radius = 5 ;
		color = "blue" ;
	}
	int getSpeed(){
		return speed ;
	}
	void setSpeed( int speed ){
		this.speed = speed ;
	}
	boolean getOn(){
		return on ;
	}
	void setOn( boolean on ){
		this.on = on ;
	}
	double getRadius(){
		return radius ;
	}
	void setRadius( double radius ){
		this.radius = radius ;
	}
	String getColor(){
		return color ;
	}
	void setColor( String color ){
		this.color = color ;
	}
	String tostring(){
		if( on )
			return "Fan is on and:\nNow speed is " + speed + "\nColor is " + color + "\nRadius is " + radius + "\n" ;
		else
			return "Fan is off and:\nColor is " + color + "\nRadius is " + radius + "\n" ;
	}

}