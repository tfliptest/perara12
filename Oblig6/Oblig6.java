import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Oblig6 extends JFrame {
	public Oblig6(){
		this.setVisible(true);
		this.setTitle("Julekalender");
		
		FlowLayout f = new FlowLayout(); 
		this.setLayout(f);
		
		JLabel tekst = new JLabel(); 
		tekst.setText("Velkommen til årets julekalender");
		this.add(tekst); 
		
		for(int i = 1;i<=24;i=i+1){
			JButton luke = new JButton();
			luke.setText("Luke "+i);
			this.add(luke);
		}
		 
		
		
		
		
		
		
		}

}
