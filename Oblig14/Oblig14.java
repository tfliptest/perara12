import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class Oblig14 extends JFrame implements ActionListener{
	DefaultListModel m1 = new DefaultListModel();
	JList l1 = new JList(m1);

	DefaultListModel m2 = new DefaultListModel();
	JList l2= new JList(m2);

	DefaultListModel m3 = new DefaultListModel();
	JList l3= new JList(m3);

	JButton knapp = new JButton("Trekk tall");
	JButton sjekkOmRikig = new JButton("Sjekk om rikig");

	public ArrayList<Integer> tall = new ArrayList<Integer>();
	public HashSet<Integer> tall2 = new HashSet<Integer>();
	public TreeSet<Integer> tall3 = new TreeSet<Integer>();

	public Oblig14(){
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new JLabel("Lottotall:"));
		this.add(l1);
		this.add(new JLabel("Unike lottotall:"));
		this.add(l2);
		this.add(new JLabel("Sorterte"));
		this.add(l3);


		this.add(knapp);
		knapp.addActionListener(this);	

		this.setVisible(true);
	}

	public void oppdaterGUI(JList enliste, Object[] tall){
		DefaultListModel m = new DefaultListModel();
		for (Object s : tall) {
			m.addElement(s);
		}
		enliste.setModel(m);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		tall = new ArrayList<Integer>();

		tall2 = new HashSet<Integer>();
		tall3 = new TreeSet<Integer>();
		for (int i = 0; i < 50; i++) {
			Random rg = new Random();
			int ettall = rg.nextInt(20)+1;
			tall.add(ettall);
			tall2.add(ettall);
			tall3.add(ettall);
		}


		oppdaterGUI(this.l1,tall.toArray());
		oppdaterGUI(this.l2,tall2.toArray());
		oppdaterGUI(this.l3,tall3.toArray());


	}
}
