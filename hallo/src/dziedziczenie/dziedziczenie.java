package dziedziczenie;

import dziedziczenie.potowory.Potwor;
import dziedziczenie.potowory.Szkielet;
import dziedziczenie.potowory.Zombie;



public class dziedziczenie {


	
	
	public static void main(String[] args){
		
	Potwor p = new Potwor(10, 100);
	
	System.out.println(p.zywotnosc);

	
	Szkielet s = new Szkielet(20, 50);
	System.out.println(s.szybkoscChodzenia);
	
	Zombie z = new Zombie();
	
	
	
	}
	
}
