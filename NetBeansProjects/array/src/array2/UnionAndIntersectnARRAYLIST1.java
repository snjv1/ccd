package array2;
import java.util.*;
public class UnionAndIntersectnARRAYLIST1 {
    public static void main(String[] args) {             
        



/*

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     
        ArrayList<Integer> arrayList =new ArrayList<>();
        
Arrays.sort(nums1);
Arrays.sort(nums2);
int i = 0;
int j = 0;
while (i < nums1.length && j < nums2.length) {
if (nums1[i] < nums2[j]) {
i++;
} else if (nums1[i] > nums2[j]) {
j++;
} else {
arrayList.add(nums1[i]);
i++;
j++;
}
}
int[] result = new int[arrayList.size()];
int k = 0;
for (Integer num : arrayList) {
result[k++] = num;
}
return result;
}
}




*/
        int []a1={1,2,3,4,2,5};
        int []a2={19,2,3,8,9};     
        
        ArrayList<Integer> union=new ArrayList<>();
        ArrayList<Integer> intersec=new ArrayList<>();      
        
       for(int i=0;i<a1.length;i++)
        {
            union.add(a1[i]);
        }
       int ans=0;
       for(int i=0;i<a2.length;i++)
       {           
           ans=0;
           for(int j=0;j<a1.length;j++)
           {
               if(a1[j]==a2[i])
               {
                   ans=1;
                   intersec.add(a2[i]);
                   break;
               }
           }
               if(ans==0)
               {
                   union.add(a2[i]);
               }   
          
        }
            System.out.println(union);
            System.out.println(intersec);
       }
        
        
    }
    