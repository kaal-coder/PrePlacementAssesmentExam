import java.util.*;
public class Number_9{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         Map<Integer,Integer> nm=new HashMap<>();
         for(int i=0;i<17;i++)
         {
             a[i]=sc.nextInt();
             nm.put(a[i] , nm.getOrDefault(a[i] ,0)+1);
         }
         
         for(int k:nm.keySet())
         {
             System.out.println(k+ " " + nm.get(k));
         }
     }
}