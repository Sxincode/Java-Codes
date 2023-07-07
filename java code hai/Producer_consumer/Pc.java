class Task{
    int x;
    int turn;
    Task(){
        turn='p';
    }
    synchronized public void Producer(int i)
    {
        while(turn=='c') {
            try
            {
                wait();//wait can have Interrupted Exception so kept inside try block
            }
            catch(InterruptedException e){
                
            }
        }
        System.out.println("Producer"+i);
        x=i;
        turn='c';
        notify();
    }
    synchronized public void Consumer()
    {
        while(turn=='p'){
            try{
                wait();
            }
            catch(InterruptedException e){
                
            }
        }
        System.out.println("Consumer" + x);
        turn='p';
        notify();
    }
}
class Thread1 extends Thread{
    Task obj_task;
    // Thread obj_thread;
    Thread1(Task obj)
    {
        obj_task=obj;
        // obj_thread=new Thread(this);
        // obj_thread.start();
    }
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            obj_task.Producer(i);
        }
    }
}
class Thread2 extends Thread{
    // Thread obj_thread;
    Task obj_task;
    Thread2(Task obj){
        obj_task=obj;
        // obj_thread=new Thread(this);
        // obj_thread.start();
    }
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            obj_task.Consumer();
        }
    }
}
public class Pc
{
	public static void main(String[] args) {
		Task obj=new Task();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		// System.out.println("Hello");
        t1.start();
        t2.start();
	}
}