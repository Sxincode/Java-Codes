// WAP to show the use of throw and throws keyword in java

// throw is used to throw exception inside try block 
// throws is used to throw exception that can occur in the function
import java.util.Scanner;
public class code11
{
    public static void fun(int x) throws IllegalAccessException
    {
        if(x==0)
        {
            throw new ArithmeticException("Hello");
        }
        if(x==1)
        {
            throw new IllegalAccessException("hehe");
        }
    }
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        try
        {
            fun(a);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e+" Caught arithmetic exception!");
        }
        catch (IllegalAccessException e)
        {
            System.out.println(e+" Caught IllegalAccessException!");
        }
    }
}