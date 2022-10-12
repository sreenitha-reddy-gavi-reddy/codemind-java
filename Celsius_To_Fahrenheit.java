import java.util.Scanner;
class heat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f,c;
        c=sc.nextFloat();
        f=(float)(c*1.8)+32;
        System.out.format("%.2f",f);
    }
}