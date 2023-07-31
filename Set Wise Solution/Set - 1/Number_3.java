import java.util.*;
public class Number_3{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n==1)
        {
            System.out.println(a[0]);
        }
        else if(n==2)
        {
            if(a[0]==a[1])
            {
                System.out.println(a[0]);
            }
            else
            {
                System.out.println(a[0]+ " "+a[1]);
            }
        }
        else
        {
            for(int i=1;i<n-1;i++)
            {
                if(a[i]==a[i-1])
                {
                    a[i-1]=a[i];
                    for(int j=i;j<n-1;j++)
                    {
                        a[j]=a[j+1];
                    }
                    a[n-1]=0;
                }
            }
            for(int i=0;i<n-1;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
     }
}