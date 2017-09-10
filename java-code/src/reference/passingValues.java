
package reference;

public class passingValues {

    public static void main(String[] args) {
        
  int a = 5;      
        
  someTest x = new someTest();
  
 a = x.changeValue(a);
  
        System.out.println(a);
  
    }
    
}


class someTest {

    int changeValue(int zm) {
    
        zm = zm + 2;
    return zm;
    }
}