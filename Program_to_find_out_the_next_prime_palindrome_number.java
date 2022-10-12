import java.util.Scanner;
class prime
{
    public static boolean is_it_prime(int n)
    {
        int j;
        for(j=2;j<=Math.sqrt(n);j++)
        {
            if(n%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(int n)
    {
        int rev=0,d;
        int temp=n;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(rev==temp)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(true)
        {
            n+=1;
            if(palindrome(n))
            {
                if(is_it_prime(n))
                {
                    System.out.println(n);
                    break;
                }
            }
        }
    }
}