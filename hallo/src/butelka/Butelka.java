package butelka;

public class Butelka {
	
	private double ileLitrów;
	
	Butelka(double ileLitrów){
		this.ileLitrów = ileLitrów;
	}
	
	double getIleLitrów() {
		return ileLitrów;
	}
	
	
	void wlej (double ilość){
		this.ileLitrów += ilość;
	}
	
	boolean wylej (double ilość) {
		
		if(ilość < ileLitrów)
		
		this.ileLitrów -= ilość;
		else
			return false;
		return true;
	}
	
	void przelej(double ilość, Butelka gdziePrzelac){
		 
		if(this.wylej(ilość))
		{
		gdziePrzelac.wlej(ilość);
		}
		else
			System.out.println("za mało");
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Butelka[] butelka = new Butelka[3];
		
		butelka[0] = new Butelka(5);
		butelka[1] = new Butelka(8);
		butelka[2] = new Butelka(10);
		
	butelka[0].wlej(3);
	butelka[0].przelej(2, butelka[1]);
	
	System.out.println(butelka[1].getIleLitrów());
		
		System.out.println(butelka[0].getIleLitrów());
		
	}

}
