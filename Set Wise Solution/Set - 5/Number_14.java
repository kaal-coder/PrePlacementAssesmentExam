import java.util.*;
class Number_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double a[][] = new double[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextDouble();
            }
        }
        n=sc.nextInt();
        m=sc.nextInt();
        double b[][] = new double[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=sc.nextDouble();
            }
        }
        double c[][] = new double[a.length][b[0].length];
        c=multiplyMatrix(a,b);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                b[i][j]=sc.nextDouble();
            }
        }
    }
    public static double[][] multiplyMatrix(double a[][] , double b[][])
    {
        int n=a[0].length;
        int m=b.length;
        if(n!=m)
        {
            return a;
        }
        double c[][] = new double[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<b.length;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}