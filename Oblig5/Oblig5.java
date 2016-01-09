
public class Oblig5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		Character bg = new Character();
		bg.setImage("http://mortengoodwin.net/mario/background.jpg");
		g.addCharacter(bg, "background");
		
		
		Character mario = new Character();
		mario.setImage("http://mortengoodwin.net/mario/mario.jpg");
		g.addCharacter(mario, "hero");
		
		mario.y = 500;
		mario.resize(0.5);
		
		Character prinsesse = new Character();
		prinsesse.setImage("http://mortengoodwin.net/mario/princess.jpg");
		g.addCharacter(prinsesse, "princess");
		prinsesse.resize(0.1);
		prinsesse.y = 500;
		prinsesse.x = 1000;

		
	}

}
