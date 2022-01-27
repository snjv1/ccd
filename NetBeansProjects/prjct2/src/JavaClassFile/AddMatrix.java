package JavaClassFile;
public class AddMatrix {
    public static void main(String[] args) {
        int[][] arr1={ {3,6,5},{2,2,6},{8,7,5} };
        int[][] arr2={ {6,5,3},{3,5,2},{7,8,5} };
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.print(arr1[i][j]  + arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
      
                
        
    }
    
}
