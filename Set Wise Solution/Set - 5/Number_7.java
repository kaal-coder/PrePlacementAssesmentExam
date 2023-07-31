import java.util.*;
public class Number_7{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int x=sc.nextInt();
         int s=1,m=2;
         for(int i=2;i<=n;i++,m+=2)
         {
             int h=fact(m);
             if(i%2==1)
             {
                 s+=(int)(Math.pow(x,m))/h;
             }
             else
             {
                 s-=(int)(Math.pow(x,m))/h;
             }
         }
     }
     static int fact(int n)
     {
         int f=1;
         for(int i=1;i<=n;i++)
         {
             f*=i;
         }
         return f;
     }
}