import javax.swing.JOptionPane;



public class Oblig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Oppgave 1

		String svar = JOptionPane.showInputDialog(null,"Tast inn et passord");
		System.out.println("Du har tastet inn "+svar);

		//Oppgave 2
		String laant = JOptionPane.showInputDialog(null,"Skriv antall uker du har l�nt boken");
		int laant_som_tall = Integer.parseInt(laant);
		if(laant_som_tall>4){
			System.out.println("Lever boken tilbake");
		}
		else if(laant_som_tall<4){
			System.out.println("Du kan l�ne boken lenger");
		}
		else{
			System.out.println("Du m� levere boken tilbake i dag");
		}

		//Oppgave 3
		String sosiale = JOptionPane.showInputDialog(null,"Hvor lenge bruker du p� sosiale medier daglig?");
		int sosiale_som_tall = Integer.parseInt(sosiale);
		if(sosiale_som_tall>2){
			System.out.println("For mye");
		}
		else if(sosiale_som_tall<2){
			System.out.println("For lite");
		}
		else{
			System.out.println("Akkurat passe");
		}
	}

}
