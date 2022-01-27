package string1;
public class StringToInteger8 {
    public static void main(String[] args) {
        
        
   /*     
 There are two methods available in java to convert string to integer. 
   One is Integer.parseInt() method and another one is Integer.valueOf() method. 
   Both these methods throw NumberFormatException if input string is not a valid integer.
  The main difference between Integer.parseInt() and Integer.valueOf() method is that parseInt() method returns
          primitive int where as valueOf() method returns java.lang.Integer object.

Java Program
        To Convert String To Integer Using Integer.parseInt() method :
        */


		String s = "2015";
		
		int i = Integer.parseInt(s);
                int k=Integer.valueOf(s);
		
		System.out.println(i);          //Output : 2015
                System.out.println(k);
                
                
  /*              
 You are also often need to do the reverse conversion i.e converting from integer to string. 
 Java provides couple of methods to do that also. one is Integer.toString() method and another one is String.valueOf() method. 
         Both these methods return string representation of the given integer.

Java Program To Convert Integer To String Using Integer.toString() Method :


*/
        int m = 2015;
         
        String l = Integer.toString(m);
        String t=String.valueOf(m);
         
        System.out.println(l);
        System.out.println(t);
     
	}
}

 