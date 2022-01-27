package stackIntermediate;

import java.util.Stack;

public class celebrityProblem__4 
{
    public static void main(String[] args) {
        int[][] array = {{0,1,0} , {0,0,0},{ 0,1,0} };
        int N=3;

        Stack<Integer> st= new Stack<>();
        
        for(int i=0;i<N;i++)
        {
            st.push(i);
        }
        
        while(st.size()>=2)
        {
            int i=st.pop();
            int j=st.pop();
            
            // i knows j means -->  i is not a celebrity may J is 
            if(array[i][j]==1)
                st.push(j);
            // j knows i means -->  j is not a celebrity may I is 
            else
                st.push(i);
        }
        
        // when come out of while loop only one element is left 
        // take it as a element potential(pot)
        int pot=st.pop();
        for(int i=0;i<N;i++)
        {
         if(i!=pot)   // let pot=2 so not check for array[2][2]
         {
             // means i pot ko janta NA ho mtlb pot celebrity nhi ho skta OR OR  pot I ko janta ho to pot tbb bhi celeb nhi ho skta
             if(array[i][pot] ==0 || array[pot][i]==1)
             {
                 System.out.println("no one is celebirity ");
                 return;
             }
         }
        }
        
        System.out.println( pot + " is celcebrity");
        
    }
    
}
