package UUP;

public class Krug extends Oblik {
	
	double poluprecnik;

	public Krug(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
	
	public double uzmiPovrsinu() { 
		povrsina = Math.PI *  poluprecnik *  poluprecnik;
			return povrsina; 
		} 
	
}
