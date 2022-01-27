
import java.util.Scanner;

//
//class GfG {
//    //rat in maze
//    //rat in maze
//    //rat in maze
//    //rat in maze
//    
//   public static void main(String[] args)
//   {
//       
//       Scanner sc= new Scanner(System.in);
//       int n=5;
//       int solArr[][]=new int[n][n];
//        for(int i=0;i<n;i++)
//       {
//           for(int j=0;j<n;j++)
//           {
//               solArr[i][j]=0;
//           }
//       }
//       
//       int arr[][]=new int[n][n];
//       for(int i=0;i<n;i++)
//       {
//           for(int j=0;j<n;j++)
//           {
//               arr[i][j]=sc.nextInt();
//           }
//       }
//       System.out.println();
//       System.out.println();
//       
//       
//        
//        if(ratInMaze(arr,0,0,5,solArr))
//        {
//            for(int i=0;i<n;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    System.out.print(solArr[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//    
//   }
//   
//   
//   
//   static boolean isSafe(int arr[][],int x,int y,int n)
//   {
//       if(x<n && y<n && arr[x][y]==1)
//           return true;
//       
//       return false;
//   }
//   
//   static boolean ratInMaze(int arr[][], int x, int y,int n,int solArr[][])
//   {
//       if(x==n-1 && y==n-1  )
//       {
//           solArr[x][y]=1;
//           return true;
//       }
//       
//       
//       
//       if(isSafe(arr,x,y,n))
//       {
//           solArr[x][y]=1;
//           if(ratInMaze(arr,x+1,y,n,solArr))
//           {
//               return true;
//           }
//           if(ratInMaze(arr,x,y+1,n,solArr))
//           {
//               return true;
//           }
//           solArr[x][y]=0;           // backtracking
//           return false;
//           
//       }
//       return false;
//   }
//   
//   
//}
//
//        

