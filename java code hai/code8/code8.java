// WAP to show the use of super() method  in java.


//constructor chaining with parameterized constructor
//parameterized constructors are created
//When base class has a parameterized constructor, derived class constructor must call super() 


class d1
{
    protected int l,w,h;
    d1(int x,int y,int z)
    {
        System.out.println("d1 constructor!");
        l=x;
        w=y;
        h=z;
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
    d2(int x,int y,int z,int j)
    {
        super(x,y,z);   //should be first statement inside constructor
        wt=j;
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
    d3(int x,int y,int z,int j,String s)
    {
        super(x,y,z,j);
        color=s;
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
class code8
{
    public static void main(String args[])
    {
        d3 obj =new d3(1,2,3,5,"black");
        obj.get();
        //d3() calls d2() through super()
        // d2() calls d1() through super()
        // order from: top to bottom
    }
}