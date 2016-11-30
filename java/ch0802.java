import java.util.Scanner;

public class ch0802{
	public static void main( String[] args ){
		Stock myStock = new Stock("JAVA","Sum Microsystems Inc") ;
		myStock.setPreviousClosingPrice(4.5) ;
		myStock.setCurrentPrice(4.35) ;
		System.out.println("Has changed " + myStock.getChangePerent() ) ;
	}
}

class Stock{
	private String symbol ;
	private String name ;
	private double previousClosingPrice ;
	private double currentPrice ;
	Stock(){

	}
	Stock( String symbol , String name ){
		this.symbol = symbol ;
		this.name = name ;
	}
	double getChangePerent(){
		return (currentPrice-previousClosingPrice)/previousClosingPrice ;
	}
	void setPreviousClosingPrice( double previousClosingPrice ){
		this.previousClosingPrice = previousClosingPrice ;
	}
	void setCurrentPrice( double currentPrice ){
		this.currentPrice = currentPrice ;
	}
}