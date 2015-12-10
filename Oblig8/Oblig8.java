import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Oblig8 extends JFrame implements ActionListener{
JButton spiller1 = new JButton(); 
JButton spiller2 = new JButton(); 
public int svar1; 
public int svar2; 
public boolean spiller1ferdig = false; 
public boolean spiller2ferdig = false;

Object[] valg = {"Stein","Saks","Papir"}; 
	

public Oblig8(){
	this.setVisible(true);
	FlowLayout f = new FlowLayout(); 
	this.setLayout(f);
	this.setSize(400, 200);
	
	spiller1.setText("Spiller 1");
	this.add(spiller1); 
	spiller1.addActionListener(this);
	spiller2.setText("Spiller 2");
	this.add(spiller2); 
	spiller2.addActionListener(this); 

}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource().equals(spiller1)){
		JOptionPane.showMessageDialog(this, "Spiller 1 har trykket.");
		svar1 = JOptionPane.showOptionDialog(this,"Hva velger du?", "Spiller1 velger", 0, 0, null, valg, valg[0]);
		spiller1ferdig = true; 
	}   
	if(e.getSource().equals(spiller2)){
		JOptionPane.showMessageDialog(this, "Spiller 2 har trykket.");
		svar2 = JOptionPane.showOptionDialog(this,"Hva velger du?", "Spiller2 velger", 0, 0, null, valg, valg[0]);
		spiller2ferdig = true; 
	}
	
	if(spiller1ferdig==true && spiller2ferdig==true){
		if(valg[svar1]==valg[svar2]){
			JOptionPane.showMessageDialog(this, "Det er uavgjort.");
		}
		else if (svar1==0&&svar2==1||svar1==1&&svar2==2||svar1==2&&svar2==0){
			JOptionPane.showMessageDialog(this, "Spiller 1 har vunnet");
		}
		else{
			JOptionPane.showMessageDialog(this, "Spiller 2 har vunnet");
		}
	}
	}
}

