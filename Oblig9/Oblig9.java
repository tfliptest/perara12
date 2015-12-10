import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Oblig9 extends JFrame implements ActionListener{
	JButton nyBrus = new JButton(); 
	JButton info = new JButton(); 
	JButton besteBrus = new JButton(); 
	JLabel bb = new JLabel();
	String bbnavn; 
	int bbpoeng; 
	
	DefaultListModel<Oblig9Brus> julebrusmodel = new DefaultListModel<Oblig9Brus>(); 
	
	public Oblig9(){
		FlowLayout f = new FlowLayout(); 
		this.setLayout(f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nyBrus.setText("Legg til en ny brus");
		this.add(nyBrus); 
		nyBrus.addActionListener(this);
		
		info.setText("Søk");
		this.add(info); 
		info.addActionListener(this);
		
		besteBrus.setText("Beste brus:");
		this.add(besteBrus);
		besteBrus.addActionListener(this);
		
		
		JList liste = new JList(julebrusmodel); 
		this.add(liste);
		
		this.setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(nyBrus)){
			Oblig9Brus j = new Oblig9Brus(); 
			String brusmerke =  JOptionPane.showInputDialog(this, "Skriv inn brusmerke:");
			String spoengsum =  JOptionPane.showInputDialog(this, "Skriv poengsum:");
			int poengsum = Integer.parseInt(spoengsum); 
			
			j.setBrusmerke(brusmerke);
			j.setPoengsum(poengsum);
			julebrusmodel.addElement(j);
			
		}
		if(e.getSource().equals(info)){
			String sok = JOptionPane.showInputDialog(this, "Søk etter en julebrus:"); 
			
			for(int i=0;i<julebrusmodel.getSize();i++){
				
				if(sok.equals(julebrusmodel.get(i).getBrusmerke())){
					JOptionPane.showMessageDialog(this, julebrusmodel.get(i).toString());
				}	
				
			}
		}
		if(e.getSource().equals(besteBrus)){
			for(int i=0;i<julebrusmodel.getSize();i++){
				Oblig9Brus b = julebrusmodel.getElementAt(i); 
				
					if(b.getPoengsum()>bbpoeng){
						bbpoeng = b.getPoengsum(); 
						bbnavn = b.getBrusmerke(); 		
						this.add(bb); 
						bb.setText("Beste brus: "+ bbnavn + ", med poeng: "+bbpoeng);
				}	
			}	
		} 
	}

}
