

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
            
            
            
            
            
            
             /*
           
            0 - false 1 - true
            OPERATORY BITOWE
            & - iloczyn bitowy
            | - suma bitowa
            ^ - XOR eXclusive OR (ALBO)
            x << 1 - przesunięce w lewo o 1
            x >> 2 - przesunięcie w prawo o 2
        
            ~negacja bitowa
        
            1 2 6 = 1 * 10 ^ 2 + 2 * 10 ^ 1 + 6 * 10 ^ 0
        
            1 0 1 0 = 2 ^ 3 + 2 ^ 1 = 8 + 2 = 10
            
        
            1 1 - 0
            0 0 - 0
            1 0 - 1
            0 1 - 1
            
            1 0 1 0 // 10        
            1 0 1 1 // 11
        
            --------
            0 0 0 1 // 1
        
        
            1 0 1 0
            0 1 0 1
        
        
            0 0 0 1 - posta na forum
            0 0 1 0 - edytuj na forum
            0 1 0 0 - usun posta
            1 0 0 0 - ban
        
            1 1 1 1 // 15
        
            
            00 0 00 0 0 0 00    0 1 0 
                                0 2 0  = 2 
            
        */
            
            System.out.println(~10);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
          
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
    
    
}
