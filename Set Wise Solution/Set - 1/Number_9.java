import java.util.*;
public class Number_9{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=0;j<m;j++)
            {
                s+=a[i][j];
            }
            System.out.println("The sum of row "+(i+1)+ " is "+s);
        }
        for(int i=0;i<m;i++)
        {
            int s=0;
            for(int j=0;j<n;j++)
            {
                s+=a[i][j];
            }
            System.out.println("The sum of column "+(i+1)+ " is "+s);
        }
     }
}