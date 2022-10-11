import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,t;
        int[]arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]<=t)
            {
                c+=1;
            }
            else
            {
                c+=2;
            }
        }
        System.out.println(c);
    }
}