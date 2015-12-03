import javax.swing.JOptionPane;


public class Oblig4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Oppgave 2
/*
		String gjettetTallSomTekst = JOptionPane.showInputDialog(null,"Gjett et tall mellom 1 og 10");
		int gjettetTall = Integer.parseInt(gjettetTallSomTekst);
		if (gjettetTall!=4){
			JOptionPane.showMessageDialog(null, "Du har gjettet feil");
			gjettetTall = Integer.parseInt(gjettetTallSomTekst);

		}

		//Oppgave 3
		for(int i=0;i<2;i++){
			String gjettetTallSomTekst1 = JOptionPane.showInputDialog(null,"Gjett eit tall mellom 1 og 10");
			int gjettetTall1 = Integer.parseInt(gjettetTallSomTekst1);
			if (gjettetTall1!=4){
				JOptionPane.showInputDialog(null, "Du har gjettet feil");
				gjettetTall1 = Integer.parseInt(gjettetTallSomTekst1);
			}
			else{
				break;
			}
		}
*/

		//Oppgave 4, 5, 6
			String gjettetTallSomTekst2 = JOptionPane.showInputDialog(null,"Gjett enda et tall mellom 1 og 10");
			int gjettetTall2 = Integer.parseInt(gjettetTallSomTekst2);
			int ganger = 0;
			while (gjettetTall2!=4){
				
			if(gjettetTall2<4)
				JOptionPane.showMessageDialog(null, "Prøv et høyere tall");
			
			else
				JOptionPane.showMessageDialog(null, "Prøv et lavere tall");
			
			gjettetTall2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Prøv igjen"));
			ganger++;	
			}		
			JOptionPane.showMessageDialog(null, "Du har gjettet " + ganger + " ganger!");
		}	
	}


