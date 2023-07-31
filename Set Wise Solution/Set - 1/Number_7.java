import java.util.*;
public class Number_7{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=Integer.MIN_VALUE,p=Integer.MIN_VALUE;
        if(n==1)
        {
            System.out.println("No second largest element");
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>s)
            {
                p=s;
                s=a[i];
            }
            else if(a[i]>p&&p!=s)
            {
                p=a[i];
            }
        }
        if(p==Integer.MIN_VALUE)
        {
            System.out.println("No second largest element");
        }
        else
        {
            System.out.println("The second largest element is "+p);
        }
     }
}