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
public class Szkieletor extends Monster{
    
    public Szkieletor() {
    
        System.out.println("Domyśłny konstruktor z klasy SZKIELETOR");
    
    }
    
    
    public Szkieletor(double predkoscChodzenia, double zywotnosc) {
    
        super(predkoscChodzenia, zywotnosc);
        
        System.out.println("nie domyśłny konstruktor z klasy SZKIELETOR");
        
        
    
    }
    
}
