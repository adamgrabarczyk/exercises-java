package enkapsulacja;

public class enakpsulacja {
	
	public static void main(String[] args) {
		
		kontoBankowe oszczednosciowe = new kontoBankowe();
		
		oszczednosciowe.wplac(5000);
		
		if(oszczednosciowe.wyplaty(15556))
		{
			System.out.println("wypłacono");
		}
		else 
			System.out.println("za mało kasy");
		
		
		
		
		System.out.println(oszczednosciowe.getSaldo());
		
	}

}


class kontoBankowe {
	
	public kontoBankowe() {
		saldo = 100;
	}
	
 private	int saldo;
	
 int getSaldo() {
	 
	 return saldo;
 }
 private boolean setSaldo(int saldo) {
		
		this.saldo = saldo;
	return true;	
 }
 
 boolean wyplaty (int ile) {
	
	 	 
	 if (saldo < ile)
		 return false;
	 
	 else
//		 saldo -= ile;  (mało dynamiczne wyjście)
		 
		 setSaldo(saldo - ile);
		 
		 return true;
		 
		 
 }
 
 boolean wplac(int ile) {
	 
	 setSaldo(saldo + ile);
	 return true;
	 
 }
 
}


