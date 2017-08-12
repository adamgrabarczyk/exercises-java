
public class funkcje {

	public static void main(String[] args) {
		
		
		test a = new test();
		
		a.wypisz("Arek", "Włodarczyk");
		
		
test a2 = new test();
		
		a2.wypisz("Wiola", "Włodarczyk");
		
		int wynik = a.dodaj(10, 20);
		
		System.out.println(wynik);
	}
	
}

class test {
	
	void wypisz(String imie, String nazwisko) {
		
		System.out.println("imie: " + imie);
		System.out.println("Nazwisko: " + nazwisko);
		System.out.println();
	}
	
	
	int dodaj(int a, int b) {
		return a + b ;
	}
	
}
