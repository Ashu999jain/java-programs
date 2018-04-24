class Callme
{
 void call(String msg) {
System.out.print("[" + msg);
try {
Thread.sleep(1000);
} catch(InterruptedException e) {
System.out.println("Interrupted");
}
System.out.println("]");
}
}

class Caller implements Runnable
{
    Callme cal;
    String msg;
    Caller(Callme c,String msg)
    {
        cal = c;
        this.msg = msg;
    }
    public void run()
    {
        cal.call(msg);
    }
}
public class Synch
{
    public static void main(String [] args)
    { Callme c = new Callme();
        Thread t1 = new Thread(new Caller(c,"hello"));
         Thread t2 = new Thread(new Caller(c,"java"));
          Thread t3 = new Thread(new Caller(c,"world"));
        
          t1.start();
          try {
            
             t2.join();
              
        } catch (InterruptedException ex) {
           System.out.println("error in join");
        }
          
          t2.start();
          t3.start();
        
}}