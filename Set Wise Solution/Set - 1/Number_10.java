import java.util.*;
public class Number_10{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a[] = new int[26];
        for(char c:s.toCharArray())
        {
            a[c-'a']++;
        }
        int m=Integer.MAX_VALUE,n=Integer.MIN_VALUE;
        for(int i=0;i<26;i++)
        {
            if(n<a[i])
            {
                n=a[i];
            }
            if(m>a[i]&&a[i]!=0)
            {
                m=a[i];
            }
        }
        if(m==n)
        {
            System.out.println("The frequencies are same");
        }
        else
        {
            System.out.println("The maximum frequency is "+n + " the minimum frequency is "+m);
        }
     }
}