import java.util.Scanner;

public class ch0428{
	public static void main( String[] args ){
		int year , date ;
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter year and the date of this year's first day: ") ;
		year = in.nextInt() ;
		date = in.nextInt() ;
		for( int i = 1 ; i <= 12 ; ++i ){
			System.out.println( monthToString(i) + " 1, " + year + " is " + dateToString(date) + " .") ;
			date = ( date + getDays(i,year) ) % 7 ;
		}
	}

	static int getDays( int month , int year ){
		if( month==1||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12 )
			return 31;
		if( month != 2 )
			return 30 ;
		if( year%4==0&&(year%100!=0||year%400==0) )
			return 29 ;
		return 28 ;
	}

	static String monthToString( int month ){
		if( month == 1 )
			return "January" ;
		if( month == 2 )
			return "February" ;
		if( month == 3 )
			return "March" ;
		if( month == 4 )
			return "April" ;
		if( month == 5 )
			return "May" ;
		if( month == 6 )
			return "June" ;
		if( month == 7 )
			return "July" ;
		if( month == 8 )
			return "August" ;
		if( month == 9 )
			return "September" ;
		if( month == 10 )
			return "October" ;
		if( month == 11 )
			return "November" ;
		return "December" ;
	}

	static String dateToString( int date ){
		if( date == 0 )
			return "Sunday" ;
		if( date == 1 )
			return "Monday" ;
		if( date == 2 )
			return "Tuesday" ;
		if( date == 3 )
			return "Wednesday" ;
		if( date == 4 )
			return "Thursday" ;
		if( date == 5 )
			return "Friday" ;
		return "Saturday" ;
	}
}

