import java.util.*;
public class Number_4{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s="Welcome to iter";
         String p="";
         int k=s.length();
         for(int i=0;i<k;i++)
         {
             char c=s.charAt(i);
             p=c+p;
             
         }
         System.out.println(p);
     }
}