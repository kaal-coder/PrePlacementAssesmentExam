import java.util.*;

public class Number_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c, n = 15;
        if (n == 1) 
        {
            System.out.println("0");
            return;
        } 
        else if (n == 2) 
        {
            System.out.println("1");
            return;
        } 
        else 
        {
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= n; i++) 
            {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}