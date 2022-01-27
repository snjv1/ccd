package JavaClassFile;
import java.util.Scanner;
public class StarPttrn 
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your name\n");
      String s=sc.nextLine();
      int a=s.length();
      
      for(int l=0;l<a;l++)
      {
          char ch=s.charAt(l);
          int i,j;
          switch(ch)
          { 
              case 'A':
              {
                  for( i=1;i<=4;i++)
                  {
                      for(j=1;j<=7;j++)
                      {
                          if((i==4&&j==1)||(i==3&&j==2)||(i==2&&j==3)||(i==1&&j==4)||(i==2&&j==5)||(i==3&&j==6)||(i==4&&j==7)||(i==3&&j==3)||(i==3&&j==4)||(i==3&&j==5))
                          {
                              System.out.print("a");
                           
                          }
                            else
                               System.out.print(" ");
                       }
                      System.out.println();
                  }
                  System.out.println();
                  System.out.println();
                  break;
              }
              
              
              case 'B':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==3&j==3)||(j==1)||(i==1&&j==2)||(i==1&&j==3)||(i==1&&j==4)||(i==2&&j==5)||(i==3&&j==4)||(i==4&&j==5)||(i==5&&j==2)||(i==5&&j==3)||(i==5&&j==4))
                               System.out.print("* ");
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               case 'C':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {                           
                           if((i==1&&j==1)||(i==5&&j==1))
                               System.out.print(" ");
                           
                           else if((j==1)||(i==1)||(i==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'D':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {                           
                           if((i==1&&j==5)||(i==5&&j==5))
                               System.out.print(" ");
                           
                           else if((j==1)||(i==1)||(i==5)||(j==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'E':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==3&&j==5))
                               System.out.print(" "); 
                           
                           else if((j==1)||(i==1)||(i==5)||(i==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'F':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((j==1)||(i==1)||(i==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
                              
              case 'G':
               {
                   for(i=1;i<=6;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {                           
                           if((j==1)||(i==1)||(i==6)||(i==4&&j==4)||(i==4&&j==5)||(i==5&&j==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
                case 'H':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((j==1)||(j==5)||(i==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
                case 'I':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==5)||(i==1)||(j==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
                case 'J':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                         
                                   
                          if((j==3)||(i==5&&j==2)||(i==4&&j==1)||(i==5&&j==1))                           
                              System.out.print("j");                           
                                                           
                           else
                               System.out.print(" ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'K':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((j==1)||(i+j==4)||(i==4&&j==2)||(i==5&&j==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'L':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((j==1)||(i==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'M':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((j==1)||(j==5)||(i==2&&j==2)||(i==3&&j==3)||(i==2&&j==4))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'N':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((j==1)||(i==j)||(j==5))
                               System.out.print("* ");
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'O':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {                           
                           if((i==1&&j==1)||(i==5&&j==1))
                               System.out.print(" ");
                           
                           else if((j==1)||(i==1)||(i==5)||(j==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
                         
              
               
               case 'P':
               {
                   for(i=1;i<=6;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==1&&j==5)||(i==3&&j==5))
                               System.out.print(" ");
                           
                           else if((j==1)||(i==1)||(i==2&&j==5)||(i==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
              
                case 'Q':
               {
                   for(i=1;i<=6;i++)
                   {
                       for(j=1;j<=6;j++)                           
                       {                           
                           if((i==1&&j==1)||(i==6&&j==1)||(i==6&&j==5)||(i==1&&j==6)||(i==5&&j==1))
                               System.out.print(" ");
                           
                           else if((j==1)||(i==1)||(i==5)||(i==4&&j==4)||(j==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               
               case 'R':
               {
                   for(i=1;i<=6;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==1&&j==5)||(i==3&&j==5))
                               System.out.print(" ");
                           
                           else if((j==1)||(i==1)||(i==4&&j==2)||(i==5&&j==3)||(i==6&&j==4)||(i==2&&j==5)||(i==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'S':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==1&&j==1)||(i==3&&j==1)||(i==3&&j==5)||(i==5&&j==5))
                               System.out.print(" "); 
                           
                           else if((i==1)||(i==5)||(i==3)||(i==2&&j==1)||(i==4&&j==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
              
               case 'T':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==1)||(j==3))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'U':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {                         
                           if((i==5&&j==1))
                              System.out.print(" "); 
                           else if((j==1)||(i==5)||(j==5))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
              
               
               case 'V':
               {
                   for(i=1;i<=4;i++)
                   {
                       for(j=1;j<=7;j++)                           
                       {
                           if((i==j)||(i==3&&j==5)||(i==2&&j==6)||(i==1&&j==7))                           
                              System.out.print("v");                           
                                                           
                           else
                               System.out.print(" ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }                             
               
               case 'W':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((j==1)||(j==5)||(i==3&&j==3)||(i==4&&j==2)||(i==4&&j==4))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               case 'X':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==j)||(i+j==6))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
               
               
               case 'Y':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==1&&j==1)||(i==2&&j==2)||(i+j==6))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               } 
              
               case 'Z':
               {
                   for(i=1;i<=5;i++)
                   {
                       for(j=1;j<=5;j++)                           
                       {
                           if((i==1)||(i==5)||(i+j==6))                           
                              System.out.print("* ");                           
                                                           
                           else
                               System.out.print("  ");                
                       }
                       System.out.println();                       
                   }
                   System.out.println();
                  System.out.println();
                   break;
               }
          }   
      }   
  }
}