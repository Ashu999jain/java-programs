
class ThreadDemo implements Runnable
{
Thread t;
String name;
ThreadDemo(String s)
{
name =s ;
t = new Thread(this , s);
System.out.println("the current thread is :  "+t);
t.start(); 
}
public void run()
{
for(int i=0;i<4;i++)
{
System.out.println(name+""+i);
try
{
t.sleep(500);
}
catch(Exception e)
{
System.out.println("error in sleep function calling");
}
}
}

public static void main(String [] args)
{
ThreadDemo t1 =new ThreadDemo("one");
ThreadDemo t2 =new ThreadDemo("two");
ThreadDemo t3 =new ThreadDemo("three");
System.out.println("is the thread one is live?"+t1.t.isAlive());
System.out.println("is the thread two is live ?"+t2.t.isAlive());
System.out.println("is the thread three is live ?"+t3.t.isAlive());
try{
t1.t.join();
t2.t.join();
t3.t.join();
}
catch(Exception e)
{System.out.println("join is not working");
}
System.out.println("is the thread one is live?"+t1.t.isAlive());
System.out.println("is the thread two is live ?"+t2.t.isAlive());
System.out.println("is the thread three is live ?"+t3.t.isAlive());

}
}