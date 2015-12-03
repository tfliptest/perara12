import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class Oblig10 extends JFrame implements ActionListener {
	DefaultListModel<Oblig10Brus> brusModell = new DefaultListModel<Oblig10Brus>();
	public Oblig10(){
	
	this.setSize(1000,1000);
	
	this.setLayout(new BorderLayout());
	
	JButton brus = new JButton("Legg til ny brus");
	this.add(brus, BorderLayout.SOUTH);
	JList <Oblig10Brus> br = new JList<Oblig10Brus>(brusModell);
	this.add(br, BorderLayout.CENTER);
	
	JLabel i = new JLabel (new ImageIcon("src/soda_pic.jpg"));
	this.add(i, BorderLayout.WEST);
	
	brus.addActionListener(this);
	
	this.setVisible(true);
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Oblig10Brus b = new Oblig10Brus();
		String navn = JOptionPane.showInputDialog(null,"Legg til brus");
		String poeng = JOptionPane.showInputDialog(null, "Gi en poengsum");
		
		double Poeng = Double.parseDouble(poeng);
		b.setBrusmerke(navn);
		b.setPoengsum(Poeng);
		
		brusModell.addElement(b);
	}
	
}
