package bootle;

public class Bootle {

       private double howManyLiters;
    
//        Bootle() {
//
//}
        
        
        Bootle(double howManyLiters) {
        
            this.howManyLiters = howManyLiters;
        
        }
        
       
        double getHowManyLiters(){
        
        return howManyLiters;
        }
        
        
        // void - nic nie zwracajaca metoda - uniwersalna
        
        
        
        void paste (double howMany)
        {
        
            this.howManyLiters += howMany;
        
        }
        
        boolean pastOut (double howMany) {
        
            if(howMany < howManyLiters)    
        this.howManyLiters -= howMany;
            else 
                return false;
            
            return true;
        }
        
        
        
        void pour (double howMany, Bootle wherePour){
        
           if (this.pastOut(howMany))
           {
            wherePour.paste(howMany);
        
           }
           else
                System.out.println("za mala pojemnosc");
        }
        
        
    public static void main(String[] args) {
        
        Bootle[] bootle = new Bootle[3];
        
        bootle[0] = new Bootle(5);
        bootle[1] = new Bootle(8);
        bootle[2] = new Bootle(10);
    
        bootle[0].paste(4);
        
        bootle[0].pour(9, bootle[1]);
        
        System.out.println(bootle[0].getHowManyLiters());
        System.out.println(bootle[1].getHowManyLiters());
        System.out.println(bootle[2].getHowManyLiters());
    }

    
}
