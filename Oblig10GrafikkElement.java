import java.awt.Color;
import java.awt.Graphics;

public class Oblig10GrafikkElement {
	private int x=50; 
	private int y=50; 
	private int bredde= 20; 
	private int hoyde = 20; 
	private Color farge = Color.BLACK; 
	
	public void drawMe(Graphics g){
		g.setColor(this.farge);
		g.fillRect(this.x, this.y, this.bredde, this.hoyde);
		}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getBredde() {
		return bredde;
	}

	public void setBredde(int bredde) {
		this.bredde = bredde;
	}

	public int getHoyde() {
		return hoyde;
	}

	public void setHoyde(int hoyde) {
		this.hoyde = hoyde;
	}

	public Color getFarge() {
		return farge;
	}

	public void setFarge(Color farge) {
		this.farge = farge;
	}
}
