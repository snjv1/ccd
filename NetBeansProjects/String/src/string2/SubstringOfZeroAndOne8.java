package string2;
public class SubstringOfZeroAndOne8
{
    public static void main(String[] args) 
    {
        String str="0111100010";
        int count0=0,count1=0,count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
                count0+=1;
            else 
                count1+=1;
            if(count0==count1)
                count+=1;
            
            
                
        }
        System.out.println(count);
        
       
    }
    
}
