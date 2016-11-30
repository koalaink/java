import java.util.Scanner;
public class ch0429{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the year and the date of the year's first day: ") ;
		int year = in.nextInt() ;
		int date = in.nextInt() ;
		for( int month = 1 ; month <= 12 ; ++month ){
			print(year,month,date) ;
			date = (getDays(month,year)+date)%7 ;
		}
	}

	static void print( int year , int month , int date ){
        String output = "" ;
        output += "      " + monthToString(month) + ", " + year + "\n" ;
        output += "-------------------------------\n" ;
        output += " Sum Mon Tue Wed Thu Fri Sat\n" ;
        int days = getDays(month,year) ;
        int p_day = 1 ;
        int st = date ;
        for( int i = 0 ; i < st ; ++i ){
            output += "    " ;
        }
        while( st <= 6 ){
            output += "   " + p_day ;
            p_day++ ;
            st++ ;
        }
        output += "\n" ;
        while( true ){
            for( int i = 0 ; i < 7 ; ++i ){
                output += "  " + (p_day<10?(" "+p_day):(p_day)) ;
                p_day++ ;
                if( p_day > days )
                    break ;
            }
            output += "\n" ;
            if( p_day > days )
                break ;
        }
        System.out.println(output);
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