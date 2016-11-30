import java.util.Random;

public class ch0804{
	public static void main( String[] args ){
		Random random = new Random(1000) ;
		int i = 0 ;
		while( i < 50 ){
			int x = random.nextInt(100) ;
			System.out.println(x) ;
			++i ;
		}
	}
}