
package dziedziczenie;

import dziedziczenie.monsters.Monster;
import dziedziczenie.monsters.Szkieletor;
import dziedziczenie.monsters.Zombiak;

public class dziedziczenie {

    public static void main(String[] args) {
        
        Monster p = new Szkieletor(10, 100);
        Monster p2 = new Zombiak();
        
        p.atakuj();
        
//        System.out.println(p.predkoscChodzenia);
//        
//       Szkieletor s = new Szkieletor(20, 40, "Łuk");
//       s.atakuj();
//       
//       
//        System.out.println(s.predkoscChodzenia);
//       
//       
//       Zombiak z = new Zombiak();
//       
       
       // polimorfizm - przy pomocy jednej nazwy odwołać się do wielu nazw jednocześnie .
       //mozna przypisac klase-rodzic do kalsy-dziecko
    }
    
    
    void method(Monster monster) {
    
    
    
    }
    
    
}
