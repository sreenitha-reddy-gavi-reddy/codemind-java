import java.util.Scanner;
class Secret
{
    public static void main(String args[])
    {
        int n,d,i,c,temp,rev;
        int []arr=new int[100];
        c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            rev=0;
            temp=arr[i];
            while(arr[i]!=0)
            {
                d=arr[i]%10;
                rev=(rev*10)+d;
                arr[i]/=10;
            }
            if(rev==temp)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}