import java.util.Scanner;
public class ch0622{
	static int ans = 0 ;
	static final int n = 8 ;
	static char[][] chessBoard = new char[n+1][n*2+1] ;
	public static void main( String[] args ){
		init() ;
		for( int j = 1 ; j < 2*n+1 ; j += 2 ){
			chessBoard[0][j] = 'Q' ;
			setChessBoard(1) ;
			chessBoard[0][j] = ' ' ;
		}
	}

	public static boolean setChessBoard( int num ){

		if( num == 8 ){
			ans++ ;
			System.out.println("The "+ans+" ans is:") ;
			print() ;
			return true ;
		}
		// if( num != 0 ) chessBoard[ii][jj] = 'Q' ;
		// print() ;
		for( int i = 0 ; i < n ; ++i ){
			if( isRowHas(i) ) continue ;
			for( int j = 1 ; j < 2*n+1 ; j += 2 ){
				if( chessBoard[i][j] != ' ' ) continue ;
				if( isColHas(j) ) continue ;
				if( !isRightLine(i,j) && !isLeftLine(i,j) ){
					chessBoard[i][j] = 'Q' ;
					setChessBoard(num+1) ;
					chessBoard[i][j] = ' ' ;
				}
			}
			break ;
		}
		return false ;
	}

	public static boolean isRightLine( int i , int j ){
		int ii = i ;
		int jj = j ;
		while( ii >= 0 && jj >= 1 ){
			if( chessBoard[ii][jj] != ' ' )
				return true ;
			--ii ;
			jj-=2 ;
		}
		ii = i ;
		jj = j ;
		while( ii < n && jj < 2*n+1 ){
			if( chessBoard[ii][jj] != ' ' )
				return true ;
			++ii ;
			jj+=2 ;
		}
		return false ;
	}

	public static boolean isLeftLine( int i , int j ){
		int ii = i ;
		int jj = j ;
		while( ii >= 0 && jj < 2*n+1 ){
			if( chessBoard[ii][jj] != ' ' )
				return true ;
			--ii ;
			jj+=2 ;
		}
		ii = i ;
		jj = j ;
		while( ii < n && jj >= 1 ){
			if( chessBoard[ii][jj] != ' ' )
				return true ;
			++ii ;
			jj-=2 ;
		}
		return false ;
	}

	public static boolean isColHas( int j ){
		for( int k = 0 ; k < n ; ++k )
			if( chessBoard[k][j] != ' ' )
				return true ;
		return false ; 
	}

	public static boolean isRowHas( int i ){
		for( int k = 1 ; k < 2*n+1 ; k += 2 )
			if( chessBoard[i][k] != ' ' )
				return true ;
		return false ;
	}

	public static void print(){
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < 2*n+1 ; ++j )
				System.out.print(chessBoard[i][j]) ;
			System.out.println() ;
		}
		for( int j = 0 ; j < 2*n+1 ; ++j )
			System.out.print('-') ;
		System.out.println() ;
	}

	public static void init(){
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < 2*n+1 ; ++j ){
				if( j % 2 == 0 )
					chessBoard[i][j] = '|' ;
				else
					chessBoard[i][j] = ' ' ;
			}
		}
	}
}