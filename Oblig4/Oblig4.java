import javax.swing.JOptionPane;


public class Oblig4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tallSomTekst = JOptionPane.showInputDialog(null,"Gjett et tall mellom 1 og 10");
		int tall = Integer.parseInt(tallSomTekst);
		int teller = 0;
		while(tall!=5){
			JOptionPane.showMessageDialog(null, "Du har gjettet feil");
			if(tall<5){
				JOptionPane.showMessageDialog(null, "Riktig tall er høyere");
			}
			else if(tall>5){
				JOptionPane.showMessageDialog(null, "Riktig tall er lavere");
			}
			tallSomTekst = JOptionPane.showInputDialog(null,"Gjett et tall mellom 1 og 10");
			tall = Integer.parseInt(tallSomTekst);
			teller += 1;
			
		}
		JOptionPane.showMessageDialog(null, "Du gjettet riktig. Du gjettet "+teller+" ganger");
		

	}

}
