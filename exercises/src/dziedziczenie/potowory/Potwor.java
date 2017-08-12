package dziedziczenie.potowory;

public class Potwor {

	public double szybkoscChodzenia = 10;
	
	public double zywotnosc;
	
	public void atakuj() {
		
		System.out.println("to jest metoda atakuj z klasy potór");
	}
	
	public Potwor() {
		
	} 
	
	
	public Potwor(double szybkoscChodzenia, double zywotnosc){
	
	this.szybkoscChodzenia = szybkoscChodzenia;
	this.zywotnosc = zywotnosc;
	
	System.out.println("domyslny konsturktor z klasy potwor");
	}
}
