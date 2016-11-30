import java.util.Scanner;
public class ch0522{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		double last = 1.0 ;
		double next = 1.0 ;
		System.out.print("Enter the number is :") ;
		double num = in.nextDouble() ;
		do{
			last = next ;
			next = (last + (num/last) ) / 2 ;
		}while( next-last >= 0.0001 || last-next >= 0.0001 );
		System.out.println("The answer is :" + next ) ;
	}
}