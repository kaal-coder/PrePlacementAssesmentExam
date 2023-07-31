import java.util.*;
public class Number_2{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String p="";
         int k=s.length();
         for(int i=0;i<k;i++)
         {
             p=s.charAt(i)+p;
         }
         if(s.equals(p))
         {
             System.out.println("Palindrome");
         }
         else
         {
             System.out.println("Not Palindrome");
         }
     }
}