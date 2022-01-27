package string2;
public class RotationOrNot1 
{
    public static void main(String[] args) 
    {
        String str1="abcd";
        String str2="cdab";
        
        if(str1.length()!=str2.length())
            System.out.println(str2 +"is not rotaion of "+str1);
        
        else
        {
             String str3=str1+str1;
             
             if(str3.contains(str2))
                 System.out.println(str2+ " str2 is a rotated version of str1 " + str1);
             else
                 System.out.println(str2+ " str2 is not a rotated version of str1 " + str1);
             
        }
           
        
        
                
    }
    
}
   