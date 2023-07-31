import java.util.*;
public class Number_11{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[10];
         while(n!=0)
         {
             a[n%10]++;
             n/=10;
         }
         StringBuilder nm=new StringBuilder();
         for(int i=1;i<10;i++)
         {
             for(int j=1;j<=a[i];j++)
             {
                 nm.append(i);
                 if(nm.length()==0 || a[0]==0)
                 {
                     continue;
                 }
                 else
                 {
                     for(int f=1;f<=a[0];f++)
                     {
                         nm.append(0);
                     }
                     a[0]=0;
                 }
             }
         }
         System.out.println(nm);
     }
}