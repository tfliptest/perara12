
public class Oblig5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game f = new Game(); 
		Character bg = new Character(); 
		bg.setImage("http://188.138.32.138/dat101/filer/background.jpg");
		f.addCharacter(bg, "background");
		
		Character h = new Character(); 
		h.setImage("http://188.138.32.138/dat101/filer/mario.png");
		f.addCharacter(h,"hero");
		h.x=100; 
		h.y=500; 
		h.resize(0.5);
	
		Character p = new Character(); 
		p.setImage("http://188.138.32.138/dat101/filer/princess.jpg");
		f.addCharacter(p, "princess");
		p.resize(0.1);
		p.x=1000; 
		p.y=400; 
	}

}
