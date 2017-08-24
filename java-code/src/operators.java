

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
public class operators {
    
    public static void main(String[] args) {
        /*
          OPERATOR - to znaki służące do operowania na zmiennych
          
           OPERATORY ARYTMETYCZNE
               +   dodawanie liczb oraz łączenie string'ów
               -   odejmowanie
               *   mnożenie
               /   dzielenie
        
               =   przypisanie wartości
               +=  
               -=
               /=
               *=
               %=        
               
               %   reszta z dzielenia (dzielenie modulo)
               

               ++   inkrementacja - powiększ o 1
               --   dekrementacja - zmniejsz o 1
               
               y++ - POST INKREMENTACJA
               y-- - POST dekrementacja
               
               ++y - PRE INKREMENTACJA
               --y - PRE dekrementacja               
           
         */
        
        int a = 5;
        
         // a += 1;
        
        System.out.println(a--);
        System.out.println(a);
        
        
        
        
         /*
            OPERATOR RELACYJNY (PORÓWNANIA)
            
            == - porównanie
            != - porównanie czy są różne od siebie
            > - większe od
            < - mniejsze od
            >= - większe bądź równe
            <= - mniejsze bądź rowne
        */
        int z = 5,
            b = 7;
       
        System.out.println(z > b);
        
        
        
        
        
        
        /*
            Operatory Logiczne 
        
            true false
        
            ! - negacji
        
            !(true) - false
            !(false) - true
        
            && - koniunkcja - "I" - W TYM SAMYM MOMENCIE
        
            true true - true
            true false - false
            false true - false
            false false - false
        
            KONIUNKCJA JEST PRAWDZIWA WTEDY I TYLKO WTEDY GDY OBA WYRAZENIA SA PRAWDZIWE
        
            || - alternatywa - "lub" - to lub też to
        
            true true - true
            true false - true
            false true - true
            false false - false
            
            ALTERNATYWA JEST FAŁSZYWA TYLKO GDY  OBA WYRAZENIA SA FALSZYWE
        
        */
        
        int ala = 5,
            bala = 6,
            c = 7;
       
        if (ala != bala || c > 12){        
            System.out.println("tak");
        }
          
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
    
    
}
