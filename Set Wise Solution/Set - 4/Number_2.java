import java.util.*;
public class Number_2{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         StringBuilder nm=new StringBuilder();
         while(n!=0)
         {
             nm.append(n%10);
             n/=10;
         }
         System.out.println(nm);
     }
}