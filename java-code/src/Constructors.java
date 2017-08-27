

public class Constructors {
    
    public static void main(String[] args) {
    
       
    
        
        Point p = new Point(10, 5);
        
        Point p2 = new Point(100, 500);
        
//        p.x = 5;
//        p.y =20;
//        

        System.out.println("p.x:"+p.x);
        System.out.println("p.y:"+p.y);
        
        
        System.out.println("p2.x:"+p2.x);
        System.out.println("p2.y:"+p2.y);
        
        
        
        
    }
    
    
    
}



class Point {

    Point() {
System.out.println("wywołano konstruktor domyśłny");
//
//    x = 20;  domyslne wartosci
//    y = 20;
    
    }
    
    Point(int one, int two){

        System.out.println("wywołano konstruktor z dwoma parametrami");

this.x = one;

this.y = two;

    }
    
    
    int x;   
    int y;
    
}