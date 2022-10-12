import java.util.Scanner;
class mix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,d,ev=0,od=0;
        n=sc.nextInt();
        r=(int)Math.log10(n)+1;
        while(n!=0)
        {
            d=n%10;
            if(d%2==0)
            {
                ev+=1;
            }
            else
            {
                od+=1;
            }
            n/=10;
        }
        if(ev==r)
        {
            System.out.println("Even");
        }
        else if(od==r)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}