import javax.swing.*;
import java.awt.*;

public class ch1209 extends JFrame {

	public ch1209(){
		String s = "book/image/card/" ;
		int card = (int)(Math.random()*54)+1 ;
		ImageIcon card1 = new ImageIcon(s+card+".png") ;
		card = (int)(Math.random()*54)+1 ;
		ImageIcon card2 = new ImageIcon(s+card+".png") ;
		card = (int)(Math.random()*54)+1 ;
		ImageIcon card3 = new ImageIcon(s+card+".png") ;
		setLayout(new GridLayout(1,3,5,5)) ;
		JLabel label1 = new JLabel(card1) ;
		JLabel label2 = new JLabel(card2) ;
		JLabel label3 = new JLabel(card3) ;
		add(label1) ;
		add(label2) ;
		add(label3) ;
	}

	public static void main( String[] args ){
		ch1209 frame = new ch1209() ;

		frame.setTitle("ch1209") ;
		frame.setSize(400,200) ;
		frame.setLocationRelativeTo(null) ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		frame.setVisible(true) ;
	}

}