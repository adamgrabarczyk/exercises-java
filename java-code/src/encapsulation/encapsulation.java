package encapsulation;

public class encapsulation {

    public static void main(String[] args) {
        
        // eNKAPSULACJA - PAKOWANIE WŁAŚCIWOŚCI W TAKI SPOSÓB ABY NIE BYŁO DO NICH BEZPOŚREDNIEGO
        // DOSTĘPU Z ZEWNĄTRZ (Z INNYCH KLAS)
    
    
    
    acountBank savings = new acountBank();
    
//    savings.saldo = 100000;
    
savings.payment(200);
 
        System.out.println(savings.getSaldo());
    
    }
    
}

class acountBank {

    public acountBank() {
    
        saldo = 1000;
    }
    
    
private int saldo; // private to modyfikator - modyfikuje poziom dostepu
    
int getSaldo(){              // getter!

    return saldo;
            }             


boolean setSaldo(int saldo){             // setter!

    
   /* 
    
Conditionals
*/   
    this.saldo = saldo;              // this uzywamy zeby wiedzial czy chodzi nam o parametr czy aktualna wartosc
    return true;
    
}



boolean payment(int howMany) {

    if(saldo < howMany)
        return false;
    else
        
        setSaldo(saldo - howMany);
//        saldo -= howMany;
return true;
    
}



}


