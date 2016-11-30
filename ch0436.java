import java.util.Scanner;

public class ch0436{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		while(true){
			System.out.print("Enter three edges: ") ;
			double a = in.nextDouble() ;
			double b = in.nextDouble() ;
			double c = in.nextDouble() ;
			double aa = (a>b?(a>c?a:c):(b>c?b:c)) ;
			double cc = (a<b?(a<c?a:c):(b<c?b:c)) ;
			double bb = a+b+c-aa-cc ;
			System.out.print("Can edges "+a+", "+b+", and "+c+"form a triangle? ") ;
			if( bb+cc > aa && aa-bb < cc && aa-cc < bb && bb-cc<aa ){
				System.out.println(true) ;
				break ;
			}
			else
				System.out.println(false) ;
		}
	}
}