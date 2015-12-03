import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;


public class Oblig7 extends JFrame{
	ArrayList<Point> punkter = new ArrayList<Point>();
	public Oblig7(){
	
	this.setVisible(true);
	this.setSize(1000,1000);
	
	Point p = new Point(100,100);
	punkter.add(p);
	Point p1 = new Point(200,200);
	punkter.add(p1);
	Point p2 = new Point(300,300);
	punkter.add(p2);
	Point p3 = new Point(400,400);
	punkter.add(p3);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.fillOval(500,500,50,50);
			
		for (int i=0;i<punkter.size();i++){
			Point alle = punkter.get(i);
			Point p4 = punkter.get(3);
			int x4 = p4.x;
			int	y4 = p4.y;
			int x = alle.x;
			int y = alle.y;
			g.fillOval(x,y,25,25);
			g.drawLine(x, y, x4, y4);
		}
		}
		
	}



