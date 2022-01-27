// to check whether element N is present or not using dynamic array


package array1;
import java.util.*;
public class chckPresntOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        a.add(5);
        a.add(3);
        a.add(7); 
        a.add(8); 
        
        boolean b=a.contains(5);
        if(b)
            System.out.println("the list contain " + 5);
        else
            System.out.println("the list not contain " + 5);
        
    
    }
    
}
