import java.util.*;
class Number_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palin(s,"",0));
    }
    static boolean palin(String s , String p , int i)
    {
        if(i==s.length())
        {
            return s.equals(p);
        }
        return palin(s,s.charAt(i)+p,i+1);
    }
}