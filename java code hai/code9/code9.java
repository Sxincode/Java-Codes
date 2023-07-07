// WAP to show the use of abstract class in java.

//abstract class are classes with atleast one abstract functions.
//it can have abstract as well as concrete functions.
//abstract classes are meant to be inherited.
//abstract classes are used to provide abstraction. The derived class must define the abstract functions in abstract class

abstract class base
{
    abstract public void get(); //abstract function

    // concrete function
    final public static void fun()
    {
        System.out.println("final static function called");
    }
    // constructor
    base()
    {
        System.out.println("Abstract class constructor!");
    }
}
class d extends base
{
    protected int l,w,h;

    public void set(int x,int y,int z)
    {
        l=x;
        w=y;
        h=z;
    }

    // defining abstract function.

    public void get()
    {
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
}
public class code9
{
    public static void main(String  args[])
    {
        d obj=new d();
        obj.set(3,4,2);
        obj.get();
        
        base.fun(); //calling static function using base class name
    }
}