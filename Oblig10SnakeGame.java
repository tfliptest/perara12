import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Oblig10SnakeGame extends JFrame implements KeyListener{
	
	public Oblig10SnakeElement se = new Oblig10SnakeElement(); 
	
	public Oblig10SnakeGame(){
		FlowLayout f = new FlowLayout(); 
		this.setLayout(f);
		this.setSize(400, 400);
		this.setTitle("Celines snake");
		this.addKeyListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void drawStuff(){
		Graphics g = this.getGraphics(); 
		g.clearRect(0, 0, getWidth(), getHeight());
		this.se.drawMe(g);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		drawStuff(); 
		if(e.getKeyCode()==KeyEvent.VK_UP){
			System.out.println("Du har trykket opp"); 
			this.se.setY(this.se.getY()-5);
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN){ 
			System.out.println("Du har trykket ned");
			this.se.setY(this.se.getY()+5);
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			System.out.println("Du har trykket venstre");
			this.se.setX(this.se.getX()-5);
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			System.out.println("Du har trykket høyre");
			this.se.setX(this.se.getX()+5);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
