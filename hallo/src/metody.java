
public class metody {

	public static void main(String[] args) {
		
		
		double wynik = matematyka.dodaj(10, 15); 
				
				
				System.out.println(wynik);
	
				System.out.println(matematyka.PI);
				
				
				Klient a = new Klient("Arek");
				Klient b = new Klient("Wiola");
				Klient c = new Klient("Mati");
				
				System.out.println(a.imie);
				System.out.println(b.imie);
				System.out.println(c.imie);
				
				System.out.println(a.id);
				System.out.println(b.id);
				System.out.println(c.id);
				
				System.out.println(Klient.nastepneId);
				System.out.println(Klient.nastepneId);
				
				
				
	}
	
	
	
}


class matematyka {
	
	  static final double PI = 3.14;
	
	static double dodaj(double a , double b) {
		
		return a + b;
	}
	
	
}


class Klient {
	
Klient(String imie) {
	
	this.imie = imie;
	
	
	id = nastepneId;
	
	nastepneId++;
}	
	
	
	 String imie;
	 int id = 0;
	 
	 static int nastepneId = 1; 
	 
}














