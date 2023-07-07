import java.lang.*;
// import java.
class task
{
    static char turn ='o';
    
   synchronized public void printEven(int i) throws InterruptedException
    {
        while(turn=='o'){wait();}
        System.out.println(i+" ");
        turn ='o';
        notify();
    }
    synchronized public void printOdd(int i) throws InterruptedException
    {
        while(turn=='e'){wait();}
        
        System.out.println(i+" ");
        turn ='e';
        notify();
    }
    
}
class thread1 extends Thread
{
    task task_obj;
    thread1(task obj)
    {
        task_obj=obj;
        Thread t=new Thread(this);
        t.start();
    }
    public void run() 
    {
        for(int i=0;i<=10;i+=2)
        {
            try
            {
                         task_obj.printOdd(i);
   
            }catch(Exception e) {}
        }
    }
}
class thread2 extends Thread
{
    task task_obj;
    thread2(task obj)
    {
        task_obj=obj;
        Thread t=new Thread(this);
        t.start();
        
    }
        public void run() 
        {
            for(int i=1;i<=10;i+=2)
            {
                
            try
            {
                         task_obj.printEven(i);
            }
            catch(Exception e) {}
            }
        }
    
}

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
	    task obj=new task();
	    new thread1(obj);
	    new thread2(obj);
	    
	    
	}
	
}

