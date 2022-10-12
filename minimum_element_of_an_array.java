import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max;
        int []arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}