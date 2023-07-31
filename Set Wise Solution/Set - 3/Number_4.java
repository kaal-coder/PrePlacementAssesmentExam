import java.util.*;
public class Number_4{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int c[] = new int[26];
         for(char p:s.toCharArray())
         {
             c[p-'a']++;
         }
         int f=0;
         for(int i=0;i<26;i++)
         {
             if(c[i]==1)
             {
                 f++;
             }
         }
         System.out.println(f);
     }
}