import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class Oblig13GUI extends JFrame implements ActionListener {

	DefaultListModel<Oblig13Vare> list = new DefaultListModel<Oblig13Vare>();

	JButton apnebehold = new JButton("Åpne beholdning");
	JButton lagbehold = new JButton("Lagre beholdning");
	JButton addvare = new JButton("Legg til vare");
	JButton selgevare = new JButton("Selge vare");
	
	JList<Oblig13Vare> behold = new JList<Oblig13Vare>(list);
	
	public Oblig13GUI(){

	this.setLayout(new FlowLayout());
	this.add(apnebehold);
	this.add(lagbehold);
	this.add(addvare);
	this.add(selgevare);
	this.add(behold);
	this.setSize(500,500);
	
	apnebehold.addActionListener(this);
	lagbehold.addActionListener(this);
	addvare.addActionListener(this);
	selgevare.addActionListener(this);

	
	this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource().equals(addvare)){
			Oblig13Vare v = new Oblig13Vare();
			String navn = JOptionPane.showInputDialog(null,"Legg til vare");
			v.setVare(navn);
			list.addElement(v);
		}
		
		if(arg0.getSource().equals(selgevare)){
			 if(behold.getSelectedIndex()>=0)
	                list.remove(behold.getSelectedIndex());
		}
		
		if(arg0.getSource().equals(lagbehold)){
			try {
				FileWriter f = new FileWriter("Varer.txt");
				BufferedWriter bf = new BufferedWriter(f);
				for(int i=0;i<list.size();i++) {
					bf.write(list.getElementAt(i).toString()+"\n");
				}
				bf.close();
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if(arg0.getSource().equals(apnebehold)){
			FileReader f;
			try {
				f = new FileReader("Varer.txt");
				BufferedReader b = new BufferedReader(f);
				try {
					String linje = b.readLine();
					while(linje!=null){
						JOptionPane.showMessageDialog(null,linje);
						linje = b.readLine();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
