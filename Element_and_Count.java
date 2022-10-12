import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c,j;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=1;
            if(a[i]>0)
            {
                for(j=i+1;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        c+=1;
                        a[j]=-1;
                    }
                }
                System.out.print(a[i]+" "+c+" ");
            }
        }
    }
}