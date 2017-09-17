/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie.monsters;

/**
 *
 * @author adam
 */
public abstract class Monster {
    
    protected double predkoscChodzenia = 10;
    
   protected double zywotnosc;
     
   public void atakuj(){
    
        System.out.println("to jest metoda atakuj z klasy potwor");
    }
   
   
   
  abstract protected void description (); //abstrakcyjna metoda nie moze mieć ciała
   // naklada wymogi na klasy ktore dziedzicza metode abstakcuyjna
  
  /* tworzac jakas klase wiesz ze jakas metoda jest niezbedna do dzialania tej klasy i 
  nakladasz wymogi które są niezbedna do działania tej klasy
   
*/


   public Monster() {
   
       System.out.println("Domyśłny konstruktor z klasy monster");
       
   }
   
   
   
   public Monster(double redkoscChodzenia, double zywotnosc) {
   
       this.predkoscChodzenia = redkoscChodzenia;
       
       this.zywotnosc = zywotnosc;
   
   System.out.println("nie domyśłny konstruktor z klasy monster");
       
   }
   
   
   
   
}
