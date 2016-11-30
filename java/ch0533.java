public class ch0533{
	public static void main( String[] args ){
		long totalMillis = System.currentTimeMillis() ;
		long totalS = totalMillis / 1000 ;
		int currentS = (int)(totalS % 60) ;
		long totalM = totalS / 60 ;
		int currentM = (int)(totalM % 60) ;
		long totalH = totalM / 60 ;
		int currentH = (int)(totalH % 24) ;
		int totalDays = (int)(totalH / 24) ;
		System.out.println(totalDays);
		int currentDay = 1 ;
		int currentMonth = 1 ;
		int currentYear = 1970 ;
		String[] month = { "" , "Jan." , "Feb." , "Mar." , "Apr." , "May." , "Jun." , "Jul." , "Aug." , "Sep." , "Oct." , "Nov." , "Dec." } ;
		int[][] days = { {0,31,59,90,120,151,181,212,243,273,304,334,365} , {0,31,60,91,121,152,182,213,244,274,305,335,366}};
		while( totalDays >= 365 ){
			if( currentYear % 4 == 0 && ( currentYear % 400 == 0 || currentYear % 100 != 0 ) ){
				totalDays = totalDays - 366;
				currentYear++;
			}else{
				totalDays = totalDays - 365;
				currentYear++;
			}
		}
		System.out.println(totalDays);
		if( totalDays == -1 ){
			currentMonth = 12 ;
			currentDay = 31 ;
		}
		else if ( totalDays == 0 ){
			currentMonth = 1 ;
			currentDay = 1 ;
		}else{
			int i = 0 ;
			if( currentYear % 4 == 0 && ( currentYear % 400 == 0 || currentYear % 100 != 0 ) ){
				i = 1 ;
			}
			currentMonth = 0;
			while( totalDays>days[i][currentMonth] ) ++currentMonth ;
			currentDay = totalDays - days[i][currentMonth-1] + 1 ;
		}
		System.out.println(" Current date and time is "+month[currentMonth]+" "+currentDay+", "+currentYear+" "+currentH+":"+currentM+":"+currentS);
	}
}