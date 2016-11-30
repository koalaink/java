import java.util.Scanner;

public class ch0409{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the number of student: ") ;
		int n = in.nextInt() ;
		String name , ans_name1 = "" , ans_name2 = "" ;
		double score , max1 , max2 ;
		max1 = max2 = -1 ;
		for( int i = 0 ; i < n ; ++i ){
			name = in.next() ;
			score = in.nextDouble() ;
			if( score > max1 ){
				max2 = max1 ;
				max1 = score ;
				ans_name2 = ans_name1 ;
				ans_name1 = name ;
			}
			else if( score > max2 ){
				max2 = score ;
				ans_name2 = name ;
			}
		}
		System.out.println(ans_name1 + " with score " + max1) ;
		System.out.println(ans_name2 + " with score " + max2) ;
	}
}