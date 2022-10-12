import java.util.Scanner;
class Intrest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t,ci;
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();
        ci=p*Math.pow((1+r/100),t);
        System.out.format("%.2f",ci);
    }
}