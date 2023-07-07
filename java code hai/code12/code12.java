// WAP to show to create a thread in java

class task1
{
    public void func()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(i);
        }
    }
}
class task2
{
    public void func()
    {
        for(int i=0;i<26;i++)
        {
            System.out.println((char)(65+i));
        }
    }
}
class thread1 extends Thread
{
    task1 task_obj;
    thread1(task1 t1)
    {
        task_obj=t1;
    }
    public void run()
    {
        task_obj.func();
    }
}
class thread2 extends Thread
{
    task2 task_obj;
    thread2(task2 t2)
    {
        task_obj=t2;
    }
    public void run()
    {
        task_obj.func();
    }
}
public class code12
{
    public static void main(String[] args)
    {
        task1 obj1=new task1();
        task2 obj2=new task2();

        thread1 t1=new thread1(obj1);
        thread2 t2=new thread2(obj2);

        t1.start();
        t2.start();
    }
}