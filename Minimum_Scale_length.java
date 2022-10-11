import java.util.Scanner;
class minnscalelength
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c,d=0,res=0,j;
        n=sc.nextInt();
        int []arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=2;i<=arr[0];i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(arr[j]%i==0)
                {
                    c+=1;
                }
            }
            if(c==n)
            {
                res=i;
                d=1;
            }
        }
        if(d==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println(res);
        }
    }
}