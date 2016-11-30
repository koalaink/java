import javax.swing.*;
import java.awt.*;

public class ch1210 extends JFrame {

	public ch1210(){
		setLayout(new GridLayout(10,10,0,0)) ;
		for( int i = 0 ; i < 10 ; ++i ){
			for( int j = 0 ; j < 10 ; ++j ){
				JButton jbt = new JButton() ;
				if( (i+j)%2==0 )
					jbt.setBackground(Color.WHITE) ;
				else
					jbt.setBackground(Color.BLACK) ;
				add(jbt) ;
			}
		}
	}

	public static void main( String[] args ){
		ch1210 frame = new ch1210() ;

		frame.setTitle("ch1210") ;
		frame.setSize(400,400) ;
		frame.setLocationRelativeTo(null) ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		frame.setVisible(true) ;
	}

}