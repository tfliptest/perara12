import javax.swing.JOptionPane;


public class Oblig3Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kroner = JOptionPane.showInputDialog(null,"Skriv antall kroner");
		double k = Integer.parseInt(kroner);
		Oblig3Funksjoner f = new Oblig3Funksjoner();
		double eur = f.kronerTilEuro(k);
		JOptionPane.showMessageDialog(null,"Euro er:"+eur);
		
		double yen = f.kronerTilYen(k);
		JOptionPane.showMessageDialog(null,"Yen er:"+yen);
	}

}
