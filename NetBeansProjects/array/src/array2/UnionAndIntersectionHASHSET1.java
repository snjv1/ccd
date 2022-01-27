package array2;
import java.util.*;
public class UnionAndIntersectionHASHSET1 {
    
    public static void main(String[] args) 
	{ 
		int arr1[] = {7, 1, 5,6, 2, 3, 6}; 
		int arr2[] = {3, 8, 6,3,1,6, 20, 7}; 

		System.out.println("Union of two arrays is : "); 
		UnionHash(arr1, arr2); 
                
		
		System.out.println("Intersection of two arrays is : "); 
		IntersectionHash(arr1, arr2);		
                
        }
    
    
	// union using hashset
	static void UnionHash(int arr1[], int arr2[]) 
	{ 
            // HashSet never contain duplicate no 
		HashSet<Integer> hs =new HashSet<>();
                for(int i=0;i<arr1.length;i++)
                    hs.add(arr1[i]);
                for(int i=0;i<arr2.length;i++)
                    hs.add(arr2[i]);
                
                System.out.println(hs +"using HSASHSET" );
	} 
        
    
	
	// Intersection using Hashset
	static void IntersectionHash(int arr1[], int arr2[]) 
	{ 
            System.out.println("intersection using hash");
            HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<arr1.length;i++)
                hs.add(arr1[i]);
            
            for(int i=0;i<arr2.length;i++)
            {
                if(hs.contains(arr2[i]))
                    System.out.print(arr2[i] + ",");
            }	
            System.out.println();
	} 
        
       
        
       
	
	// Driver method to test the above function 
	
    
}
