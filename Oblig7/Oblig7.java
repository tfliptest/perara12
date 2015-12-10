import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Oblig7 extends JFrame{

	public ArrayList<Point> punkter = new ArrayList<Point>();
	
	public Oblig7()
	{
		Point p1 = new Point(100,100);
		this.punkter.add(p1);
		
		Point p2 = new Point(300,250);
		this.punkter.add(p2);
		
		Point p3 = new Point(62,71);
		this.punkter.add(p3);
		
		Point p4 = new Point(24,32);
		this.punkter.add(p4);
		
		Point p5 = new Point(88,63);
		this.punkter.add(p5);
		
		
		this.setVisible(true);
		this.setSize(700, 500);
		
		for(int i=0;i<100;i++)
		{
			Random rgx = new Random();
			int tallx = rgx.nextInt(1000);
		
			Random rgy = new Random();
			int tally = rgy.nextInt(1000);
		
			punkter.add(new Point(tallx, tally));
		}
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		for(int i=0;i<100;i++)
		{	
			Point etpunkt = this.punkter.get(i);
			g.fillOval(etpunkt.x,etpunkt.y,20,20);
			g.fillOval(etpunkt.x-30,etpunkt.y-30,20,20);
		}
	}
}