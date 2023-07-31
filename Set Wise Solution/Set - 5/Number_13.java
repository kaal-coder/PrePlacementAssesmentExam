import java.util.*;
class Number_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int d=sc.nextInt();
        int y=sc.nextInt();
        int a[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int b[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        int k=leap(y);
        int s=0;
        if(k==1)
        {
            for(int i=1;i<m;i++)
            {
                s+=b[i-1];
            }
            s+=d;
        }
        else
        {
            for(int i=1;i<m;i++)
            {
                s+=b[i-1];
            }
            s+=d;
        }
        System.out.println(s);
    }
    static int leap(int year)
    {
        return year%400==0||(year%100!=0&&year%4==0) ? 1 : 0;
    }
}