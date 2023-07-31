import java.util.*;
class Number_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(sort(s));
    }
    public static String sort(String s)
    {
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
}