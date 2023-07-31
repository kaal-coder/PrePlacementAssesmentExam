import java.util.*;
public class Number_15{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int s=0,i=0;
         while(m!=0)
         {
             s=s+(n*(m%10*(int)(Math.pow(10,i++))));
             m/=10;
         }
         System.out.println(s);
     }
}