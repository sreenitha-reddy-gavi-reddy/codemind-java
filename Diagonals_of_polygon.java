import java.util.Scanner;
class diagonals
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,dia;
        n=sc.nextInt();
        dia=(n*(n-3))/2;
        System.out.println(dia);
    }
}