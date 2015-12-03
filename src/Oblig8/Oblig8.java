import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Oblig8 extends JFrame implements ActionListener {
	JFrame frame;
	final JButton knapp = new JButton();
	final JButton knapp1 = new JButton();
		public Oblig8(){
			frame = new JFrame("Stein, saks, papir");
			FlowLayout f = new FlowLayout();
			this.setLayout(f);
			
			knapp.setText("Spiller 1");
			this.add(knapp);
			this.setVisible(true);
			knapp.addActionListener(this); 
			
			
			knapp1.setText("Spiller 2");
			this.add(knapp1);
			this.setVisible(true);
			
			this.setSize(1000,1000);
			
			GridLayout g = new GridLayout();
			this.setLayout(g);
			
			knapp.addActionListener(this);
			knapp1.addActionListener(this);
			}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object[] button = {"Stein","Saks","Papir"};
			Object[] button1 = {"Stein","Saks","Papir"};
			
			if (e.getSource().equals(knapp)){
			int svar = JOptionPane.showOptionDialog(frame,"Stein Saks Papir","Spiller 1",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,button,button[2]);
			JOptionPane.showMessageDialog(null,"Du valgte " + svar);
			System.out.println(svar);
			}
			
			if (e.getSource().equals(knapp1)){
			int svar1 = JOptionPane.showOptionDialog(frame,"Stein Saks Papir","Spiller 2",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,button1,button1[2]);
			JOptionPane.showMessageDialog(null,"Du valgte " + svar1);
			System.out.println(svar1);
		}
			
			
		}
		}


