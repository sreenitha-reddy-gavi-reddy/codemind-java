import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Double s,a,b,c,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        e=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",e);
        sc.close();
    }
}