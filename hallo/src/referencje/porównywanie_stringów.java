package referencje;

public class porównywanie_stringów {
	public static void main(String[] args) {
		
		String imie = "adam";
		String imie2 = "adam";
		
//		if(imie == imie2) - mało optymalny i dobry sposób
		
		if(imie.equals(imie2)) //sprawdza równiez adresy
			System.out.println("takie same");
		else
			System.out.println("nie takie same");
		
		
	}
}
