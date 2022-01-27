//Find all pairs on integer array whose sum is equal to given number.

/*Given an array of integers, and an integer  ‘K’ , find the count of pairs of elements in the array whose sum is equal to 'K'.

Input:
First line of the input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains 2 space separated integers N and K denoting the size of array and the sum respectively. Second line of each test case contains N space separated integers denoting the elements of the array.

Output:
Print the count of pairs of elements in the array whose sum is equal to the K.

Constraints:
1<=T<=50
1<=N<=50
1<=K<=50
1<=A[i]<=100

Example:
Input
2
4 6
1  5  7 1
4 2
1 1 1 1
Output
2
6  */



package array2;
import java.util.*;
 class PairOfSum4 {
    /*
    COMPLEXITY N2 
    COMPLEXITY N2 
    COMPLEXITY N2 
    COMPLEXITY N2 
    */
    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();  // total no of test cases
//        while(T-->0)
//        {
//        int N=sc.nextInt();   // size of array
//        int K=sc.nextInt();    // Sum of no whose pair we have to find
//        int arr[]=new int[N];
//        for(int i=0;i<N;i++)
//            arr[i]=sc.nextInt();  // input of array
//        int count=0;
//        for(int i=0;i<N-1;i++)
//        {
//            for(int j=i+1;j<N;j++)
//            {
//                if((arr[i]+arr[j])==K)
//                    count++;      // pair to count
//            }
//        }
//        System.out.println(count); // total pairs 
//        
//        }
        
        
    
      
    
    /*
    IF ARRAY IS SORTEDD
    THEN 
    OPTIMIZE APPROACH IS
    OF O(n) complexity
    
    IF ARRAY IS SORTEDD
    THEN 
    OPTIMIZE APPROACH IS
    OF O(n) complexity
    
    */
    
    //let sorted array is
    int arr[]={2,4,6,7,8,12,25};
    
    int n=arr.length;
    int k = 10; //sum of two no
    int low=0;
    int high=n-1;
    boolean check=false;
    while(low<high)
    {
        check=false;
        if(arr[low]+arr[high]==k)
        {
            System.out.println(low +" "+ high );
            check=true;
        }
        if(arr[low]+arr[high]<k)        
            low++;
        else
            high--;
    }
     if(check==false)
        System.out.println("no pair found");
}
}