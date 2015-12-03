import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


public class Oblig12GUI extends JFrame implements ActionListener {

	ArrayList<JTextField> sudokubrett = new ArrayList<JTextField>();
	final int BREDDE_I_BOKSTAVER = 9;
	final int HOYDE_I_BOKSTAVER = 9;

	JMenuBar menuBar = new JMenuBar();
	JMenu fil = new JMenu("Fil");
	JMenuItem nyttspill = new JMenuItem("Nytt spill");
	JMenuItem slett = new JMenuItem("Slett");


	public Oblig12GUI(){
		GridLayout g = new GridLayout(BREDDE_I_BOKSTAVER,HOYDE_I_BOKSTAVER);
		this.setLayout(g);
		this.setSize(500,500);
		this.setTitle("SUDOKU");

		for(int i=0;i<BREDDE_I_BOKSTAVER;i++){
			for(int j=0;j<HOYDE_I_BOKSTAVER;j++){
				JTextField J = new JTextField();
				this.add(J);
				sudokubrett.add(J);
			}}
		this.setJMenuBar(menuBar);
		menuBar.add(fil);
		fil.add(nyttspill);
		fil.add(slett);
		fil.addActionListener(this);
		nyttspill.addActionListener(this);
		slett.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public void slettAlt(){
		for(JTextField felt:this.sudokubrett){
			felt.setText("");   
			
		}
	}

	public void nyttspill(){
		for(JTextField felt:this.sudokubrett){
			felt.setText("");}
		Random rg = new Random();
		for(JTextField felt1:sudokubrett){
			int tall = rg.nextInt(9)+1;
			if(rg.nextInt(2)==0){
			felt1.setText(String.valueOf(tall));
		}
	}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(nyttspill)){
			nyttspill();
		}
		if(e.getSource().equals(slett)){
			slettAlt(); 
		}
	}
}







