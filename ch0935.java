import java.util.Scanner;

public class ch0935{

	public static void main( String[] args ){
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter a genome string: ") ;
		String genome = in.next() ;
		boolean has = false ;
		while( true ){
			String[] subOfGenome = new String[2] ;
			if( isFound(genome) == false )
				break ;
			subOfGenome = genome.split("ATG",2) ;
			String ans = "" ;
			String tmp = "" ;
			boolean flag = false ;
			for( int i = 0 ; i < subOfGenome[1].length() - 3 ; i += 3 ){
				tmp += subOfGenome[1].substring(i,i+3) ;
				if( tmp.endsWith("TAG") || tmp.endsWith("TAA") || tmp.endsWith("TGA") ){
					has = true ;
					flag = true ;
					System.out.println(tmp.substring(0,tmp.length()-3)) ;
					genome = subOfGenome[1].substring(i+3) ;
					break ;
				}
			}
			if( flag == false ){
				genome = subOfGenome[1] ;
			}
		}
		if( has == false )
			System.out.println("no gene is found") ;
	}

	public static boolean isFound( String s ){
		for( int i = 0 ; i < s.length() - 2 ; ++i )
			if( s.charAt(i) == 'A' && s.charAt(i+1) == 'T' && s.charAt(i+2) == 'G' )
				return true ;
		return false ;
	}

}