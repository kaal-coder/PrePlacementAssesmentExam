import java.util.*;
public class Number_1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String p="";
         int k=s.length();
         for(int i=0;i<k;i++)
         {
             p=s.charAt(i)+p;
         }
         System.out.println(p);
     }
}