import java.util.Scanner;
class small
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0,c=0;
        float avg;
        int []arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(arr[i]<=avg)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}