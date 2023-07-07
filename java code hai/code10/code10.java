// WAP to show the use of interface in java.

//interface contains all undefined functions.

interface myinterface
{
    public void set(int x,int y,int z);
    public void get();
}

class box implements myinterface
{
    protected int l,w,h;
    public void set(int x,int y,int z)
    {
        l=x;
        w=y;
        h=z;
    }
    public void get()
    {
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
    public void vol()
    {
        System.out.println(l*w*h);
    }
}

public class code10
{
    public static void main(String args[])
    {
        box b=new box();
        b.set(1,2,3);
        b.get();
        b.vol();
    }
}