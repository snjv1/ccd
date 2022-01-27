/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dryrun;

/**
 *
 * @author sanje
 */
public class array {
    public static void main(String[] args) {
    //int[] nums={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
    int[] nums={3,1};
    int target=1;
        boolean ab= bs(nums,target);
        System.out.println(ab);
        
        boolean bd=bs1(nums,target);
        System.out.println(bd);
        
        
   
    }
    
    static boolean bs(int[] nums,int target)
    {
        int start=0,end=nums.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(nums[mid]==target)
            {
                return true;
            }            
             if(nums[mid]==nums[end])
            {
                end--;
            }
            else if(nums[mid]<nums[end])
            {
                if(target>nums[mid] || target<=nums[end] )
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else 
            {
                if(target>=nums[start] || target < nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            
        }
        
        return false;
        
        
    }
    
    static boolean bs1(int[] nums, int target)
    {
         int len = nums.length;
        int start = 0;
        int end = len - 1;
        int mid = (start+end)/2;
        Boolean result = false;
        while(start <= end){
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] == nums[end]){
                end--;
            }
            else if(nums[mid] < nums[end]){
                //right array is sorted
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                //left array is sorted
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            mid = (start+end)/2;
        }
        return false;
        
    }
    
static     public int findMaxNumber(int[] arr)
    {
        int start=0, end=arr.length-1;
        
        while(start<end)
        {
            int mid = start+(end-start)/2;
             if(arr[mid]>arr[start])
                start=mid+1;
            else
                end=mid;                           
        }
        return start;
        
    }
    
static     public int binarySearch(int[] arr, int target,int start, int end)
    {        
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            
            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
        
        
        
        
        
        
    
//         
//       int[] mountainArr = {1,2,3,4,5,3,1}; 
//       int target = 3;
//        int peak = peakIndexInMountainArray(mountainArr);
//        System.out.println("peak "+peak);
//        int left = binarySearch(mountainArr,target,0,peak,true);
//        System.out.println("left "+left);
//        int right = binarySearch(mountainArr,target,peak,mountainArr.length-1,false);
//        System.out.println("right "+right);
//        
//        System.out.println( Math.min(left,right));
//        
//    }
//    
//    
//    static public int peakIndexInMountainArray(int[] mountainArr) 
//    {         
//        int start=0,end=mountainArr.length-1;
//                
//        while(start<end)
//        {
//            int mid =start+(end-start)/2;
//            
//            if(mountainArr[mid] > mountainArr[mid+1])
//                end=mid;
//            else
//                start=mid+1;
//        }
//        return start;
//    }
//    
//    static public int binarySearch( int[] arr, int target, int start, int end, boolean isLeft)
//    {
//        
//        while(start<=end)
//        {
//            int mid= start+(end-start)/2;
//            
//            if(isLeft)
//            {
//                
//            if(target<arr[mid])
//                end=mid-1;
//            
//            else if(target>arr[mid])
//                start=mid+1;
//            
//            else
//                return arr[mid];
//            }
//            
//            
//            else
//            {
//                
//                if(target<arr[mid])
//                    start=mid+1;                
//            
//                else if(target>arr[mid])
//                    end=mid-1;               
//            
//                else
//                    return arr[mid];
//            }
//                
//        }
//        return -1;
//    }
//    
//}