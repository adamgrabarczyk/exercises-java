
public class Methods {
    
      public static void main(String[] args) {
      
     

          
 

test a = new test();

a.print("Arek","Glizdogon");

test a2 = new test();

a2.print("Seba","Glizdogon");

int wynik = a.add(10, 20);


System.out.println(wynik);
      }
    
     
}


class test {

    void print (String name, String surname){
   
System.out.println("name: "+name + " " +"surname: "+ surname);
}
   
    int add(int a, int b){
    
    return a + b;
    }
    
}
 
     