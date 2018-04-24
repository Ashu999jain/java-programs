package multiThreading;
class ThreadClassdemo extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Thread.getName()"+i);
}
}

public static void main(String [] args)
{
Thread t1 = new  ThreadClassdemo();
Thread t2 = new   ThreadClassdemo();
t1.setName("boy");
t2.setName("girl");
t1.start();
t2.start();
}
}