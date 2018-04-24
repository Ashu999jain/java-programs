package multiThreading;
class MainThread
{
public static void main(String [] args)
{
Thread t1 = Thread.currentThread();
System.out.println("the main thread is  "+t1);
t1.setName("java thread");
System.out.println("the new name of main thread is "+t1);
}
}