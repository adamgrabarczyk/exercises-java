
public class objekty {
	
	
public static void main(String[] args) {
		
	

 

pkt P = new pkt(10, 15);

pkt P2 = new pkt(40, 50);
	


System.out.println("p.x " + P.x);
System.out.println("p.y " + P.y);


System.out.println("p2.x " + P2.x);
System.out.println("p2.y " + P2.y);
		}
	
}


class pkt {
	
	pkt(){
		System.out.println("wywołano domyślny konstruktor");
	}
	
		pkt(int pierwszy, int drugi)
	{
			System.out.println("wywołano konstruktor z 2 parametrami");
			
			this.x = pierwszy;
			this.y = drugi;
	}
	
	int x;
	
	int y;
	
}