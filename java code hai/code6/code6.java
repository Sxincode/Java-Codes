//  WAP to show constructor chaining in java
class d1
{
    protected int l,w,h;
    d1()
    {
        System.out.println("d1 constructor!");
    }
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
}
class d2 extends d1
{
    protected int wt;
    d2()
    {
        System.out.println("d2 constructor!");
    }
    public void set(int x,int y,int z,int j)
    {
        l=x;
        w=y;
        h=z;
        wt=j;
    }
    public void get()
    {
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(wt);
    }
}
class d3 extends d2
{
    protected String color;
    d3()
    {
        System.out.println("d3 constructor!");
    }
    public void set(int x,int y,int z,int j,String s)
    {
        l=x;
        w=y;
        h=z;
        wt=j;
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
class code6
{
    public static void main(String args[])
    {
        d3 obj =new d3();
        //d3() calls d2()
        // d2() calls d1()
        // order from: top to bottom
    }
}