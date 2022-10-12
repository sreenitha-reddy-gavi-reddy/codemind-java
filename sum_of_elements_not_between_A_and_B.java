import java.util.Scanner;
class sumanb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int n,i,sum=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            for(i=0;i<n;i++)
            {
                if(arr[i]<a || arr[i]>b)
                {
                    sum+=arr[i];
                }
            }
            System.out.println(sum);
        }
        else
        {
            for(i=0;i<n;i++)
            {
                if(arr[i]<b || arr[i]>a)
                {
                    sum+=arr[i];
                }
            }
            System.out.println(sum);
        }
    }
}