public class ch0915{
	public static void main( String[] args ){
		int ans = 0 ;
		int l = args[0].length() ;
		for( int i = 0 ; i < l ; ++i ){
			if( args[0].charAt(i) >= 'A' && args[0].charAt(i) <= 'Z' )
				ans++ ;
		}
		System.out.println("The String has "+ans+" capital letters.") ;
	}
}