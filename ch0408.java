import java.util.Scanner;

public class ch0408{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the number of student: ") ;
		int n = in.nextInt() ;
		String name , ans_name = "";
		double score , max ;
		max = -1 ;
		for( int i = 0 ; i < n ; ++i ){
			name = in.next() ;
			score = in.nextDouble() ;
			if( score > max ){
				max = score ;
				ans_name = name ;
			}
		}
		System.out.println("The max score is " + max + " made by " + ans_name) ;
	}
}