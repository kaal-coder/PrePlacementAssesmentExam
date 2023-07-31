import java.util.*;
public class Number_9{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int m=2;
         for(int i=1;i<=100;)
         {
             if(prime(m))
             {
                 if(palin(m))
                 {
                     System.out.print(m+ " ");
                     if(i%10==0)
                     {
                         System.out.println();
                     }
                     i++;
                 }
             }
             m++;
         }
     }
     static boolean prime(int n)
     {
         if(n==2)
         {
             return true;
         }
         for(int i=2;i<=Math.sqrt(n);i++)
         {
             if(n%i==0)
             {
                 return false;
             }
         }
         return true;
     }
     static boolean palin(int n)
     {
         int d=n,rev=0;
         while(d!=0)
         {
             rev=rev*10+(d%10);
             d/=10;
         }
         return rev==n;
     }
}