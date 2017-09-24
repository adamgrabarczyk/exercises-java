package ClassObject;

public class ClassObject {

    public static void main(String[] args) {
        
        Punkt p = new Punkt(4,10);
        
        System.out.println(p.getClass());
        
    }

    
}


        class Punkt {
        
        
            private int x;
            
            private int y;

     Punkt() {
    
    
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    

int getX(){

    return x;
}

int getY () {

return y;
}
    
            
            
        
        }
