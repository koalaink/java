import java.util.Scanner;
public class ch0446{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter an integer: ") ;
		int n , i , tmp ;
		int[] ar = new int[16];
		for( i = 0 ; i < 16 ; ++i )
			ar[i] = 0 ;
		n = in.nextInt() ;
		if( n < 0 )
			ar[0] = 1 ;
		tmp = 0 ;
		for( i = 15 ; i > 0 ; --i ){
			ar[i] = n%2 ;
			n/=2 ;
			if( ar[0] == 1 ){
				if( ar[i] == 0 )
					ar[i] = 1 ;
				else
					ar[i] = 0 ;
			}
		}
		if( ar[0] == 1 ){
			ar[15]++;
			for( i = 14 ; i > 0 ; --i ){
				ar[i]+=ar[i+1]/2;
				ar[i+1]%=2 ;
			}
		}
		for( i = 0 ; i < 16 ; ++i )
			System.out.print(ar[i]) ;
		System.out.print("\n");
	}
}