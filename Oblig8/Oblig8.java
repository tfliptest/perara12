import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Oblig8 extends JFrame implements ActionListener{
	JButton spiller1Knapp = new JButton();
	JButton spiller2Knapp = new JButton();
	String valgSpiller1 = "";
	String valgSpiller2 = "";
	
	public Oblig8(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel spiller1Tekst = new JLabel();
		spiller1Tekst.setText("Spiller1");
		
		JLabel spiller2Tekst = new JLabel();
		spiller2Tekst.setText("Spiller2");
		

		spiller1Knapp.setText("Spiller 1: Velg Stein, Saks eller Papir");
		


		spiller2Knapp.setText("Spiller 2: Velg Stein, Saks eller Papir");
		
		GridLayout g = new GridLayout(2,2);
		this.setLayout(g);
		this.add(spiller1Tekst);
		this.add(spiller2Tekst);
		this.add(spiller1Knapp);
		this.add(spiller2Knapp);
		spiller1Knapp.addActionListener(this);
		spiller2Knapp.addActionListener(this);
	}

	public void hvemHarVunnet(){
		if(valgSpiller1.equals("Papir") && valgSpiller2.equals("Papir")){
			JOptionPane.showMessageDialog(null, "Uavgjort");
		}
		else if(valgSpiller1.equals("Saks") && valgSpiller2.equals("Saks")){
			JOptionPane.showMessageDialog(null, "Uavgjort");
		}
		else if(valgSpiller1.equals("Stein") && valgSpiller2.equals("Stein")){
			JOptionPane.showMessageDialog(null, "Uavgjort");
		}
	
		else if(valgSpiller1.equals("Papir") && valgSpiller2.equals("Stein")){
			JOptionPane.showMessageDialog(null, "Spiller 1 vant");
		}
		else if(valgSpiller1.equals("Saks") && valgSpiller2.equals("Papir")){
			JOptionPane.showMessageDialog(null, "Spiller 1 vant");
		}
		else if(valgSpiller1.equals("Stein") && valgSpiller2.equals("Papir")){
			JOptionPane.showMessageDialog(null, "Spiller 1 vant");
		}
		else if(valgSpiller2.equals("Papir") && valgSpiller1.equals("Stein")){
			JOptionPane.showMessageDialog(null, "Spiller 2 vant");
		}
		else if(valgSpiller2.equals("Saks") && valgSpiller1.equals("Papir")){
			JOptionPane.showMessageDialog(null, "Spiller 2 vant");
		}
		else if(valgSpiller2.equals("Stein") && valgSpiller1.equals("Papir")){
			JOptionPane.showMessageDialog(null, "Spiller 2 vant");
		}
		
		
	}
	/*
	public void hvemHarVunnet_2(){
		if(valgSpiller1.equals(valgSpiller2)){
			JOptionPane.showMessageDialog(null, "Uavgjort");
		}
		else if(valgSpiller1.equals("Papir") && valgSpiller2.equals("Stein")){
			JOptionPane.showMessageDialog(null, "Spiller 1 vant");
		}
		else if(valgSpiller1.equals("Saks") && valgSpiller2.equals("Papir")){
			JOptionPane.showMessageDialog(null, "Spiller 1 vant");
		}
		else if(valgSpiller1.equals("Stein") && valgSpiller2.equals("Papir")){
			JOptionPane.showMessageDialog(null, "Spiller vant");
		}
		else{
			JOptionPane.showMessageDialog(null, "Spiller 2 vant");
		}
	}*/
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String[] valg = new String[3];
		valg[0] = "Stein";
		valg[1] = "Papir";
		valg[2] = "Saks";
		if(arg0.getSource().equals(spiller1Knapp)){

			int brukerValg = JOptionPane.showOptionDialog(this, "Velg stein saks eller papir", "Stein,Saks,Papir", 0, 0, null, valg, valg[0]);
			JOptionPane.showMessageDialog(this, "Du har valgt:"+valg[brukerValg]);
			valgSpiller1 = valg[brukerValg];
			JOptionPane.showMessageDialog(this,"Spiller 1 har trykket");
		}
		if(arg0.getSource().equals(spiller2Knapp)){
			
			JOptionPane.showMessageDialog(this,"Spiller 2 har trykket");
			int brukerValg = JOptionPane.showOptionDialog(this, "Velg stein saks eller papir", "Stein,Saks,Papir", 0, 0, null, valg, valg[0]);
			JOptionPane.showMessageDialog(this, "Du har valgt:"+valg[brukerValg]);
			valgSpiller2 = valg[brukerValg];
	
		}
		this.hvemHarVunnet();
		
		
	}
}
