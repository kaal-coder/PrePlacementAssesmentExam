import java.util.*;
public class Number_6{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         HashMap<Integer,Integer> nm=new HashMap<>();
         for(int i=0;i<n;i++)
         {
             if(nm.containsKey(a[i]))
             {
                 System.out.println(a[i]);
                 return;
             }
             nm.put(a[i],0);
         }
         System.out.println("Not found");
     }
}
