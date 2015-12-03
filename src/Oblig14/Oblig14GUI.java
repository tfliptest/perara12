import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;


public class Oblig14GUI extends JFrame implements ActionListener{
	
	JList listen = new JList();
	ArrayList<Integer> a = new ArrayList<Integer>();
	HashSet<Integer> h = new HashSet<Integer>();
	TreeSet<Integer> t = new TreeSet<Integer>();
	JButton knapp = new JButton("Generate");
	JList list1 = new JList();
	JList list2 = new JList();
	
	public Oblig14GUI(){
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(10,10,200,200);
		this.setSize(500,500);
		this.add(knapp);
		this.add(listen);
		this.add(list1);
		this.add(list2);
		knapp.addActionListener(this);
		this.setVisible(true);
		
	
		}
	
	public void oppdaterGUI(JList enliste, Object[] data){
		DefaultListModel m = new DefaultListModel();
		for(Object s: data){
				m.addElement(s);
		}
			enliste.setModel(m);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		lotto();
		oppdaterGUI(listen, a.toArray());
		oppdaterGUI(list1, h.toArray());
		oppdaterGUI(list2, t.toArray());
	}
	
	public void lotto(){
		Random r = new Random();
		a.clear();
		t.clear();
		h.clear();
		for(int i=0;i<10;i++){
			int l = r.nextInt(20)+1;
			a.add(l);
			h.add(l);
			t.add(l);
		}
	}
}
