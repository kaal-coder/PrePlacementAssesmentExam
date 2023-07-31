import java.util.*;
public class Number_5{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         LinkedHashSet<Character> nm=new LinkedHashSet<>();
         for(char k:s.toCharArray())
         {
             nm.add(k);
         }
         StringBuilder kk=new StringBuilder();
         for(Character c:nm)
         {
             kk.append(c);
         }
         System.out.println(kk.toString());
     }
}