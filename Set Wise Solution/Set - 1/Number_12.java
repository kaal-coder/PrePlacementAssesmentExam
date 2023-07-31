import java.util.*;
public class Number_12{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = {100 , 50 , 20 , 10 , 5 , 2 , 1};
         int b[] = new int[7];
         for(int i=0;i<7;i++)
         {
             if(n>=a[i])
             {
                 b[i]=n/a[i];
                 n=n-b[i]*a[i];
             }
         }
         for(int i=0;i<7;i++)
         {
             System.out.println(a[i] +" -> "+b[i]);
         }
     }
}