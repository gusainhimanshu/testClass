/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.sort2DArray;
import java.io.*;

/**
 *
 * @author hgusain
 */
public class Sort2DArray {
    public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the no. of  rows: "); //inputting number of rows
            int r=Integer.parseInt(br.readLine());
            System.out.print("Enter the no. of columns: "); //inputting number of columns
            int c=Integer.parseInt(br.readLine());
            int A[][]=new int[r][c]; //creating a 2D array
            
            /* Inputting the 2D Array */
 
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print("Enter the elements: ");
                    A[i][j]=Integer.parseInt(br.readLine());
                }
            }        
    
            /* Printing the original 2D Array */
 
            System.out.println("The original array:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
 
            /* Sorting the 2D Array */
 
            int t=0;
            for(int x=0;x<r;x++)
            {
                for(int y=0;y<c;y++)
                {
                    for(int i=0;i<r;i++)
                    {
                        for(int j=0;j<c;j++)
                        {   
                            if(A[i][j]>A[x][y])
                            {
                                t=A[x][y];
                                A[x][y]=A[i][j];
                                A[i][j]=t;
                            }
                        }
                    }
                }
            }
 
            /* Printing the sorted 2D Array */
 
            System.out.println("The Sorted Array:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
        }
}
