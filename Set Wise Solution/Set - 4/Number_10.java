import java.util.*;
public class Number_10{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int m=2;
         for(int i=1;i<=1000;i++)
         {
             if(prime(m)&&prime(m+2))
             {
                 System.out.println(m+" "+(m+2));
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
}