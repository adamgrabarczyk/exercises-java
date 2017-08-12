package dziedziczenie.potowory;

public class Szkielet extends Potwor{
	
	
	public Szkielet()
	{
		System.out.println("domyslny konstruktor z klasy szkielet");
	}

	 	public Szkielet(double szybkoscChodzenia, double zywotnosc){
	 	
	 		
	 		super(szybkoscChodzenia, zywotnosc);
	 		
	 		System.out.println("NIEdomyslny konstruktor z klasy szkielet");
	 	}
		
		
}
