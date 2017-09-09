
public class Static {
    
     public static void main(String[] args) {
     
        
//       mathematic test = new mathematic();
       
       double wynik = mathematic.add(5,8);
      
       System.out.println(wynik);
       
       System.out.println(mathematic.PI);
     
     }
    
}


class mathematic {

    
   static final double PI = 3.14;
    
static double add(double a, double b) {

    return a + b;
}    
    
}

