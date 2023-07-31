import java.util.*;
public class Number_11{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int d=sc.nextInt();
         int b=sc.nextInt();
         int m[][] = new int[d][b];
         int s=0;
         for(int i=0;i<d;i++)
         {
             for(int j=0;j<b;j++)
             {
                 m[i][j]=a[s++];
             }
         }
         for(int i=0;i<d;i++)
         {
             for(int j=0;j<b;j++)
             {
                 System.out.print(m[i][j]+" ");
             }
             System.out.println();
         }
     }
}