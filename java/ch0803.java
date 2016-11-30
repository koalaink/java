import java.util.Date;
public class ch0803{
	public static void main( String[] args ){
		Date date = new Date() ;
		long goesTime = 10000 ;
		int times = 1 ;
		while( times <= 8 ){
			date.setTime(goesTime);
			System.out.println(date.toString()) ;
			goesTime = goesTime * 10 ;
			times++ ;
		}
	}
}