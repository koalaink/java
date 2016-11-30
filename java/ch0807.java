import java.util.Date;
import java.util.Scanner;

public class ch0807{
	public static void main( String[] args ){
		Account myAccount = new Account(1122,20000) ;
		myAccount.setAnnualInterestRate(4.5) ;
		myAccount.withDraw(2500) ;
		myAccount.deposit(3000) ;
		System.out.println( "balance =: " + myAccount.getBalance()) ;
		System.out.println( "MonthlyTnterest =: " + myAccount.getMonthlyTnterest()) ;
		System.out.println(myAccount.getDateCreated()) ;
	}
}

class Account{
	private int id ;
	private double balance ;
	private double annualInterestRate ;
	Date dateCreated ;
	Account(){
		id = 0 ; 
		balance = annualInterestRate = 0 ;
		dateCreated = new Date() ;
	}
	Account( int id , double balance ){
		this.id = id ;
		this.balance = balance ;
		annualInterestRate = 0 ;
		dateCreated = new Date() ;
	}
	int getId(){
		return id ;
	}
	double getBalance(){
		return balance ;
	}
	double getAnnualInterestRate(){
		return annualInterestRate ;
	}
	void setId( int id ){
		this.id = id ;
	}
	void setBalance( double balance ){
		this.balance = balance ;
	}
	void setAnnualInterestRate( double annualInterestRate ){
		this.annualInterestRate = annualInterestRate ;
	}
	Date getDateCreated(){
		return dateCreated ;
	}
	double getMonthlyTnterest(){
		return balance * (annualInterestRate/1200) ;
	}
	void withDraw( double num ){
		balance -= num ;
	}
	void deposit( double num ){
		balance += num ;
	}
}