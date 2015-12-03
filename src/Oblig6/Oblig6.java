import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Oblig6 extends JFrame{
	
	public Oblig6(){
		
	this.setVisible(true);
	this.setTitle("Julekalender");
	this.setSize(400,300);
	this.setLocation(500,300);

	FlowLayout f = new FlowLayout();
	this.setLayout(f);

	JButton button[] = new JButton[25];

	for (int i=1; i<25; i++){
		button[i] = new JButton("Luke "+ i);
		this.add(button[i]);

	}
}
}
