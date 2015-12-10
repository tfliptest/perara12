import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Oblig16 extends JFrame implements DocumentListener{
	JTextField fra = new JTextField(30);
	JLabel til = new JLabel();
	String[] valutaer = {"yen","dollar","kroner"};
	JComboBox fravaluta = new JComboBox(valutaer);
	JComboBox tilvaluta = new JComboBox(valutaer);
	
	//double yen=7.45;
	
	public Oblig16(){
		this.setLayout(new FlowLayout());
		this.setBounds(0, 0, 400, 400);
		this.setVisible(true);
		this.add(new JLabel("Fra:"));
		this.add(fra);
		
		this.add(fravaluta);
		this.add(new JLabel("Til:"));
		this.add(tilvaluta);
		this.add(til);
		this.fra.getDocument().addDocumentListener(this);
	}
	

	
	public double konverterTilEuro(double kilde, String fra_valuta){
		if(fra_valuta.equals("kroner")){
			return kilde*0.13; 
		}
		if(fra_valuta.equals("dollar")){
			return kilde*0.74; 
		}
		if(fra_valuta.equals("yen")){
			return kilde*0.01; 
		}
		return 0;
	}
	
	public double konverterFraEuro(double kilde, String til_valuta){
		if(til_valuta.equals("kroner")){
			System.out.println(kilde/0.13);
			return kilde/0.13; 
		}
		if(til_valuta.equals("dollar")){
			return kilde/0.74; 
		}
		if(til_valuta.equals("yen")){
			return kilde/0.01; 
		}
		return 0;
	}
	
	public double konverter(double kilde,String fra_valuta,String til_valuta){
		double euro = konverterTilEuro(kilde, fra_valuta);
		double annenvaluta = konverterFraEuro(euro,til_valuta);
		return annenvaluta;
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {

		double input_tall = Double.parseDouble(fra.getText());
		String fra_valuta = (String)this.fravaluta.getSelectedItem();
		String til_valuta = (String)this.tilvaluta.getSelectedItem();
		
		double nyvaluta = konverter(input_tall,fra_valuta,til_valuta);
		
		til.setText(""+nyvaluta);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
