import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,b,c=0,j,count=0;
        int []arr=new int[100];
        int []temp=new int[100];
        int []res=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}