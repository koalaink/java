public class ch0418{
	public static void main( String[] args ){
		int n = 6 ;
		System.out.println("Print style 1:\n") ;
		print_1(n) ;
		System.out.println("Print style 2:\n") ;
		print_2(n) ;
		System.out.println("Print style 3:\n") ;
		print_3(n) ;
		System.out.println("Print style 4:\n") ;
		print_4(n) ;
	}
	static void print_1( int n ){
		for( int i = 1 ; i <= n ; ++i ){
			for( int j = 1 ; j <= i ; ++j )
				System.out.print(j+" ") ;
			System.out.println() ;
		}
	}
	static void print_2( int n ){
		for( int i = n ; i >= 1 ; --i ){
			for( int j = 1 ; j <= i ; ++j )
				System.out.print(j+" ") ;
			System.out.println() ;
		}
	}
	static void print_3( int n ){
		for( int i = n ; i >= 1 ; --i ){
			for( int j = 1 ; j < i ; ++j )
				System.out.print("  ");
			for( int j = n - i + 1 ; j >= 1 ; --j )
				System.out.print(j+" ") ;
			System.out.println() ;
		}
	}
	static void print_4( int n ){
		for( int i = 6 ; i >= 1 ; --i ){
			for( int j = n - i ; j > 0 ; --j )
				System.out.print("  ") ;
			for( int j = 1 ; j <= i ; ++j )
				System.out.print(j+" ") ;
			System.out.println() ;
		}
	}
}