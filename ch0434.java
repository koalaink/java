import java.util.Scanner;

public class ch0434{
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		boolean lastRoundIsManWin = false ;
		int combo = 0 ;
		while( combo <= 2 ){
			int com = (int)(Math.random()*3) ;
			System.out.print("scissor (0), rock (1), paper (2): ") ;
			int man = in.nextInt() ;
			System.out.print("The computer is " + intToString(com) + ". ") ;
			if( isManWin(com,man) ){
				System.out.println("You won!") ;
				if( lastRoundIsManWin )
					combo++ ;
				else
					combo = 1 ;
				lastRoundIsManWin = true ;
			}
			else if( isManWin(man,com) ){
				System.out.println("You lost!") ;
				if( lastRoundIsManWin == false )
					combo++ ;
				else
					combo = 1 ;
				lastRoundIsManWin = false ;
			}
			else
				System.out.println("It is a draw!") ;
		}
	}
	static boolean isManWin( int com , int man ){
		if( man == 0 && com == 2 || man == 1 && com == 0 || man == 2 && com == 1 )
			return true ;
		return false ;
	}
	static String intToString( int n ){
		if( n == 0 )
			return "scissor" ;
		if( n == 1 )
			return "rock" ;
		return "paper" ;
	}
}