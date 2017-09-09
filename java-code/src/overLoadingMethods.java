
public class overLoadingMethods {
    
      public static void main(String[] args) {
      
     

          
 

test a = new test();

a.print("Arek","Glizdogon");

test a2 = new test();

a2.print("Seba","Glizdogon");

int wynik = a.add(10, 20);

double wynik2 = a.division(5, 7);

System.out.println(wynik);

System.out.println(wynik2);
      }
    
     
}


class test {

    void print (String name, String surname){
   
System.out.println("name: "+name);
System.out.println("surname: "+ surname);
}
   
    int add(int a, int b){
    
    return a + b;
    }
    
    double division (double a, double b){
    
        if (b == 0)
            return 0;
        System.out.println("division");
        return a/b ;
    }
    
    
    
}
 
     