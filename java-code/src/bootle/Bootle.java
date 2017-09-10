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
        
        void pastOut (double howMany) {
        
        this.howManyLiters += howMany;
        }
        
        
        
        
        
        
    public static void main(String[] args) {
        
        Bootle[] bootle = new Bootle[3];
        
        bootle[0] = new Bootle(5);
        bootle[1] = new Bootle(8);
        bootle[2] = new Bootle(10);
    
        bootle[0].paste(5);
        
        
        System.out.println(bootle[0].getHowManyLiters());
        System.out.println(bootle[1].getHowManyLiters());
        System.out.println(bootle[2].getHowManyLiters());
    }

    
}
