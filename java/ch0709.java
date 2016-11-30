import java.util.Scanner;

public class ch0709{

	static final int n = 4 ;
	static char[][] chessBoard = new char[n*2][n*2] ;

	static Scanner in = new Scanner(System.in) ;

	public static void main( String[] args ){
		init() ;
		int winner = 0 ;
		char player = 'X' ;
		int step = 0 ;
		while( winner == 0 ){
			int input = printChessBoard(player) ;
			int r = input/10 * 2 - 1 ;
			int c = input%10 * 2 - 1 ;
			if( chessBoard[r][c] != ' ' ){
				System.out.println("You drop at a wrong place!") ;
				continue ;
			}
			chessBoard[r][c] = player ;
			step++ ;
			
			if( isPlayerWin(player,r,c) )
				winner = player=='X'?1:2 ;
			else if( step == 9 ){
				winner = 3 ;
			}
			else{
				player = player=='X'?'O':'X' ;
			}
		}
		printChessBoard(' ') ;
		if( winner == 3 )
			System.out.println("It's a draw !" ) ;
		else
			System.out.println((winner==1?'X':'O')+" player won !") ;
	}

	public static boolean isPlayerWin( char player , int r , int c ){
		int s = c - 2 ;
		int e = c + 2 ;
		int num = 1 ;
		while( s > 0 && chessBoard[r][s] == player ){
			s-=2 ;
			++num ;
		}
		while( e < 2*n-1 && chessBoard[r][e] == player ){
			e+=2 ;
			++num ;
		}
		if( num >= 3 )
			return true ;
		s = r - 2 ;
		e = r + 2 ;
		num = 1 ;
		while( s > 0 && chessBoard[s][c] == player ){
			s-=2 ;
			++num ;
		}
		while( s < 2*n-1 && chessBoard[e][c] == player ){
			e+=2 ;
			++num ;
		}
		if( num >= 3 )
			return true ;
		if( r == c && chessBoard[1][1] == chessBoard[3][3] && chessBoard[3][3] == chessBoard[5][5] && chessBoard[1][1] == player )
			return true ;
		return false ;
	}

	public static void init(){

		for( int i = 0 ; i < n*2-1 ; ++i ){
			for( int j = 0 ; j < n*2-1 ; ++j ){
				if( i % 2 == 0 )
					chessBoard[i][j] = '-' ;
				else if( j % 2 == 0 )
					chessBoard[i][j] = '|' ;
				else
					chessBoard[i][j] = ' ' ;
			}
		}

	}

	public static int printChessBoard( char player ){

		for( int i = 0 ; i < n*2-1 ; ++i ){
			for( int j = 0 ; j < n*2-1 ; ++j ){
				System.out.print(chessBoard[i][j]) ;
			}
			System.out.println() ;
		}
		if( player != ' ' ){
			System.out.print("Enter a row (1, 2, or 3) for player "+player+": ") ;
			int r = in.nextInt() ;
			System.out.print("Enter a column (1, 2, or 3) for player "+player+": ") ;
			int c = in.nextInt() ;
			return r*10+c ;
		}
		else
			return 0 ;
	}

}