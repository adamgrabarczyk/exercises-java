package reference;

public class reference {

    public static void main(String[] args) {
        
        int a = 53;
        
        int b = a;
        
        b = 30;
        
        System.out.println(a);
        
        Test z = new Test(); // z to adres/sciezka do zmiennej
        
        Test y = z;
        
        y.a = 40;
        
        System.out.println(z.a);
    
    
    String name = "Arkadiusz";
    
    String name2 = name;
    
    name2 = "siaiala";
    
    
        System.out.println(name2);
    
    }
    
}


class Test {

    
    int a = 20;
}