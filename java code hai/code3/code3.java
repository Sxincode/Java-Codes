// WAP to show the use of static keyword in java.

class box
{
    private static int l,w,h;
    private static String color;

    static
    {
        System.out.println("Static block");
        color="Black";
    }

    public static void set(int x,int y,int z)
    {
        l=x;
        w=y;
        h=z;
    }
    public static void get()
    {
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(color);
    }
}
public class code3
{
    public static void main(String args[])
    {
        box b1=new box();
        box.set(1,2,3);
        box.get();
        b1.get();
        //same value beacause the static variable are shared among the object and they belongs to class
        // So static variable,method can be invoked using class name.
    }
}