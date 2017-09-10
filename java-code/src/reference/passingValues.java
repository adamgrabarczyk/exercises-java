
package reference;

public class passingValues {

    public static void main(String[] args) {
        
  int a = 5;      
        
  someTest x = new someTest();
  
  x.changeValue(a);
  
        System.out.println(a);
  
    }
    
}


class someTest {

    void changeValue(int zm) {
    
        zm = zm + 2;
    }
}