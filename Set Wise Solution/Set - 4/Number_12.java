import java.util.*;
public class Number_12{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         String s="";
         while(n!=0)
         {
             s=(n%8)+s;
             n/=8;
         }
         System.out.println(s);
     }
}