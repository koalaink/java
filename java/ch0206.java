import java.util.Scanner;
public class ch0206{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		int i ;
		System.out.print("Enter a number between 0 and 1000 :");
		i = in.nextInt() ;
		int ans = i/100 + i%10 + i/10%10 ;
		System.out.println("The sum of the digits is "+ans) ;
	}
}