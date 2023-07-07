class adder<T>
{
    T a,b;
    adder(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {

        System.out.println(a+" "+b);
        // return (Integer.valueOf(a)+Integer.valueOf(b));
        // int c=a+b;
        // Integer x=Integer.valueOf(c);
        // return x;
        // return a+b;
    }
}

public class extra1
{
    public static void main(String[] s)
    {
        adder<Integer> obj1=new adder<Integer>(10,20);
        // System.out.println(obj1.add());
        obj1.add();
        adder<String> obj2=new adder<String>("Sxin","sai");
        obj2.add();
    }
}