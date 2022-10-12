import java.util.Scanner;
class anb
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int n,i,d=0;
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
                    d=1;
                    System.out.print(arr[i]+" ");
                }
            }
            if(d==0)
            {
                System.out.print("-1");
            }
        }
        else
        
        {
            for(i=0;i<n;i++)
            {
                if(arr[i]<b || arr[i]>a)
                {
                    d=1;
                    System.out.print(arr[i]+" ");
                }
            }
            if(d==0)
            {
                System.out.print("-1");
            }
        }
    }
}