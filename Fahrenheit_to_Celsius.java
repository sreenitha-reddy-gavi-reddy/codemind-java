import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        double f,c;
        Scanner sc=new Scanner(System.in);
        f=sc.nextFloat();
        c=(f-32)/1.8;
        System.out.format("%.2f",c);
    }
}