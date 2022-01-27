package string2;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/find-next-greater-number-set-digits/
*/

/*
https://www.geeksforgeeks.org/find-next-greater-number-set-digits/

1) If all digits sorted in descending order, then output is always “Not Possible”. For example, 4321.
2) If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234.
3) For other cases, we need to process the number from rightmost side (why? because we need to find the smallest of all greater numbers)

You can now try developing an algorithm yourself.

Following is the algorithm for finding the next greater number.

I) Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than the previously traversed digit.
For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9. 
If we do not find such a digit, then output is “Not Possible”.

II) Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″, the right side of 4 contains “976”.
The smallest digit greater than 4 is 6.

III) Swap the above found two digits, we get 536974 in above example.

IV) Now sort all digits from position next to ‘d’ to the end of number. The number that we get after sorting is the output.
For above example, we sort digits in bold 536974. We get “536479” which is the next greater number for input 534976.


*/



public class nextGrtrWithSameSet16 
{
    public static void main(String[] args) 
    {
          char digits[] = { '5','3','4','9','7','6' }; 
        int n = digits.length; 
        findNext(digits, n); 
    }
    
    static void findNext(char array[],int n)
    {
        int i=0;
        for(i=n-1; i>0;i--)
        {
            if(array[i]>array[i-1])
                break;
        }
        if(i==0)
            System.out.println("no is not possible");
        
        int x=array[i-1];
        int min=i;
        
        for(int j=i+1;j<n;j++)
        {
            if(array[j]>x && array[j]<array[min])
                min=j;
        }
        
        
        /*
        now swap i-1 element with right side smallest element 
        */
        swap(array,i-1,min);
        
        Arrays.sort(array, i, n);
        
         System.out.print("Next number with same" + 
                                    " set of digits is "); 
            for (i = 0; i < n; i++) 
                System.out.print(array[i]);
            System.out.println();
        
        
        
    }
        
    static void swap(char array[],int i, int j)
    {
        char temp;
        
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
       
    }
    
}
    
    
       
    
