import javax.swing.JOptionPane;

public class Oblig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Oppgave 1 
		
		String passord = JOptionPane.showInputDialog(null, "Skriv inn ditt passord: "); 
		JOptionPane.showMessageDialog(null, "Du har tastet inn: "+ passord);
		
		//Oppgave 2
		
		String uker = JOptionPane.showInputDialog("Skriv antall uker boken er lånt"); 
		int ukersomtall = Integer.parseInt(uker); 
		if(ukersomtall>4){
			JOptionPane.showMessageDialog(null, "Lever boken tilbake"); 
		}
		else if (ukersomtall<4){
			JOptionPane.showMessageDialog(null, "Du kan låne boken lenger");
		}
		else {
			JOptionPane.showMessageDialog(null, "Du må levere boken tilbake i dag");
		}
		
		//Oppgave 3 
		
		String timer = JOptionPane.showInputDialog("Hvor lenge bruker du på sosiale medier daglig? "); 
		int timersomtall = Integer.parseInt(timer); 
		
		if(timersomtall>2){
			JOptionPane.showMessageDialog(null, "For mye");
		}
		else if (timersomtall<2){
			JOptionPane.showMessageDialog(null, "For lite");
		}
		else{
			JOptionPane.showMessageDialog(null, "Akkurat passe");
		}
	}

}
