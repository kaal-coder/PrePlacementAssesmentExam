import java.util.*;
public class Number_13{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int b[]=new int[n+1];
         int pos=sc.nextInt();
         int ele=sc.nextInt();
         if(pos<0)
         {
             System.out.println("UnderFlow");
         }
         else if(pos>n)
         {
             System.out.println("OverFlow");
         }
         else if(pos==n)
         {
             for(int i=0;i<n;i++)
             {
                 b[i]=a[i];
             }
             b[n]=ele;
             for(int j:b)
             {
                 System.out.print(j+" ");
             }
         }
         else
         {
             int i=n;
             while(i>pos)
             {
                 b[i]=a[i-1];
                 i--;
             }
             b[i]=ele;
             i--;
             while(i>=0)
             {
                 b[i]=a[i];
                 i--;
             }
             for(int j:b)
             {
                 System.out.print(j+" ");
             }
         }
     }
}