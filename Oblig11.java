import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Oblig11 extends JFrame implements DocumentListener{
	JTextField fra;
	JTextField til;
	
	public Oblig11(){
		this.setLayout(new GridLayout(2,2));
		JLabel bokmaal = new JLabel("Fra språk: Bokmål");
		JLabel nynorsk = new JLabel("Til språk: Nynorsk");
		
		fra = new JTextField(30);
		til = new JTextField(30);
		this.add(bokmaal);
		this.add(nynorsk);

		this.add(fra);
		this.add(til);

		fra.getDocument().addDocumentListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public String oversett(String tekst){
		tekst = tekst.replace("jeg", "eg");
		tekst = tekst.replace("en", "ein");
		tekst = tekst.replace("et", "eit");
		return tekst;
	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		til.setText(this.oversett(fra.getText()));
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
		til.setText(this.oversett(fra.getText()));
		
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		til.setText(this.oversett(fra.getText()));
		
	}
}
