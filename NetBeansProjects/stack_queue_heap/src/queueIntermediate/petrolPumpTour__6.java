package queueIntermediate;
public class petrolPumpTour__6 
{
    public static void main(String[] args) 
    {
        
        int Petrol[] = {4, 6, 7, 4};
        int Distance[] = {6, 5, 3, 5};
        
        int result = calculate(Petrol ,Distance);
        System.out.println(result);
    }
    
    static int calculate(int petrol[] ,int distance[])
    {
        int total=0 , index=0 ,tank=0;
        
        for(int i=0; i<petrol.length ;i++)
        {
            int consume =petrol[i] - distance[i];      // ek city se dusri city jaaate time consume tell
            tank +=consume;       // tank store krega tell ek city se dusri city ke liye agr km yya jaada hoga to taank m adjust ho jaeyga
            if(tank<0)            // agr - minus m chla jaye to mtlb fuel hi nhi h dusri city jaane ke liye
            {
                index=i+1;      //jis bhi index p hua h tank <0 uuse next se check krenge ki circular tour ho skta h k nhi
                tank=0;               
            }
            total+=consume;        //pure sari city ko travel krne m jo tel lga h vo h agr sari city ko travel kren m tell khtm nhi hua to total hmesha greter than 0 rhega
            
        }
        
        return total < 0 ? -1: index;      //index mtlb ki is city se shuru krenge to phuch jayenge    
    }
    
}
