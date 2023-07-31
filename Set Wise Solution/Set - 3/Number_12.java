import java.util.*;
public class Number_12{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a=1,b=1,c=0;
         if(n==1)
         {
             System.out.println(a);
         }
         else if(n==2)
         {
             System.out.println(a+" 2");
         }
         else if(n==3)
         {
             System.out.println(a+" 2 "+b);
         }
         int f=2;
         for(int i=4;i<=n;i++)
         {
             if(i%2==0)
             {
                 f=prime(f+1);
             }
             else 
             {
                 c=a+b;
                 a=b;
                 b=c;
             }
         }
         if(n%2==0)
         {
             System.out.println(f);
         }
         else
         {
             System.out.println(c);
         }
         
     }
     static int prime(int n)
     {
         while(true)
         {
             int k=0;
             for(int i=2;i<=Math.sqrt(n);i++)
             {
                 if(n%i==0)
                 {
                     k=1;
                     break;
                 }
             }
             if(k==1)
             {
                 n++;
             }
             else
             {
                 return n;
             }
         }
     }
}