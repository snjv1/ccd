package sorting;

import java.util.Scanner;

public class sortDates8 
{
    public static void main(String[] args) 
    {
        
        /*
        5
        12041996
        20101996
        05061997
        12041989
        11081987
        */
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    
     for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+ " ");
    }
        
    }
 
     public static void sortDates(String[] arr) {
    countSort(arr, 1000000, 100, 32);    // FOR DAYS div,modulus..   Range is 32 bcz  total days is 1 to 31  to 0 index kisi kaam ka h nhi to 1 se 31 index use krega date store krne k liye 
    countSort(arr, 10000, 100, 13);      // FOR MONTH div , moduls..  Range is 13 bcz  total month is 1 to 12  to 0 index kisi kaam ka h nhi to 1 se 12 index use krega month store krne k liye 
    countSort(arr, 1, 10000, 2501);  // jo input h d=sort krne ke liye data usme given H YEAR 2501 se bda nhi h to  2501   // FOR YEAR div , moduls..  Range is  2501 
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    String[] ans = new String[arr.length];
    // make frequency arr
    int[] farr = new int[range];
    for (int i = 0; i < arr.length; i++) {
      farr[Integer.parseInt(arr[i], 10) / div % mod]++;      //   (ineger.parse int(arr[i],10)) isliye kiya h kuki String aray h jisme string store h to string ko integer m jbb parse krenge to vo decimal base p parse ho isliye 10 daala h PARSEINT m
    }
    // convert it into prefix sum array
    for (int i = 1; i < farr.length; i++) {
      farr[i] += farr[i - 1];
    }
    // stable sorting(filling ans array)
    for (int i = arr.length - 1; i >= 0; i--) {
      int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
      ans[pos] = arr[i];
      farr[Integer.parseInt(arr[i], 10) / div % mod]--;
    }
    // filling original array with the help of ans array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ans[i];
    }
  }
    
    
}
