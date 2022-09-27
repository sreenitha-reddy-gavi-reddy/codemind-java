import java.util.Scanner;
class Comb{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<=100 && n>=3)
        {
            //c=sc.nextInt();
            for(int i=1;i<=2*n-1;i++)
            {
                int k=i<=n?i:n-i%n;
                for(int j=1;j<=k;j++)
                     System.out.print("*");
                System.out.println();
            }
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
        sc.close();
    }
}