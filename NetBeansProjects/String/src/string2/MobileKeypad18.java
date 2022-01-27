package string2;
public class MobileKeypad18 
{
    
    
    
    /*
    For each character, store the sequence which should be obtained at its respective position in an array, 
    i.e. for Z, store 9999. For Y, store 999. For K, store 55 and so on.
    For each character, subtract ASCII value of ‘A’ and obtain the position in the array pointed
    by that character and add the sequence stored in that array to a string.
    If the character is a space, store 0
    Print the overall sequence.
    
    */
    public static void main(String[] args) 
    {
        String str[]={ "2","22","222",  
                       "3","33","333",
                       "4","44","444",
                       "5","55","555",
                       "6","66","666",
                       "7","77","777","7777",
                       "8","88","888",
                       "9","99","999","9999"};
        
        String x="geeksforgeeks";
        System.out.println(printSequence(str,x
        ));
        
    } 
    
    static String printSequence(String arr[],String x)
            
    {
        String output="";
        
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)==' ')
                output+="0";
            
            else
            {
                int position = x.charAt(i) - 'a';
                output+= arr[position];
            }
        }
        return output;
        
    }
    
}
