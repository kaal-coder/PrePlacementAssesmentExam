import java.util.*;
public class Number_7{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         LinkedHashSet<Character> nm=new LinkedHashSet<>();
         int c[] = new int[26];
         for(char k:s.toCharArray())
         {
             if(k!=' ')
             {
                 nm.add(k);
                 c[k-'a']++;
             }
         }
         for(Character k:nm)
         {
             System.out.println(k + " "+(c[k-'a']));
         }
     }
}