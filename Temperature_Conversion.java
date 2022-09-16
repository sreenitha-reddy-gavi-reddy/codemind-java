import java.util.Scanner;
class Temp
{
    public static void main(String args[])
    {
        Double a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=32+(a*9/5);
        System.out.format("%.2f",b);
        sc.close();
    }
}