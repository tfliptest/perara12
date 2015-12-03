
public class Oblig5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game f = new Game();
		Character bg = new Character();
		bg.setImage("http://mortengoodwin.net/mario/background.jpg");
		f.addCharacter(bg, "background");
		
		Character hero = new Character();
		hero.setImage("http://mortengoodwin.net/mario/mario.jpg");
		f.addCharacter(hero,"hero");
		hero.y = 900;
		hero.resize(0.7);
		
		Character p = new Character();
		f.addCharacter(p,"princess");
		p.setImage("http://www.officialpsds.com/images/thumbs/Marilyn-Monroe-psd14676.png");
		p.y = 800;
		p.x = 3300;

}}
