import java.util.*;
public class Number_6{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int c=0;
         for(int i=2;i<=n;i++)
         {
             if(prime(i))
             {
                 c++;
             }
         }
         System.out.println(c);
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