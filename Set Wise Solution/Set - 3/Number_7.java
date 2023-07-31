import java.util.*;
public class Number_7{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         Arrays.sort(a);
         int k=sc.nextInt();
         System.out.println(a[k-1]);
     }
}