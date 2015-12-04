import javax.swing.JOptionPane;

public class Oblig4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String tallTekst = JOptionPane.showInputDialog(null, "Gjett et tall mellom 1 og 10"); 
		int tall = Integer.parseInt(tallTekst); 
		int teller = 1; 
		while(tall!=7){
			if(tall>7){
				tallTekst = JOptionPane.showInputDialog(null, "Du har gjettet feil. Riktig tall er lavere.");
				tall = Integer.parseInt(tallTekst);
				teller = teller+1;
			}
			else{
				tallTekst = JOptionPane.showInputDialog(null, "Du har gjettet feil. Riktig tall er høyere.");
				tall = Integer.parseInt(tallTekst);
				teller = teller+1;
			}
			
		}
		JOptionPane.showMessageDialog(null, "Du har gjettet riktig. Du gjettet " +teller + " ganger.");
		}
}
