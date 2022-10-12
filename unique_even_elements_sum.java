import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum=0;
        int []arr=new int[100];
        int []temp=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            temp[i]=arr[i];
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(temp[i]==temp[j])
                {
                    temp[j]=-j;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(temp[i]%2==0 && temp[i]>=0)
            {
                sum+=temp[i];
            }
        }
        System.out.print(sum);
    }
}