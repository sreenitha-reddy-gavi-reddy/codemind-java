import java.util.Scanner;
class Bill
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        String d=s.nextLine();
        int n=s.nextInt();
        float amt;
        if(n<200)
        amt=n*1.20f;
        else if(n>200 && n<=400)
        amt=n*1.50f;
        else if(n>=400 && n<=600)
        amt=n*1.80f;
        else
        amt=n*2.00f;
        if(amt>400)
        amt=amt+0.15f*amt;
        else
        amt=amt+100;
        System.out.format("%.2f",+amt);
    }
}