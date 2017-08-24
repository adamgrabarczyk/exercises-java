/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
public class loops {
    
      public static void main(String[] args) {
        String[] kursyProgramowania = 
        {
            "Java", 
            "Java Aplikacje", 
            "Java Strumienie",
            "Java Aspekty Zaawansowane", 
            "Java Android",
            "C#", 
            "C# Tworzenie Aplikacji",
            "C# LINQ",
            "Pascal"
        };
//        int i = 0;
//        while(i < kursyProgramowania.length)
//        {           
//            System.out.println(kursyProgramowania[i]);
//            
//            i++;
//        }
      /*  
        i = 1;
        do
        {
           System.out.println(kursyProgramowania[i]);
            
            i++; 
       }while(i < kursyProgramowania.length);
              */
        
      
      
      
      
      
      
      
      
      
      // for (INICJALIZACJA ZMIENNYCH; WARUNEK PETLI; CO MA SIE STAC PO WYKONANIU INSTRUKCJI WSZYSTKICH W PETLI)
        for(int z = 0; z < kursyProgramowania.length; z++)
        {           
            System.out.println(kursyProgramowania[z]);           
           
        }
        
        
        
      /*  
        i = 1;
        do
        {
           System.out.println(kursyProgramowania[i]);
            
            i++; 
       }while(i < kursyProgramowania.length);
              */
        
    
      
      
       //ENHANCED FOR
      
        for(String nazwaKursu: kursyProgramowania)
        {
            System.out.println(nazwaKursu);
        }
        
        
      /*  
        i = 1;
        do
        {
           System.out.println(kursyProgramowania[i]);
            
            i++; 
       }while(i < kursyProgramowania.length);
              */
        
      
      
    }
    
}
