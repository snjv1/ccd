/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.Stack;

/**
 *
 * @author sanje
 */
public class slidingWindowMaximum__14 {
    public static void main(String[] args) {
        
        int arr[]= {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};
        int k=4;
        //result ==  [9 9 8 12 12 14 14 32 32 32 32 19 19 19]
        
        
     
    int[] nge = new int[arr.length];

    Stack<Integer> st = new Stack<>();
    st.push(arr.length - 1);
    nge[arr.length - 1] = arr.length;

    for(int i = arr.length - 2; i >= 0; i--){
      while(st.size() > 0 && arr[i] >= arr[st.peek()]){
        st.pop();
      }

      if(st.size() == 0){
        nge[i] = arr.length;
      } else {
        nge[i] = st.peek();
      }

      st.push(i);
    }

    // nge end

    int j = 0;
    for(int i = 0; i <= arr.length - k; i++){
      if(j < i){
        j = i;
      }

      while(nge[j] < i + k){
        j = nge[j];
      }
      System.out.print(arr[j]+ " ");
    }
 }
        
    }

