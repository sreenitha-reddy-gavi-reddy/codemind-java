import java.util.Scanner;
class arrrrr
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,n,sum=0;
        float avg;
        int []arr=new int[100];
        int []temp=new int[100];
        int []res=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg=(float)sum/n;
        System.out.printf("%.2f",avg);
    }
}