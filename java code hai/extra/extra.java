// construtor chaining
import java.lang.*;

class box{
    int l,w,h;
    box(){
        this.l=1;
        this.w=1;
        this.h=1;
        System.out.println("box constructor called");
    }
    box(int l,int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    void get(){
        System.out.println(l+"\n"+w+"\n"+h);
    }
    void vol(){
        System.out.println(l*w*h);
    }
}
class d extends box{
    int wt;
    d(){ //non parameterized constructor chaining
        this.wt=0;
    }
   d(int l,int w,int h,int wt){ //parameterized constructor chaining
        super(l,w,h);
       this.wt=wt;
    }
    void get(){
        System.out.println(l+"\n"+w+"\n"+h+"\n"+wt);
    }
}
public class extra{
    public static void main(String[] args) {
       d obj1=new d(0, 0, 0, 0);
        d obj2=new d();
       obj1.get();
        obj2.get();
    }
}