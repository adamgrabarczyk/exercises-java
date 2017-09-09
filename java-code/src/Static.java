
public class Static {
    
    int blala;
    
     public static void main(String[] args) {
     
        
//       mathematic test = new mathematic();
       
       double wynik = mathematic.add(5,8);
      
       System.out.println(wynik);
       
       System.out.println(mathematic.PI);
     
     
     
     
     
     Client a = new Client("Arek");
     Client b = new Client("Damian");
     Client c = new Client("Prek");
Client d = new Client("Czesiek");     
     
System.out.println(c.id);

     }
    
}


class mathematic {

    
   static final double PI = 3.14;
    
static double add(double a, double b) {

    return a + b;
}    
    
}

class Client {

    Client(String imie){
    this.imie = imie;
        nextId++;
        
    id = nextId;
    }
    
    String imie;

int id = 0;

static int nextId = 0;
}