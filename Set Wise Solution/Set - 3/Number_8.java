import java.util.*;
public class Number_8{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         Arrays.sort(a);
         int l=0,h=n-1;
         int x=sc.nextInt();
         while(l<=h)
         {
             int m=(l+h)/2;
             if(a[m]==x)
             {
                 System.out.println("Found");
                 return;
             }
             else if(a[m]<x)
             {
                 l=m+1;
             }
             else
             {
                 h=m-1;
             }
         }
         
         System.out.println("Not Found");
     }
}