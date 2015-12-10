import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;



import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;





//import javax.swing.JOptionPane;




public class Oblig9 extends JFrame implements ActionListener{

	DefaultListModel<Oblig9Brus> brusModel = new DefaultListModel<Oblig9Brus>();
	JButton leggTil = new JButton();
	JButton sok = new JButton();
	JButton bestebrus = new JButton();
	JLabel tekstBesteBrus = new JLabel();

	public Oblig9(){
		this.setVisible(true);
		FlowLayout f = new FlowLayout();
		this.setLayout(f);

				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		leggTil.addActionListener(this);
		
	
		try {
			URL url = new URL("http://1.vgc.no/drpublish/images/article/2014/12/11/23354051/1/fullbredde/2330493.jpg");
			Image image = ImageIO.read(url);
			ImageIcon i = new ImageIcon(image);
			JLabel l = new JLabel(i);
			this.add(l);
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		leggTil.setText("Legg til en ny brus");
		this.add(leggTil);

		sok.setText("Søk");
		this.add(sok);
		sok.addActionListener(this);

		bestebrus.setText("Beste brus");
		this.add(bestebrus);
		bestebrus.addActionListener(this);

		JList brusliste = new JList(brusModel);
		this.add(brusliste);
		
		this.add(tekstBesteBrus);


		
	}

	public void updateBeste(){
		double poengsum = Integer.MIN_VALUE;
		Oblig9Brus b = brusModel.get(0);
		for(int i=0;i<brusModel.getSize();i++){
			Oblig9Brus s = brusModel.get(i);
			if(s.points>poengsum){
				b = s;
				poengsum = s.points;
			}
		}
		tekstBesteBrus.setText("Brusen med mest poeng er "+b);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(leggTil)){
			String merke = JOptionPane.showInputDialog(this,"Hvilket merke?");
			
			double poeng = Double.parseDouble(JOptionPane.showInputDialog(this,"Hvor mange poengsum?"));
	
			
			Oblig9Brus b = new Oblig9Brus();
			b.setBrusmerke(merke);
			b.points = poeng;
			brusModel.addElement(b);
			updateBeste();
		}
		if(arg0.getSource().equals(sok)){
			String soketekst = JOptionPane.showInputDialog(this,"Hva søker du etter?");
			for(int i=0;i<brusModel.getSize();i++){
				Oblig9Brus s = brusModel.get(i);
				if(s.getBrusmerke().equals(soketekst)){
					JOptionPane.showMessageDialog(this,"Poengsummen for"+s.getBrusmerke()+" er:"+s.points);
				}
			}
		}
		if(arg0.getSource().equals(bestebrus)){

			updateBeste();
		}
	}


}

