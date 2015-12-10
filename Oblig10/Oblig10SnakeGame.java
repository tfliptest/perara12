
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Oblig10SnakeGame extends JFrame implements KeyListener{
	
	
	public Oblig10SnakeElement minSnakeElement	 = new Oblig10SnakeElement();
	
	public Oblig10SnakeGame(){
		this.setVisible(true);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(this);
	}
	
	public void drawStuff(){
		Graphics g = this.getGraphics();
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		minSnakeElement.drawMe(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		drawStuff();
		if(e.getKeyCode()==e.VK_UP){
			System.out.println("Du har tastet oppoverpil");
			minSnakeElement.setY(minSnakeElement.getY()-10);
	
		}
		if(e.getKeyCode()==e.VK_DOWN){
			System.out.println("Du har tastet nedoverpil");
			minSnakeElement.setY(minSnakeElement.getY()+10);
		}

		if(e.getKeyCode()==e.VK_LEFT){
			System.out.println("Du har tastet venstre");
			minSnakeElement.setX(minSnakeElement.getX()-10);
			
		}
		if(e.getKeyCode()==e.VK_RIGHT){
			System.out.println("Du har tastet høyrepil");
			minSnakeElement.setX(minSnakeElement.getX()+10);
		}

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
