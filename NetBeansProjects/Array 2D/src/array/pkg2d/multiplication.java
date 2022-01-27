/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.pkg2d;

import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class multiplication {
    
    public static void main(String[] args) {
        
           
        Scanner sc=new Scanner(System.in);
// row of first matrix
int R1= sc.nextInt();
// cloumn of 1 matrix 
int C1= sc.nextInt();
// row of 2 matrix
int R2= sc.nextInt();
// column of 2 matrix
int C2= sc.nextInt();

int[][] one= new int[R1][C1];
int[][] two = new int[R2][C2];


//input of 1 matrix
for(int i=0;i<R1;i++)
    for(int j=0;j<C1;j++)
        one[i][j]=sc.nextInt();

//input of 2 matrix
for(int i=0;i<R2;i++)
    for(int j=0;j<C2;j++)
        two[i][j]=sc.nextInt();

int[][] prd = new int[R1][C2];
      for (int i = 0; i < R1; i++) {
         for (int j = 0; j < C2; j++) {
            int sum = 0;

            for (int k = 0; k < C1; k++) {
               sum += one[i][k] * two[k][j];
            }

            prd[i][j] = sum;
         }
      }

      for (int i = 0; i < R1; i++) {
         for (int j = 0; j < C2; j++) {
            System.out.print(prd[i][j] + " ");
         }
         System.out.println();
      }
    }
}