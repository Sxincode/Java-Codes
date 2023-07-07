//  WAP to show function overloading in java.

import java.util.Scanner;
public class code2
{
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st no:");
        a=sc.nextInt();
        System.out.println("Enter 2nd no:");
        b=sc.nextInt();
        System.out.println("Enter 3rd no:");
        c=sc.nextInt();

        add(a,b);
        add(a,b,c);


    }
}