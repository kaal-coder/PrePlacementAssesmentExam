import java.util.*;
public class Number_6{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         task(s , 0 , "");
     }
     static void task(String s , int i , String cur)
     {
         if(i==s.length())
         {
             System.out.println(cur);
             return;
         }
         task(s,i+1,s.charAt(i)+cur);
         task(s,i+1,cur);
     }
}