package stackIntermediate;
import java.util.Stack;

public class insertElementAtBottom6 
{
    static Stack<Character> st= new Stack<>();
    public static void main(String[] args) 
    {
        st.push('b');
        st.push('c');
        st.push('d');
        st.push('e');
         

        insert_at_bottom('a');
        
        while(!st.isEmpty())
        {   
            System.out.println(st.pop());
        }
    }
    
    static void insert_at_bottom(char x)
    {
        

    if(st.isEmpty())
        st.push(x);

    else
    {
        /* All items are held in Function Call Stack until we
           reach end of the stack. When the stack becomes
           empty, the st.size() becomes 0, the
           above if part is executed and the item is inserted
           at the bottom */

        char a = st.pop();
        insert_at_bottom(x);

        //push all the items held in Function Call Stack
        //once the item is inserted at the bottom
        st.push(a);
    }
    }   
}
