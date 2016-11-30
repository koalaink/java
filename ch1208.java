import javax.swing.*;
import java.awt.*;

public class ch1208 extends JFrame {

	public ch1208(){
		setLayout(new GridLayout(2,3,10,10)) ;

		JLabel label = new JLabel("black") ;
		Font font = new Font("TimesRoman",Font.BOLD,20) ;
		
		label.setBackground(Color.WHITE) ;
		label.setForeground(Color.BLACK) ;
		label.setFont(font) ;
		add(label) ;

		label = new JLabel("blue") ;
		label.setBackground(Color.WHITE) ;
		label.setForeground(Color.BLUE) ;
		label.setFont(font) ;
		add(label) ;

		label = new JLabel("cyan") ;
		label.setBackground(Color.WHITE) ;
		label.setForeground(Color.CYAN) ;
		label.setFont(font) ;
		add(label) ;

		label = new JLabel("green") ;
		label.setBackground(Color.WHITE) ;
		label.setForeground(Color.GREEN) ;
		label.setFont(font) ;
		add(label) ;

		label = new JLabel("magenta") ;
		label.setBackground(Color.WHITE) ;
		label.setForeground(Color.MAGENTA) ;
		label.setFont(font) ;
		add(label) ;

		label = new JLabel("orange") ;
		label.setBackground(Color.WHITE) ;
		label.setForeground(Color.ORANGE) ;
		label.setFont(font) ;
		add(label) ;
	}

	public static void main( String[] args ){
		ch1208 frame = new ch1208() ;

		frame.setTitle("ch1208") ;
		frame.setSize(400,200) ;
		frame.setLocationRelativeTo(null) ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		frame.setVisible(true) ;

	}

}