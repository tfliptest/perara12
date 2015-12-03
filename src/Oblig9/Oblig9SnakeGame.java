import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Oblig9SnakeGame extends JFrame implements KeyListener{
	
	Oblig9SnakeElement se = new Oblig9SnakeElement();
	
	JLabel tekst = new JLabel();
	public Oblig9SnakeGame(){
	this.setTitle("Snake");
	this.setVisible(true);
	this.addKeyListener(this);
	this.add(tekst);
	this.setSize(1000,1000);

	}
	
	public void drawStuff(){
		Graphics g = this.getGraphics();
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.se.drawMe(g);
		
	}
	
	/*public void actionPerformed(ActionEvent e){
		b.y = b.y +1;
		this.tegnAlt();
		if(b.y>this.getHeight()) {
			b.y=0
		}
		}
		*/
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP){
			//tekst.setText("Du trykket opp");
			System.out.println("Du trykket opp");
			se.y-=100;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			//tekst.setText("Du trykket ned");
			System.out.println("Du trykket ned");
			se.y+=100;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			//tekst.setText("Du trykket til høyre");
			System.out.println("Du trykket til høyre");
			se.x+=100;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			//tekst.setText("Du trykket til venstre");
			System.out.println("Du trykket til venstre");
			se.x-=100;
		}
		this.drawStuff();
	}

	//@Override
	//public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	

	
}
