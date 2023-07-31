import java.util.*;
class Number_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int v=a[i];
            int j=i-1;
            while(j>=0 && a[j]>v)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=v;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}