import javax.swing.*;
import java.awt.*;

public class ch1203 extends JFrame {

	public ch1203() {
		JPanel p1 = new JPanel() ;
		p1.setLayout( new GridLayout(1,3,5,5) ) ;

		for( int i = 1 ; i <= 3 ; ++i )
			p1.add( new JButton("Button"+i) ) ;

		JPanel p2 = new JPanel() ;
		p2.setLayout( new GridLayout(1,3,5,5) ) ;

		for( int i = 4 ; i <= 6 ; ++i )
			p2.add( new JButton("Button "+i) ) ;

		setLayout( new GridLayout(1,2,5,5) ) ;
		add(p1) ;
		add(p2) ;
	}

	public static void main( String[] args ){
		ch1203 frame = new ch1203() ;

		frame.setTitle("ch1203") ;
		frame.setSize(600,100) ;
		frame.setLocationRelativeTo(null) ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		frame.setVisible(true) ;
	}

}