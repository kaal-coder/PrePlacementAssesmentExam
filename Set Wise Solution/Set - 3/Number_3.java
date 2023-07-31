import java.util.*;
public class Number_3{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=n-1;i>=0;i--)
         {
             if(n%i==0)
             {
                 System.out.println(i);
                 break;
             }
         }
     }
}