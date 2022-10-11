import java.util.Scanner;
class Palin
{
    public static void main(String args[])
    {
        int n,d,temp,rev;
        rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n/=10;
        }
        if(rev==temp)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}