public class ch0405{
	public static void main( String[] args ){
		int kg = 1 ;
		int pound = 22 ;
		int bpound = 20 ;
		double c = 5/2.2 ;
		double ans = 20/2.2 ;
		System.out.println("Kg     Pound     Pound     Kg") ;
		for( ; kg < 200 ; kg+=2 ){
			System.out.println(kg + (kg<10?"  ":(kg<100?" ":"")) + "   " + (double)pound/10 + "     " + bpound + "     " + ans) ;
			pound+=44 ;
			bpound+=5 ;
			ans+=c ;
		}
	}
}