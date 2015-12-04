import javax.swing.JOptionPane;

public class Oblig3Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oblig3Funksjoner f = new Oblig3Funksjoner(); 
		String tekstKroner = JOptionPane.showInputDialog(null, "Skriv kr ");
		double NOK = Double.parseDouble(tekstKroner);
		double EUR = f.kronerTilEuro(NOK); 
		JOptionPane.showMessageDialog(null, NOK + " kroner er lik "+ EUR + " Euro.");
		double YEN = f.kronerTilYen(NOK);
		JOptionPane.showMessageDialog(null, NOK + " kroner er lik "+ YEN + " Yen.");
		 
	}

}
