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
public class Monster {
    
    public double predkoscChodzenia = 10;
    
   public double zywotnosc;
    
   public void atakuj(){
    
        System.out.println("to jest metoda atakuj z klasy potwor");
    }
   
   
   
   public Monster() {
   
       System.out.println("Domyśłny konstruktor z klasy monster");
       
   }
   
   
   
   public Monster(double redkoscChodzenia, double zywotnosc) {
   
       this.predkoscChodzenia = redkoscChodzenia;
       
       this.zywotnosc = zywotnosc;
   
   System.out.println("nie domyśłny konstruktor z klasy monster");
       
   }
   
   
   
   
}
