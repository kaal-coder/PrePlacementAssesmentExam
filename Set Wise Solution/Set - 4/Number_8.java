import java.util.*;
public class Number_8{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         for(int i=1;i<=500;i++)
         {
             if(fact(i))
             {
                 System.out.print(i+" ");
             }
         }
     }
     static boolean fact(int n)
     {
         int s=0;
         for(int i=1;i<n;i++)
         {
             if(n%i==0)
             {
                 s+=i;
             }
         }
         return s==n;
     }
}