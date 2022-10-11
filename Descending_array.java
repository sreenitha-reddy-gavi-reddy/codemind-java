import java.util.Scanner;
class Wave
{
    public static void main(String args[])
    {
        int n,d,i,c,temp,rev;
        int []a=new int[100];
        c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]<a[i+1])
            {
                c=1;
                System.out.println("no");
                break;
            }
        }
        if(c==0)
        {
            System.out.println("yes");
        }
    }
}