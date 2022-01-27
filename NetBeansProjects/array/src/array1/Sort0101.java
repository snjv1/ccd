package array1;
import java.util.*;
public class Sort0101 {
    public static void main(String[] args) {
        
        int arr[]={0,1,0,0,0,1,1,1,1,2,2,2,2,2,0,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        
        range(arr);
       
        
    } 
        
        static void range(int[] a)
        {
            int c1=0,c2=0,c3=0;
                      
            for(int i=0;i<a.length;i++)
            {
                switch(a[i])
                {
                    case 1:
                        c1++;
                        break;
                    case 2:
                        c2++;
                        break;
                    case 3:
                        c3++;
                        break;
                }               
            }
            
            int i=0;
             while(c1>0)
             {
                 a[i]=0;
                 i++;
                 c1--;
             }
               while(c2>0)
             {
                 a[i]=1;
                 i++;
                 c2--;
             }
                 while(c3>0)
             {
                 a[i]=2;
                 i++;
                 c3--;
             }
                 
             for(int j=0;j<a.length;j++)
            {
                System.out.print(a[j]);
            }
            
            
    
                
                
            }
            
        }
    
    

