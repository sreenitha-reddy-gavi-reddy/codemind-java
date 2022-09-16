import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        Double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=(a+b)/2;
        System.out.format("%.4f",c);
        sc.close();
    }
}