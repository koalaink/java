import java.util.Scanner;
public class ch0217{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		double ta , twc , v , ans ;
		System.out.print("Enter the temperature in Fahrenheit: ");
		ta = in.nextDouble() ;
		System.out.print("Enter the wind speed miles per hour: ");
		v = in.nextDouble() ;
		v = Math.pow(v,0.16) ;
		ans = 35.74 + 0.6215 * ta - 35.75 * v + 0.4275 * ta * v ;
		System.out.println("The wind chill index is "+ans);
	}
}