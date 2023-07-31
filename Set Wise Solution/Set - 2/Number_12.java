import java.util.*;
public class Number_12{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             for(int b=1;b<=n-i;b++)
             {
                 System.out.print(" ");
             }
             if(i>1)
             {
                 for(int k=1;k<=i;k++)
                 {
                     System.out.print(k);
                 }
                 for(int k=i-1;k>=1;k--)
                 {
                     System.out.print(k);
                 }
                 System.out.println();
             }
             else
             {
                 System.out.println("1");
             }
         }
     }
}