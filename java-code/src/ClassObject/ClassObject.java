package ClassObject;

public class ClassObject {

    public static void main(String[] args) {
        
        
        Object[] punkty = new Punkt[4];
        
        
        punkty[0] = new Punkt(2,8);
                punkty[1] = new Punkt(7,9);
                        punkty[2] = new Punkt(4,3);
                                punkty[3] = new Punkt(1,9);
                                        
        
//        Punkt p = new Punkt(4,10);
        
//        System.out.println(p.getClass());
        
//Punkt p2 = new Punkt(4,10);

//p.equals(p2);

//if (p.equals(p)) {
//    System.out.println("są sobie rowne");
//}

for(int i = 0; i < punkty.length; i++)
{
    System.out.println(punkty[i]);
}
//        System.out.println(p);



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

                
                if(o == null)
                return false;
              
                if(this == o)
                return true;
                
                if(this.getClass() != o.getClass())
                return false;
                    
               Punkt przyslany = (Punkt)o;          //rzutowanie  po prawej stronei rownania ;)
                
               
               
    return this.x == przyslany.x && this.y == przyslany.y;

};
            
            
        
        }
