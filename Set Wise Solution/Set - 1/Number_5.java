import java.util.*;
public class Number_5{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String p=String.valueOf(n&1);
        if(p.contains("0"))
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
     }
}