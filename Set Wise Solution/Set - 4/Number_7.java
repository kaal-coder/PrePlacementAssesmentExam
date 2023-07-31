import java.util.*;
public class Number_7{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         if(fact(a)==b&&fact(b)==a)
         {
             System.out.println("Amicable pairs");
         }
         else
         {
             System.out.println("Not amicable pairs");
         }
     }
     static int fact(int n)
     {
         int s=0;
         for(int i=1;i<n;i++)
         {
             if(n%i==0)
             {
                 s+=i;
             }
         }
         return s;
     }
}