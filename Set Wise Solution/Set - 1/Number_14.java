import java.util.*;
public class Number_14{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=12;
         int k=String.valueOf(n).length();
         if(k%2==0)
         {
             int a[] = new int[10];
             while(n!=0)
             {
                 a[n%10]++;
                 n/=10;
             }
             for(int i=0;i<10;i++)
             {
                 if(a[i]%2==1)
                 {
                     System.out.println(1);
                     return;
                 }
             }
             System.out.println(2);
         }
         else
         {
             int a[] = new int[10];
             while(n!=0)
             {
                 a[n%10]++;
                 n/=10;
             }
             int c=0;
             for(int i=0;i<10;i++)
             {
                 if(a[i]%2==1)
                 {
                     c++;
                 }
                 if(c>1)
                 {
                     System.out.print(1);
                     return;
                 }
             }
             System.out.println(2);
         }
     }
}