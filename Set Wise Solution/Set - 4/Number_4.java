import java.util.*;
public class Number_4{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=2;
         while(n/k!=1)
         {
             if(n%k==0)
             {
                 System.out.print(k+" , ");
                 n/=k;
             }
             else
             {
                 k++;
             }
         }
         System.out.println(n+".");
     }
}