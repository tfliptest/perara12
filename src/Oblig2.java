import javax.swing.JOptionPane;


public class Oblig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Oppgave 1
			String passord = JOptionPane.showInputDialog(null,"Skriv passord");
				JOptionPane.showMessageDialog(null, passord);
			
		//Oppgave 2
			String antall_uker = JOptionPane.showInputDialog(null,"Skriv antall uker boken er utlånt");
			int uker = Integer.parseInt(antall_uker);
			if(uker>4){
				JOptionPane.showMessageDialog(null,"Lever boken tilbake");
			}
			else if(uker==4){
				JOptionPane.showMessageDialog(null, "Du må levere boken tilbake idag");
			}
			else {
				JOptionPane.showMessageDialog(null, "Du kan låne boken lenger");
			}
			
		//Oppgave 3
			String antall_timer = JOptionPane.showInputDialog(null,"Hvor lenge bruker du på sosiale medier hver dag?");
			int timer = Integer.parseInt(antall_timer);
			if(timer>2){
				JOptionPane.showMessageDialog(null,"For mye");
			}
			else if(timer==2){
				JOptionPane.showMessageDialog(null, "Akkurat passe");
			}
			else {
				JOptionPane.showMessageDialog(null, "For lite");
			}
			
		//Oppgave 4
			String passord1 = JOptionPane.showInputDialog(null,"Skriv passord");
			if (passord1.equals("hei")){
				JOptionPane.showMessageDialog(null, "Access Granted");
			}
			else	{
				JOptionPane.showMessageDialog(null, "Access Denied");
			}
			
			
			
			String passord2 = JOptionPane.showInputDialog(null,"Skriv passord");
			while (!passord2.equals("hei"))	{
				JOptionPane.showMessageDialog(null, "Access Denied");
				passord2 =	JOptionPane.showInputDialog(null, "Prøv igjen");
				
			}
				JOptionPane.showMessageDialog(null, "Access Granted");
			}	
			

			}
				
	}



