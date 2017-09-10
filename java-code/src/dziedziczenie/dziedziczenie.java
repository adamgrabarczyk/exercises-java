
package dziedziczenie;

import dziedziczenie.monsters.Monster;
import dziedziczenie.monsters.Szkieletor;
import dziedziczenie.monsters.Zombiak;

public class dziedziczenie {

    public static void main(String[] args) {
        
        Monster p = new Monster(10, 100);
        
        System.out.println(p.predkoscChodzenia);
        
       Szkieletor s = new Szkieletor(20, 40);
        
        System.out.println(s.predkoscChodzenia);
       
       
       Zombiak z = new Zombiak();
       
       
       
    }
    
}
