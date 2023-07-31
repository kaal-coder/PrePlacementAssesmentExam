import java.util.*;
public class Number_13{
    static int a[][][] = new int[5001][5001][5];
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 for(int k=0;k<5;k++)
                 {
                     a[i][j][k]=-1;
                 }
             }
         }
         System.out.println(task(n,4,1));
     }
     static int task(int n , int k , int p)
     {
         if(k==0&&n==0)
         {
             return 1;
         }
         if(n<=0||k<=0)
         {
             return 0;
         }
         if(a[n][p][k]!=-1)
         {
             return a[n][p][k];
         }
         int f=0;
         for(int i=p;i<=n;i++)
         {
             f+=task(n-i,k-1,i);
         }
         return a[n][p][k]=f;
     }
}