package finallKeyWord;

import java.util.Date;

public class finallKeyWord {

    public static void main(String[] args) {
        
        final double PI = 3.14;  // stała tak jak const. nie można jej zmieniać
        
        Employee p = new Employee();
        
//        p.dataZatrudnienia = new Date(); to nie zadziała gdyz 'data zatrudnienia' jest fianl
        
        System.out.println(p.dataZatrudnienia);

    }
    
}



abstract class Person {

}

class Employee extends Person {

    final Date dataZatrudnienia = new Date();   // w tym przypadku trzeba zdefiniować odrazu zmienna

}
