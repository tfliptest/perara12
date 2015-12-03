import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Oblig16GUI extends JFrame implements DocumentListener {

	double valuta;
	JComboBox fra = new JComboBox();
	JTextField input = new JTextField(25);
	JLabel output = new JLabel();
	JComboBox til = new JComboBox();
	JLabel tekstfra = new JLabel("Fra:");
	JLabel teksttil = new JLabel("Til:");


	
	public Oblig16GUI(){
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null);
		this.setLocation(500,500);
		this.add(fra);
		this.add(til);
		this.add(input);
		this.add(output);
		this.add(tekstfra);
		this.add(teksttil);
		input.getDocument().addDocumentListener(this);
		
		fra.addItem("Kroner");
		fra.addItem("Dollar");
		fra.addItem("Yen");
		fra.addItem("Euro");
		
		til.addItem("Kroner");
		til.addItem("Dollar");
		til.addItem("Yen");
		til.addItem("Euro");
		
		fra.setSize(100,20);
		fra.setLocation(100,100);
		
		input.setSize(100,20);
		input.setLocation(225,100);
		
		til.setSize(100,20);
		til.setLocation(100,150);
		
		output.setSize(100,20);
		output.setLocation(225, 150);
		
		tekstfra.setSize(200,200);
		tekstfra.setLocation(70,10);
		
		teksttil.setSize(200,200);
		teksttil.setLocation(70,60);
	}
	/*
	public double konverterTilEuro(double valuta, String fra){
		if(fra.equals("Kroner"))
		return valuta*8.7425;
		
		if(fra.equals("Yen"))
		return valuta*135.7194;
		
		if(fra.equals("Dollar"))
		return valuta*1.1328;
		
	return valuta;
	}
	
	public double konverterFraEuro(double valuta, String til){
		if(til.equals("Kroner"))
		return valuta/2;
		
		if(til.equals("Yen"))
		return valuta/5;
		
		if(til.equals("Dollar"))
		return valuta/6;
		
	return valuta;
	}
	*/
	
	public double Konverterer(double valuta, String fra, String til){
		if(fra.equals("Kroner")){
			if(til.equals("Dollar"))
				return valuta*0.131;
			
			if(til.equals("Yen"))
				return valuta*15.548;
			
			if(til.equals("Euro"))
				return valuta*0.115;
			
			if(til.equals("Kroner"))
				return valuta*1;
		}
		
		if(fra.equals("Dollar")){
			if(til.equals("Yen"))
				return valuta*119.085;
			
			if(til.equals("Kroner"))
				return valuta*7.599;
			
			if(til.equals("Euro"))
				return valuta*0.887;
			
			if(til.equals("Dollar"))
				return valuta*1;
		}
		
		if(fra.equals("Yen")){
			if(til.equals("Dollar"))
				return valuta*0.0083;
			
			if(til.equals("Kroner"))
				return valuta*0.064;
			
			if(til.equals("Euro"))
				return valuta*0.0074;
			
			if(til.equals("Yen"))
				return valuta*1;
		}
		
		if(fra.equals("Euro")){
			if(til.equals("Dollar"))
				return valuta*1.1328;
			
			if(til.equals("Yen"))
				return valuta*135.7194;
			
			if(til.equals("Kroner"))
				return valuta*8.7425;
			
			if(til.equals("Euro"))
				return valuta*1;
		}
			
		return valuta;
	}
		
	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		valuta = Double.parseDouble(input.getText());
		valuta = Konverterer(valuta,(String)fra.getSelectedItem(),(String)til.getSelectedItem());
		output.setText(Double.toString(valuta));
		
		/*
		valuta = Double.parseDouble(input.getText());
		valuta = konverterTilEuro(valuta,(String)fra.getSelectedItem());
		output.setText(Double.toString(valuta));
		
		valuta = Double.parseDouble(input.getText());
		valuta = konverterTilEuro(valuta,(String)til.getSelectedItem());
		output.setText(Double.toString(valuta));
		*/
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}