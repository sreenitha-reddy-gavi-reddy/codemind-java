import java.util.Scanner;
class Division
{
    public static void main(String args[])
    {
        int n,i,c=0,k,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a%k==0)
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}