public class ch0403{
	public static void main( String[] args ){
		int kg = 1 ;
		int pound = 22 ;
		System.out.println("Kg     Pound") ;
		for( ; kg < 200 ; ++kg ){
			System.out.println(kg + (kg<10?"  ":(kg<100?" ":"")) + "   " + (double)pound/10) ;
			pound+=22 ;
		}
	}
}