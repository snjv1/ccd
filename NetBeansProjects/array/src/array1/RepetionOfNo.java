package array1;
import java.util.*;

public class RepetionOfNo {
    public static void main(String[] args) {
        int[] arry={1,5,56,6,89,54,6,6,7,8,0,3,4,4,5,5,6,7,1,8,3};
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no to find occurence of no in array");
        int N=sc.nextInt();
        for(int i=0;i<arry.length;i++)
        {
            if(arry[i]==N)
                count++;
        }
        System.out.println("number "+ N + " is occured " + count + " times in array");
    }
    
}
