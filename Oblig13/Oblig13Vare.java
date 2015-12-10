import java.io.Serializable;


public abstract class Oblig13Vare implements Serializable{

	String navn = "";
	int pris = 0;
	
	public Oblig13Vare(String navn,int pris){
		this.navn = navn;
		this.pris = pris;
	}
	
	
	public String toString(){
		return navn + "-" + pris + " NOK";
	}
	

}
