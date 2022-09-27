import java.util.Scanner;
class Car
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            double x1=sc.nextInt();
            double x2=sc.nextInt();
            double y1=sc.nextInt();
            double y2=sc.nextInt();
            double a=x1/y1;
            double b=x2/y2;
            if(a<b)
            {
                System.out.println("1");
            }
            else
            {
                if(a>b)
                {
                    System.out.println("-1");
                }
                else
                {
                    System.out.println("0");
                }
            }
        }
    }
}