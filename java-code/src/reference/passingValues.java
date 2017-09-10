
package reference;

public class passingValues {

    public static void main(String[] args) {
        
  int a = 5;      
        
  someTest x = new someTest();
  
 a = x.changeValue(a);
  
        System.out.println(a);
  
        
        Foo foo = new Foo();
        
        
        x.changeReference(foo);
   
        System.out.println(foo.y);
    
    }
    
}


class someTest {

    int changeValue(int zm) {
    
        zm = zm + 2;
    return zm;
    }
    
    void changeReference(Foo zm) {

        zm.y = zm.y + 40;
        
}
}


class Foo {

int y = 20;
}


