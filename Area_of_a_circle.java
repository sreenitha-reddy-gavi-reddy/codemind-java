import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        double a,r,pi;
        pi=3.14;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        a=pi*r*r;
        System.out.format("%.2f",a);
        sc.close();
    }
}