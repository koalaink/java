public class ch0414{
	public static void main( String[] args ){
		int line = 0 ;
		for( int i = 33 ; i <= 126 ; ++i ){
			System.out.print((char)i + " " ) ;
			line++;
			if( line == 10 ){
				System.out.println("") ;
				line = 0 ;
			}
		}
	}
}