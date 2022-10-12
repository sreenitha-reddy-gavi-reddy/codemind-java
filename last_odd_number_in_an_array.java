import java.util.Scanner;
class offfddd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        int []arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}