// WAP to show the use of class, object and constructor in java. 
// Create a box class with variables length, width, height and functions set(), get(), volume().
class box
{
    protected int length,breadth,height;

    box(int x,int y,int z)
    {
        length=x;
        breadth=y;
        height=z;
    }
    public void set(int x,int y,int z)
    {
        length=x;
        breadth=y;
        height=z;
    }
    public void get()
    {
        System.out.println("length:"+ length);
        System.out.println("breadth:"+ breadth);
        System.out.println("height:"+ height);
    }
    public void volume()
    {
        System.out.println("Area:"+ length*breadth*height);
    }
}
class code1
{
    public static void main(String args[])
    {
        box b1 =new box(1,2,3);
        b1.get();
        b1.volume();

        b1.set(3,4,45);
        b1.volume();

    }
}