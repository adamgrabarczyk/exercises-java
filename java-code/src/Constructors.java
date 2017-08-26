

public class Constructors {
    
    public static void main(String[] args) {
    
        new Point();
    
        
        Point p;
        
        p = new Point();
        
        p.x = 5;
        p.y =20;
        
        System.out.println("p.x:"+p.x);
        System.out.println("p.y:"+p.y);
        
    }
    
    
    
}



class Point {

    Point() {
System.out.println("wywołano konstruktor domyśłny");
}
    
    int x;   
    int y;
    
}