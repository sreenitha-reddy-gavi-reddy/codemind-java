import java.util.Scanner;
class evennnnn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        int []arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                c=1;
                System.out.print("False");
                break;
            }
        }
        if(c==0)
        {
            System.out.print("True");
        }
    }
}