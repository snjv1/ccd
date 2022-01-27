package exceptionsj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {
    public static void main(String[] args) {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int k=0,j,i=90;
        try{
            System.out.println("enter a no");
            j=Integer.parseInt(br.readLine());
            k=i/j;
        }
        
        catch(IOException e){
            System.out.println("some io error "); 
        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        catch(Exception e){
            System.out.println("some error of no format exception");
        }
        
        finally{
            System.out.println("finally bye");
        }
        System.out.println("divide result is"+k);
        
    }
    
}
