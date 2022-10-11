import java.util.Scanner;
class countns
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,odd=0,eve=0;
        int []arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                eve+=1;
            }
            else
            {
                odd+=1;
            }
        }
        System.out.print(eve+" ");
        System.out.print(odd+" ");
    }
}