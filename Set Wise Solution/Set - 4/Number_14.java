import java.util.*;
public class Number_14{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();  
         int a[][] = new int[n][m];
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 a[i][j]=sc.nextInt();
             }
         }
         System.out.println("The transpose matrix is ");
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }
     }
}