import java.util.*;
public class Number_10{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         List<Integer> nm=new ArrayList<>();
         int k=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             if(n%i==0)
             {
                 nm.add(i);
             }
         }
         System.out.println(nm.get(k-1));
     }
}