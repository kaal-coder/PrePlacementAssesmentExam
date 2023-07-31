import java.util.*;
public class Number_4{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n==0 && m==1)
        {
            System.out.println("Yes");
            return;
        }
        int a=0,b=1,c=1;
        while(c!=n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(c+a==m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
     }
}