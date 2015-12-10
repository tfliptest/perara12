import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;


public class Oblig7 extends JFrame{
	public ArrayList<Point> punkter = new ArrayList<Point>();
	public Oblig7(){
		Random rg = new Random();
		for (int i = 0; i < 100; i++) {
			Point p = new Point(rg.nextInt(1000),rg.nextInt(1000));
			this.punkter.add(p);
		}


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.setSize(1000, 1000);

	}

	public void paint(Graphics g){
		super.paint(g);
		for (int i = 0; i < punkter.size(); i++) {
			Point p = punkter.get(i);
			g.fillOval(p.x, p.y, 10, 10);
		}
		g.setColor(Color.RED);
		for (int i = 0; i < punkter.size(); i++) {
			Point p = punkter.get(i);
			g.fillOval(p.x-10, p.y, 10, 10);
		}
	}

}

