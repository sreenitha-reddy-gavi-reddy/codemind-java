import java.util.Scanner;
class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         char ch=sc.next().charAt(0);
        if(ch=='A'|| ch=='a'|| ch=='e' ||ch=='E'||ch=='I' || ch=='i' || ch=='o' || ch=='O' ||ch=='u' || ch=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
        sc.close();
    }
}