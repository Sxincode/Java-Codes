// WAP  to show the use of super keyword in java.

//super keyword is used when base and derived class has variable or functions with same name.
//super is used to access members of base class with same name


class d1
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
class d2 extends d1
{
    protected int wt;
    public void set(int x,int y,int z,int j)
    {
        super.set(x,y,z);
        wt=j;
    }
    public void get()
    {
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(wt);
    }
    public void density()
    {
        System.out.println(wt/(l*w*h));
    }
}
class d3 extends d2
{
    protected String color;
    public void set(int x,int y,int z,int j,String s)
    {
        super.set(x,y,z,j);
        color=s;
    }
    public void get()
    {
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(wt);
        System.out.println(color);
    }
}
public class code7
{
    public static void main(String args[])
    {
       
        d3 obj3=new d3();

        obj3.set(1,2,3,4,"black");
        obj3.get();
    }
}