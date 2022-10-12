import java.util.Scanner;
class pair
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int mid=n/2;
        i=0;
        while(i<mid)
        {
            System.out.print(a[i]+" "+a[n-i-1]+" ");
            i+=1;
        }
        if(n%2!=0)
        {
            System.out.print(a[mid]+" "+0+" ");
        }
    }
}