import java.util.Scanner;

public class ch0720{
	static final int m = 6 ;
	static final int n = 7 ;
	static char[][] chessBoard = new char[m+5][n*2+8] ;
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		int winner = 0 ;
		int player = 1 ;
		init() ;
		boolean isDraw = false ;
		while( winner == 0 ){
			printChessBoard(player) ;
			int location = in.nextInt() ;
			int i ;
			for( i = 1 ; i <= m ; ++i ){
				if( chessBoard[i][location*2+1] != ' ' )
					continue ;
				chessBoard[i][location*2+1] = (player==1?'R':'Y') ;
				if( isPlayerWon(player) == true )
					winner = player ;
				else
					player = (player==1?2:1) ;
				int j ;
				for( j = 0 ; j < n ; ++j ){
					if( chessBoard[m][j*2+1] == ' ' )
						break ;
				}
				if( j == n ){
					isDraw = true ;
				}
				break ;
			}
			if( isDraw )
				break ;
			if( i > m )
				System.out.println("You drop at a wrong place!") ;
		}
		printChessBoard(0) ;
		if( isDraw ){
			System.out.println("It's a draw !") ;
		}
		else{
			System.out.println("The "+(winner==1?"red":"yellow")+" player won!") ;
		}
	}

	public static boolean isPlayerWon( int player ){
		char p = player==1?'R':'Y' ;
		for( int i = 1 ; i <= m ; ++i ){
			for( int j = 1 ; j <= n*2-1 ; j+=2 ){
				if( chessBoard[i][j] != p )
					continue ;
				if( j+6 <= n*2-1 && chessBoard[i][j+2] == p && chessBoard[i][j+4] == p && chessBoard[i][j+6] == p )
					return true ;
				if( i+3 <= m && chessBoard[i+1][j] == p && chessBoard[i+2][j] == p && chessBoard[i+3][j] == p )
					return true ;
				if( i+3 <= m && j+6 <= n*2-1 && chessBoard[i+1][j+2] == p && chessBoard[i+2][j+4] == p && chessBoard[i+3][j+6] == p )
					return true ;
				if( i-3 >= 1 && j+6 <= n*2-1 && chessBoard[i-1][j+2] == p && chessBoard[i-2][j+4] == p && chessBoard[i-3][j+6] == p )
					return true ;
			}
		}
		return false ;
	}

	public static void init(){
		for( int i = 0 ; i < n*2+8 ; ++i ){
			chessBoard[0][i] = '-' ;
			if( i % 2 == 1 && i < n*2 )
				chessBoard[0][i] = (char)(i/2+(int)'0') ;
		}
		for( int i = 1 ; i <= m ; ++i ){
			for( int j = 0 ; j <= 2*n ; ++j )
				if( j%2 == 0 )
					chessBoard[i][j] = '|' ;
				else
					chessBoard[i][j] = ' ' ;
		}
	}

	public static void printChessBoard( int player ){
		for( int i = m ; i > 0 ; --i ){
			for( int j = 0 ; j <= 2*n ; ++j )
				System.out.print(chessBoard[i][j]) ;
			System.out.println() ;
		}
		for( int i = 0 ; i < 2*n+8 ; ++i )
			System.out.print(chessBoard[0][i]) ;
		System.out.println() ;
		if( player == 1 ){
			System.out.print("Drop a red disk at column (0-6): ") ;
		}
		else if( player == 2 ){
			System.out.print("Drop a yellow disk at column (0-6): ") ;
		}
	}
}