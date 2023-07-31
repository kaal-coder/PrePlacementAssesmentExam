import java.util.*;
public class Number_13{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int s=0;
         for(int i=1,m=1;i<=n;i++,m+=2)
         {
             if(i%2==1)
             {
                 s+=m;
             }
             else
             {
                 s-=m;
             }
         }
         System.out.println(s);
     }
}