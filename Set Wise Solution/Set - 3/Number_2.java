import java.util.*;
public class Number_2{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int b[] = new int[10];
         for(int i:a)
         {
             b[i]++;
         }
         StringBuilder nm=new StringBuilder();
         for(int i=9;i>=0;i--)
         {
             for(int j=1;j<=b[i];j++)
             {
                 nm.append(i);
             }
         }
         System.out.println(nm.toString());
     }
}