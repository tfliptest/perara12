import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Oblig11 extends JFrame implements DocumentListener {
	JTextField fra = new JTextField(25);
	JTextField til = new JTextField(25);

	
	public Oblig11(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout f = new FlowLayout();
	
		this.add(fra);
		this.add(til);

		this.setSize(500,500);
		this.setVisible(true);
		fra.getDocument().addDocumentListener(this);
		this.setLayout(f);
		
	}
	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		String fratekst = fra.getText();
		String nytekst = this.oversetter(fratekst);
		til.setText(nytekst);
		
	}
	
	public String oversetter(String input){
		input = input.replace("jeg","eg");
		input = input.replace("ikke","ikkje");
		input = input.replace("liker", "likar");
		input = input.replace("rånere", "rånarar");
		input = input.replace("Bjørnar", "Sivert");
		return input;
	}
	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		String fratekst = fra.getText();
		String nytekst = this.oversetter(fratekst);
		til.setText(nytekst);
	}

	
}
