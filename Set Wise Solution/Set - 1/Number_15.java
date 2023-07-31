import java.util.*;
public class Number_15{

     public static void main(String []args){
         int n=5;
         for(int i=1;i<=n;i++)
         {
             for(int b=1;b<=n-i;b++)
             {
                 System.out.print(" ");
             }
             if(i>=2)
             {
                 for(int k=1;k<=i;k++)
                 {
                     System.out.print(k+" ");
                 }
                 for(int k='A'+i;k>66;k--)
                 {
                     char p=(char)(k-2);
                     System.out.print(p+" ");
                 }
             }
             else
             {
                 System.out.print(i);
             }
             System.out.println();
         }
     }
}