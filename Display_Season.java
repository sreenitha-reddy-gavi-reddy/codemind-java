import java.util.Scanner;
class Season
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a==4 || a==5 || a==6)
        {
            System.out.println("Summer");
        }
        else if(a==7 || a==8 || a==9 || a==10)
        {
            System.out.println("Rainy");
        }
        else if(a==11 || a==12 || a==1)
        {
            System.out.format("Winter");
        }
        else if(a==2 || a==3)
        {
            System.out.println("Spring");
        }
        else
        {
            System.out.println("-1");
        }
        sc.close();
    }
}