import java.util.*;
public class Number_14{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[] = new int[n];
         Map<Integer,Integer> nm=new HashMap<>();
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
             nm.put(a[i],0);
         }
         int m=sc.nextInt();
         int b[] = new int[m];
         List<Integer> kk=new ArrayList<>();
         for(int i=0;i<m;i++)
         {
             b[i]=sc.nextInt();
             if(nm.containsKey(b[i]))
             {
                 kk.add(b[i]);
             }
         }
         int f=kk.size();
         for(int i=0;i<f;i++)
         {
             System.out.print(kk.get(i));
         }
     }
}