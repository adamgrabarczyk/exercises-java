/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
public class Conditionals {
    
     public static void main(String[] args) {
     
      /* 
          true false
          INSTRUKCJE WARUNKOWE
            
            if (WYRAŻENIE)
                instrukcja;
            else
                instrukcja;
        */
        int a = 2,
            b = 5;
        
       if (a > b)
            System.out.println("a > b");
       else if (a < b)
       {
            System.out.println("a < b");  
            System.out.println("tak to działa");
       }
       else
       {
            System.out.println("a == b");
            System.out.println("lala");
       }
     
       
       
       
       
       /*
            Switch (przełącznik)
        */
        char l = 50;
        switch(l)
        {
            case 50:
                System.out.println("l jest równe 50");
                break;
            case 100:
                System.out.println("l jest równe 100");    
                break;
            default:
                System.out.println("l nie jest równe ani 50 ani 100 jest równe " + l);
        }
        
        
        
         /*
            wyrażenie ? tu piszemy co ma sie stac jesli wyrazenie to true : co ma sie stac jesli wyrazenie jest false;
            
        */
        
        int x = 6;
//        
//        if (x % 2 == 0)
//            System.out.println("parzysta");
//        else
//            System.out.println("nieparzysta");
//        
        
        String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
        
        System.out.println(czyParzysta);
        
        
        
        
        
       
       
       
       
       
       
     
     }
    
}
