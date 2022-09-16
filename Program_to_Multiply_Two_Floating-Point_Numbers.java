import java.util.Scanner;
class Product
{
    public static void main(String args[])
    {
        Double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=a*b;
        System.out.format("%.2f",c);
        sc.close();
    }
}