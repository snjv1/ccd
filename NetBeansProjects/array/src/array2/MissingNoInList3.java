/*Given an array C ofN integer and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.*/


package array2;
import java.util.*;
public class MissingNoInList3 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of test cases");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("enter no upto you want list");
            int n =sc.nextInt();
            int sum=0;  
            for(int i=0;i<n-1;i++)
            {
                sum+=sc.nextInt();   // sum used to find sum os n-1 no 
            }
            int ans=(n*(n+1))/2;      // ans is sum of n numbers
            System.out.println("missing no is" + (ans-sum));
             
        }
    
    }
    
/*
problem 

you are given an array of N integers including 0 . 
Task is to find the smallest positive missing from the arrray

ex given array is 
ex 1
input  ==>>  arr= 0 -9 1 3 -4 5 
 output ==>>  missing no is 2
*/

 public  void ss()
 {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        int brr[] =new int[n*20];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                brr[arr[i]]=1;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(brr[i]==0)
            {System.out.println(i);
            break;
        
            }
        }
        
    }
}
