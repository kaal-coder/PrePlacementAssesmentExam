import java.util.*;
public class Number_9{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(n==0 || n==1)
         {
             System.out.println("Not prime");
         }
         else if(n==2)
         {
             System.out.println("Prime");
         }
         else
         {
             for(int i=2;i<=Math.sqrt(n);i++)
             {
                 if(n%i==0)
                 {
                     System.out.println("Not prime");
                     return;
                 }
             }
             System.out.println("Prime");
         }
     }
}