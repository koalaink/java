import java.util.Scanner;

public class ch1010{

	public static void main( String[] args ){
		int date = 0 ;
		int ans ;

		Scanner in = new Scanner(System.in) ;

		for( int i = 0 ; i < 5 ; ++i ){
			System.out.println("Is your birthday in set" + (i+1) + "?") ;
			for( int j = 0 ; j < 4 ; ++j ){
				for( int k = 0 ; k < 4 ; ++k )
					System.out.print(GuessDate.getValue(i,j,k)+" ") ;
				System.out.println() ;
			}

			System.out.print("\nEnter 0 for No and 1 for Yes: ") ;
			ans = in.nextInt() ;

			if( ans == 1 )
				date += GuessDate.getValue(i,0,0) ;
		}

		System.out.println("Your birthday is "+date+"!") ;
	}

}

class GuessDate{

	private static int[][] set1 = { { 1 , 3 , 5 , 7 } , { 9 , 11 , 13 , 15 } , { 17 , 19 , 21 , 23 } , { 25 , 27 , 29 , 31 }  } ;
	private static int[][] set2 = { { 2 , 3 , 6 , 7 } , { 10 , 11 , 14 , 15 } , { 18 , 19 , 22 , 23 } , { 26 , 27 , 30 , 31 } } ;
	private static int[][] set3 = { { 4 , 5 , 6 , 7 } , { 12 , 13 , 14 , 15 } , { 20 , 21 , 22 , 23 } , { 28 , 29 , 30 , 31 } } ;
	private static int[][] set4 = { { 8 , 9 , 10 , 11 } , { 12 , 13 , 14 , 15 } , { 24 , 25 , 26 , 27 } , { 28 , 29 , 30 , 31 } } ;
	private static int[][] set5 = { { 16 , 17 , 18 , 19 } , { 20 , 21 , 22 , 23 } , { 24 , 25 , 26 , 27 } , { 28 , 29 , 30 , 31 } } ;	

	private GuessDate(){} 

	public static int getValue( int setNo , int k , int j ){
		if( setNo == 0 )
			return set1[k][j] ;
		if( setNo == 1 )
			return set2[k][j] ;
		if( setNo == 2 )
			return set3[k][j] ;
		if( setNo == 3 )
			return set4[k][j] ;
		return set5[k][j] ;
	}
}