import java.util.Scanner;
class Hand
{
    public static  void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=(a*(a-1))/2;
        System.out.println(b);
        sc.close();
    }
}