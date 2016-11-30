import java.util.GregorianCalendar;

public class ch0805{
	public static void main( String[] args ){
		myGregorianCalendar calendar = new myGregorianCalendar() ;
		calendar.show_date() ;
		calendar.set(123456789765L) ;
		calendar.show_date() ;
	}
}

class myGregorianCalendar{
	private GregorianCalendar ca ;
	private int year ;
	private int month ;
	private int day ;
	myGregorianCalendar(){
		ca = new GregorianCalendar() ;
		year = ca.get(GregorianCalendar.YEAR) ;
		month = ca.get(GregorianCalendar.MONTH) + 1 ;
		day = ca.get(GregorianCalendar.DAY_OF_MONTH) ;
	}
	void show_date(){
		System.out.println( "Current date is " + month + " " + day + ", " + year ) ;
	}
	void set( long d ){
		ca.setTimeInMillis(d) ;
		year = ca.get(GregorianCalendar.YEAR) ;
		month = ca.get(GregorianCalendar.MONTH) + 1 ;
		day = ca.get(GregorianCalendar.DAY_OF_MONTH) ;
	}
}