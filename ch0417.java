import java.util.Scanner;
public class ch0417{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		int n ;
		System.out.print("Enter the number of lines: ") ;
		n = in.nextInt() ;
		for( int i = 1 ; i <= n ; ++i ){
			for( int j = 1 ; j <= 2*(n+i) - 3 ; ++j ){
				if( j%2 == 0 ){
					System.out.print(" ") ;
					continue ;
				}
				if( j < 2*(n-i)+1 ){
					System.out.print(" ") ;
					continue ;
				}
				if( j <= 2*n-1 ){
					System.out.print((2*n-j-1)/2+1);
				}
				else
					System.out.print((j-2*n+1)/2+1);
			}
			System.out.print("\n");
		}
	}
}