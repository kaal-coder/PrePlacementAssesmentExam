import java.util.*;
public class Number_5{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int x=sc.nextInt();
         Map<Integer,Integer> nm=new HashMap<>();
         int c=0;
         for(int i=0;i<n;i++)
         {
             if(nm.containsKey(x-a[i]))
             {
                 c++;
             }
             nm.put(a[i] , nm.getOrDefault(a[i],0)+1);
         }
         System.out.println(c);
     }
}