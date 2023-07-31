import java.util.*;
public class Number_3{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String p="",f="";
         int k=s.length();
         for(int i=k-1;i>=0;i--)
         {
             char c=s.charAt(i);
             if(c==' ')
             {
                 f=f+p+" ";
                 p="";
             }
             else
             {
                 p=c+p;
             }
         }
         f=f+p;
         System.out.println(f);
     }
}