package dp__greedy;

import java.util.Scanner;

public class paintFence__19 
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); // no of fence
        int k=sc.nextInt(); //  no of color
        /*
        fence =8
        color= 3;
        
        output= 3672;
        */
        
        long same= k*1;
        long different = k* (k-1);
        long total =same+different;
        for(int i=3; i<=n; i++)
        {
            same = different*1;
            different = total * (k-1);
            total= same + different;
        }
        
        System.out.println(total);
    }
}
