import javax.swing.JOptionPane;


public class Oblig3Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Oblig3Funksjoner f = new Oblig3Funksjoner();
		String tekst = (JOptionPane.showInputDialog(null,"Antall kroner"));
		double kroner = Double.parseDouble(tekst);
		double euro = f.kronerTilEuro(kroner);
		JOptionPane.showMessageDialog(null,euro + " euro");
		double yen = f.kronerTilYen(kroner);
		JOptionPane.showMessageDialog(null,yen + " yen");
	}

}
