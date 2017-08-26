

public class Constructors {
    
    public static void main(String[] args) {
    
       
    
        
        Point p;
        
        p = new Point(10, 5);
        
        p.x = 5;
        p.y =20;
        
        System.out.println("p.x:"+p.x);
        System.out.println("p.y:"+p.y);
        
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

        System.out.println("wywołano konstruktor domyśłny z dwoma parametrami");
    }
    
    
    int x;   
    int y;
    
}