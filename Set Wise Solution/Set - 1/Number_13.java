import java.util.*;
public class Number_13{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int f=n;
         while(n!=0)
         {
             System.out.print(n%10+" ");
             n/=10;
         }
         if(f%9==0)
         {
            System.out.println("\n"+f+" is Divisible by 9"); 
         }
     }
}