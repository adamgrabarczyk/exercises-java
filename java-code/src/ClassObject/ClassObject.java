package ClassObject;

public class ClassObject {

    public static void main(String[] args) {
        
        
        Object a = new Punkt(4,50);
        
        
        Punkt p = new Punkt(4,10);
        
//        System.out.println(p.getClass());
        
Punkt p2 = new Punkt(4,10);

//p.equals(p2);

if (p.equals(p2)) {
    System.out.println("są sobie rowne");
}

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
    
            @Override
            public boolean equals(Object o) {

                
               Punkt przyslany = (Punkt)o;          //rzutowanie  po prawej stronei rownania ;)
                
               
               
    return this.x == przyslany.x && this.y == przyslany.y;

};
            
            
        
        }
