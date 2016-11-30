import java.util.Scanner;
public class ch0619{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the number of students n :") ;
		int n = in.nextInt() ;
		String[] name = new String[n] ;
		double[] score = new double[n] ;
		for( int i = 0 ; i < n ; ++i ){
			System.out.print("Enter name and score :") ;
			name[i] = in.next() ;
			score[i] = in.nextDouble() ;
		}
		b_sort(score,name,n) ;
		for( int i = 0 ; i < n ; ++i )
			System.out.println(name[i] + " : " + score[i] ) ;
	}
	public static void b_sort( double[] score , String[] name , int n ){
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 1 ; j < n ; ++j ){
				if( score[j] > score[j-1] ){
					double tmp = score[j] ;
					score[j] = score[j-1] ;
					score[j-1] = tmp ;
					String temp = name[j] ;
					name[j] = name[j-1] ;
					name[j-1] = temp ;
				}
			}
		}
		//return arr ;
	}
}