// 280
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class ch0934{

	public static void main( String[] args ) throws Exception {
		if( args.length != 3 ){
			System.out.println("Usage: java ch0934 dir oldString newString");
			System.exit(0) ;
		}

		File file = new File(args[0]) ;
		if( !file.exists() ){
			System.out.println("Source file "+args[0]+" does not exist!") ;
			System.exit(0) ;
		}

		File[] souceFile = file.listFiles() ;

		int index = 0 ;
		while( index < souceFile.length ){

			Scanner input = new Scanner(souceFile[index]) ;

			String s3 = "" ;
			while( input.hasNext() ){
				String s1 = input.nextLine() ;
				// System.out.println(s1) ;
				String s2 = s1.replaceAll(args[1],args[2]) ;
				s3 = s3 + s2 + '\n' ;
			}
			
			PrintWriter output = new PrintWriter(souceFile[index]) ;
			output.print(s3) ;

			input.close() ;
			output.close() ;

			index++ ;

		}
	}

}