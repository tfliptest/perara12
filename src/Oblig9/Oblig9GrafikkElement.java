import java.awt.Color;
import java.awt.Graphics;


public class Oblig9GrafikkElement {
	
	public int x;
	public int y;
	public int width;
	public int height;
	public Color farge = Color.red;
	
	public void drawMe(Graphics g){
		g.setColor(farge);
		g.fillRect(x, y, width, height);
	}
	
}
