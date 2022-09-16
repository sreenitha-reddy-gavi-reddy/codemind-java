import java.util.Scanner;
class Disk
{
    public static void main(String args[])
    {
        int a,b,c,d,p,q,r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        p=c*512;
        q=p*b;
        r=q*a;
        d=r*2;
        System.out.print(d);
        sc.close();
    }
}