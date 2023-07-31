import java.util.*;
public class Number_6{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9)
        {
            n=task(n);
        }
        System.out.println(n);
     }
     static int task(int n)
     {
         int s=0;
         while(n!=0)
         {
             s+=n%10;
             n/=10;
         }
         return s;
     }
}