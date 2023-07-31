import java.util.*;
public class Number_8{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                if(i!=j)
                {
                    int d=a[i];
                    a[i]=a[j];
                    a[j]=d;
                }
                j++;
            }
        }
        for(int i:a)
        {
            System.out.print(i+ " ");
        }
     }
}