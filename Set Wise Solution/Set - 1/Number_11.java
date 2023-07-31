import java.util.*;
public class Number_11{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        task(s , 0 , s.length());
        
     }
     static void task(String s , int i , int n)
     {
         if(i==n)
         {
             System.out.println(s);
         }
         for(int j=i;j<n;j++)
         {
             s=swap(s,i,j);
             task(s,i+1,n);
             s=swap(s,i,j);
         }
     }
     static String swap(String s , int i , int j)
     {
         char c[]=s.toCharArray();
         char m=c[i];
         c[i]=c[j];
         c[j]=m;
         return String.valueOf(c);
     }
}