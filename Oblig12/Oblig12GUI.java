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


public class Oblig12GUI extends JFrame implements ActionListener{
	public ArrayList<JTextField> sudokubrett = new ArrayList<JTextField>();
	public JMenuItem slettspill = new JMenuItem("Slett Spill");
	public JMenuItem nyttspill = new JMenuItem("Nytt Spill");
	public JMenuItem loes = new JMenuItem("Løs Sudoku");
	public JMenuItem sjekkomrett = new JMenuItem("Sjekk om er rett");

	public Oblig12GUI(){
		this.setVisible(true);
		this.setLayout(new GridLayout(9,9));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				JTextField f = new JTextField();
				this.add(f);
				sudokubrett.add(f);
			}
		}

		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu fil = new JMenu("fil");
		menuBar.add(fil);

		fil.add(nyttspill);
		nyttspill.addActionListener(this);


		fil.add(slettspill);
		slettspill.addActionListener(this);

		fil.add(sjekkomrett);
		sjekkomrett.addActionListener(this);

		fil.add(loes);
		loes.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(slettspill)){
			for (JTextField felt:sudokubrett) {
				felt.setText("");
			}
		}
		if(arg0.getSource().equals(nyttspill)){
			for (JTextField felt:sudokubrett) {
				felt.setText("");
				Random rg = new Random();
				if(rg.nextBoolean()==true){
					felt.setText(""+(rg.nextInt(9)+1));
				}
			}
		}

	}

}
