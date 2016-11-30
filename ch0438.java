import java.util.Scanner;

public class ch0438{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter an integer(decimal): ") ;
		int xx = in.nextInt() ;
		int x = xx ;
		int[] out = new int[105] ;
		int len = 0 ;
		boolean isNegative = false ;
		if( x < 0 ){
			x = -x ;
			isNegative = true ;
		}
		while( x != 0 ){
			out[len] = x % 2 ;
			x /= 2 ;
			++len ;
		}
		while(len<3){
			out[len] = 0 ;
			++len ;
		}
		if( isNegative ){
			out[len] = 1 ;
			int i = 0 ;
			while( i < len && out[i] == 0 ) ++i ;
			++i ;
			while( i < len ){
				out[i] = out[i]==0?1:0 ;
				++i ;
			}
		}
		else
			out[len] = 0 ;
		++len ;
		String output = "" ;
		/*for( int i = 0 ; i < len ; ++i )
			System.out.print(out[i]) ;
		System.out.println() ;*/
		for( int i = 0 ; i < len ;  ){
			int tmp = 0 ;
			int s = 1 ;
			for( int j = 0 ; j < 4 && i < len ; ++j ){
				tmp = tmp+out[i]*s ;
				++i ;
				s = s*2 ;
			}
			// System.out.println(tmp) ;
			switch(tmp){
				case 0 :
					output = "0" + output ;
					break ;
				case 1 :
					output = "1" + output ;
					break ;
				case 2 :
					output = "2" + output ;
					break ;
				case 3 :
					output = "3" + output ;
					break ;
				case 4 :
					output = "4" + output ;
					break ;
				case 5 :
					output = "5" + output ;
					break ;
				case 6 :
					output = "6" + output ;
					break ;
				case 7 :
					output = "7" + output ;
					break ;
				case 8 :
					output = "8" + output ;
					break ;
				case 9 :
					output = "9" + output ;
					break ;
				case 10 :
					output = "A" + output ;
					break ;
				case 11 :
					output = "B" + output ;
					break ;
				case 12 :
					output = "C" + output ;
					break ;
				case 13 :
					output = "D" + output ;
					break ;
				case 14 :
					output = "E" + output ;
					break ;
				case 15 :
					output = "F" + output ;
					break ;
			}
		}
		System.out.println("Answer is: " + Integer.toHexString(xx) ) ;
		System.out.print("To hexadecimal string is: "+output) ;
	}
}