public class ch0925{

	public static void main( String[] args ){
		
	}

}

class MyCharacter{

	private static char c ;

	MyCharacter(char c){
		c = c ;
	}

	public static char charValue(){
		return c ;
	}

	public static int compareTo( MyCharacter b ){
		return c - b.charValue() ;
	}

	public static boolean equals( MyCharacter b ){
		if( c == b.charValue() )
			return true ;
		return false ;
	}

	public static boolean isDigit( char ch ){
		if( ch >= '0' && ch <= '9' )
			return true ;
		return false ;
	}

	public static boolean isLetter( char ch ){
		if( ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )
			return true ;
		return false ;
	}

	public static boolean isLetterOrDigit( char ch ){
		if( isDigit(ch) || isLetter(ch) )
			return true ;
		return false ;
	}

	public static boolean isLowerCase( char ch ){
		if( ch >= 'a' && ch <= 'z' )
			return true ;
		return false ;
	}

	public static boolean isUpperCase( char ch ){
		if( ch >= 'A' && ch <= 'Z' )
			return true ;
		return false ;
	}

	public static char toLowerCase( char ch ){
		if( isUpperCase(ch) )
			return (char)((char)(ch-'A')+'a') ;
		return ch ;
	}

	public static char toUpperCase( char ch ){
		if( isLowerCase(ch) )
			return (char)((char)(ch-'a')+'A') ;
		return ch ;
	}

}