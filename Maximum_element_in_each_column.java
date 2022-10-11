import java.util.Scanner;
class maxc
{
    public static void main(String args[])
    {
        int m,n,i,j,max;
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[100][100];
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            max=0;
            for(j=0;j<m;j++)
            {
                if(a[j][i]>max)
                {
                    max=a[j][i];
                }
            }
            System.out.println(max);
        }
    }
}