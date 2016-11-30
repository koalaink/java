import java.util.Scanner;

public class ch0929{

	public static void main( String[] args ){

	}

	public static String[] split( String s1 , String s2 ){
		String[] ans = new String[s1.length()] ;
		int index = 0 ; 
		for( int i = 0 ; i < s1.length()-s2.length()+1 ; ++i ){
			if( s1.subString(i,i+j).equals(s2) ){
				ans[index] = s1.subString() ;
			}
		}
	}
}