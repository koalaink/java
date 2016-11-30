import java.util.Scanner;

public class ch0931{

	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		String[] words = { "write" , "that" , "fuck" , "holy" , "shit" , "hello" , "world" } ;
		int len = words.length ;
		boolean go = true ;
		while( go ){
			int index = (int)(Math.random()*len) ;
			int wordLength = words[index].length() ;
			char[] word = new char[wordLength] ;
			int guessed = 0 ;
			int wrongGuess = 0 ;
			for( int i = 0 ; i < wordLength ; ++i )
				word[i] = '*' ;
			while( guessed < wordLength ){
				System.out.print("(Guesse) Enter a letter in word ") ;
				for( int j = 0 ; j < wordLength ; ++j )
					System.out.print(word[j]) ;
				System.out.print(" >") ;
				String g = in.next() ;
				boolean found = false ;
				int i ;
				for( i = 0 ; i < wordLength ; ++i ){
					if( words[index].charAt(i) == g.charAt(0) && word[i] == g.charAt(0) ){
						System.out.println("      "+g.charAt(0)+"  is already in the word") ;
						break ;
					}
					else if( words[index].charAt(i) == g.charAt(0) ){
						found = true ;
						word[i] = g.charAt(0) ;
						guessed++ ;
					}
				}
				if( guessed == wordLength ){
					System.out.println("The word is "+words[index]+". You missed "+wrongGuess+" time") ;
					System.out.print("\nDo you want to guess for another word? Enter y or n>") ;
					String cho = in.next() ;
					if( cho.equals("n") )
						go = false ;
					break ;
				}
				if( i == wordLength && found == false ){
					System.out.println("      "+g.charAt(0)+"  is not in the word") ;
					wrongGuess++ ;
				}
			}
		}
	}


}