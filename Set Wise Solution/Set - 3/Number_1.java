import java.util.*;
public class Number_1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         List<Integer> nm=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             nm.add(sc.nextInt());
         }
         int x=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             if(x==nm.get(i))
             {
                 nm.remove(x);
             }
         }
     }
}