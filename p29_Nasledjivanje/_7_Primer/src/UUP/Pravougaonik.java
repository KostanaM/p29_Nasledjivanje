package UUP;

public class Pravougaonik extends Oblik { 
	
	double duzina; 
	double sirina; 
	
	public Pravougaonik(double duzina, double sirina) { 
		this.duzina=duzina; 
		this.sirina= sirina; 
		} 
	
	public double uzmiPovrsinu() {
		povrsina = duzina* sirina;
		return povrsina;
		
	}
	
}

