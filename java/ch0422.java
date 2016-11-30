import java.util.Scanner;

public class ch0422{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Loan Amount: ") ;
		double loanAmount = in.nextDouble() ;
		System.out.print("Number of Years: ") ;
		int year = in.nextInt() ;
		System.out.print("Annual Interest Rate: ") ;
		double rate = in.nextDouble() ;
		double monthlyPayment = loanAmount*rate/1200/(1-1/(Math.pow(1+rate/1200,year*12))) ;
		double totalPayment = monthlyPayment*12*year ;
		System.out.println("\nMonthly Payment: "+String.format("%.2f",monthlyPayment)) ;
		System.out.println("Total Payment: "+String.format("%.2f",totalPayment)) ;
		System.out.println("\nPayment#          Interest        Principal       Balance") ;
		for( int i = 1 ; i <= year*12 ; ++i ){
			System.out.print(i+(i<10?"       ":(i<100?"      ":(i<1000?"     ":"    ")))+"          ");
			double interest = loanAmount*rate/1200 ;
			double principal = monthlyPayment - interest ;
			double balance = loanAmount-principal ;
			System.out.print(String.format("%.2f",interest)+(interest<10?" ":"")+"           ") ;
			System.out.print(String.format("%.2f",principal)+"          ") ;
			System.out.println(String.format("%.2f",balance)) ;
			loanAmount = balance ;
		}
	}
}