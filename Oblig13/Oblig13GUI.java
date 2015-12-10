import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;




public class Oblig13GUI extends JFrame implements ActionListener{
	JButton leggTilUtstyr;
	JButton selgUtstyr;
	JButton lagre;
	JButton aapne;

	JList skiliste;
	DefaultListModel model;

	public Oblig13GUI(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		model = new DefaultListModel();
		skiliste = new JList(model);
		skiliste.setBounds(20, 20, 800,180);

		leggTilUtstyr = new JButton("Legg til vare");
		selgUtstyr = new JButton("Selg vare");
		lagre = new JButton("Lagre beholdning");
		aapne = new JButton("Åpne beholdning");


		this.add(skiliste);
		this.add(leggTilUtstyr);
		this.add(selgUtstyr);
		this.add(lagre);
		this.add(aapne);



		leggTilUtstyr.setBounds(210, 230, 400, 20);
		leggTilUtstyr.addActionListener(this);

		selgUtstyr.setBounds(210,260,400,20);
		selgUtstyr.addActionListener(this);

		aapne.setBounds(210,290,400,20);
		aapne.addActionListener(this);

		lagre.setBounds(210,320,400,20);
		lagre.addActionListener(this);



		ImageIcon kongen = new ImageIcon("src/ski.jpg");
		JLabel imagelabel = new JLabel(kongen);
		this.add(imagelabel);
		imagelabel.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(leggTilUtstyr)){
			String type = JOptionPane.showInputDialog("Skriv ski eller staver");
			if(type.equals("ski")){
				Oblig13Ski s = new Oblig13Ski();
				model.addElement(s);
			}
			if(type.equals("staver")){
				Oblig13Staver s = new Oblig13Staver();
				model.addElement(s);
			}
			else{
				Oblig13Ski s = new Oblig13Ski();
				model.addElement(s);
			}
			
		}

		if(arg0.getSource().equals(selgUtstyr)){
			model.remove(skiliste.getSelectedIndex());
			
		}
		if(arg0.getSource().equals(lagre)){
			try {
				FileOutputStream  f_out = new FileOutputStream("mindata");
				ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
				obj_out.writeObject(model);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if(arg0.getSource().equals(aapne)){
			try{
				FileInputStream f_in = new FileInputStream("mindata");
				ObjectInputStream obj_in = new ObjectInputStream (f_in);
				model = (DefaultListModel)obj_in.readObject();
				this.skiliste.setModel(model);
			}
			catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
