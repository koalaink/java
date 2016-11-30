import java.util.ArrayList;

public class ch1106{

	public static void main( String[] args ){
		ArrayList list = new ArrayList() ;
		list.add("This is a string") ;
		list.add(new java.util.Date()) ;
		for( int i = 0 ; i < list.size() ; ++i )
			System.out.println(list.get(i).toString()) ;
	}

}