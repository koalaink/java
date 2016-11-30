import java.util.Scanner;
public class ch0421{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Loan Amount: ") ;
		double loanAmount = in.nextDouble() ;
		System.out.print("Number of Years: ") ;
		int year = in.nextInt() ;
		System.out.println("Interest Rate               Monthly Payment     Total Payment") ;
		double rate = 5 ;
		for( int i = 0 ; i <= 24 ; ++i ){
			double monthlyPayment = loanAmount*rate/1200/(1-1/(Math.pow(1+rate/1200,year*12))) ;
			System.out.println(rate+"%"+ (i%2==1?" ":(i%4==0?"   ":"  ")) + "                     "+String.format("%.2f", monthlyPayment)+"              "+String.format("%.2f", monthlyPayment*12*year)) ;
			rate += 0.125 ;
		}
	}
}